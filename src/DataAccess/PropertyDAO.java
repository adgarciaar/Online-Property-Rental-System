/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Photo;
import World.Property;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class PropertyDAO {
    
    public static final String DELETE_PROPERTIES = "update Property set deletion_status"
            + " = 'Deleted' where owner_iduser = ?";
    
    public static final String ADD_PROPERTY = "insert into property (type,address,"
            + "number_rooms,rent,deletion_status,location_idlocation,owner_iduser) "
            + "values (?, ?, ?, ?, 'Active', ?, ?);";
    
    public static boolean deletePropertiesByOwner(int idOwner){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;   
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(DELETE_PROPERTIES);
                      
            ps.setInt(1, idOwner);                
            
            ps.executeUpdate();
            
            connection.commit();
            
            JOptionPane.showMessageDialog(null, "The properties related to this account were deleted successfully"); 
            return true;
                    
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);             
            return false;
        }finally{
            try{
                ps.close();
                connection.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error: " + ex);               
            }
        }
    }
    
    public static boolean addProperty(Property property){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(ADD_PROPERTY);
                      
            ps.setString(1, property.getType());
            ps.setString(2, property.getAddress());
            ps.setInt(3, property.getNumber_rooms());
            ps.setLong(4, property.getRent());
            ps.setInt(5, property.getIdLocation());
            ps.setInt(6, property.getIdOwner());                            
            
            ps.executeUpdate();
            
            HashMap<Integer,Photo> listLocations;
            listLocations = property.getPhotos();
            
            Photo photo;
        
            Set set = listLocations.entrySet();        
            Iterator iterator = set.iterator();
            
            boolean b = true;

            while(iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry)iterator.next();               
                photo = (Photo) mentry.getValue();
                
                if (PhotoDAO.uploadPhoto(photo) == false){
                    b = false;                    
                }                        
            }
            
            if (b == false){
                JOptionPane.showMessageDialog(null, "Problem with image uploading");
                return false;
            }else{
                connection.commit();            
                JOptionPane.showMessageDialog(null, "Property was added successfully");
                return true;
            }
                    
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex); 
            return false;
            
        }finally{
            try{
                ps.close();
                connection.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error: " + ex);               
            }
        }         
    }
    
}
