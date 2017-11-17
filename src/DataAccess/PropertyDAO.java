/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Photo;
import World.Property;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
            + "values (?, ?, ?, ?, 'Active', ?, ?)";
    
    public static final String SEARCH_LAST_ADDED_PROPERTY = "select MAX(idproperty) "
            + "from Property";
    
    public static final String SEARCH_PROPERTIES_BY_OWNER = "select idproperty, "
            + "type,address,number_rooms,rent,deletion_status,location_idlocation "
            + "from Property where owner_iduser = ? ";
    
    public static final String DELETE_PROPERTY = "update Property set deletion_status"
            + " = 'Deleted' where idproperty = ?";
    
    public static final String SEARCH_PROPERTIES_BY_CRITERIA = "select idproperty, "
            + "type,address,number_rooms,rent,deletion_status,location_idlocation, "
            + "owner_iduser from Property where deletion_status = 'Active'";
    
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
            
            connection.commit();
            
            
            ps = connection.prepareStatement(SEARCH_LAST_ADDED_PROPERTY);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){            
                property.setId(rs.getInt("MAX(idproperty)"));
            } 
            rs.close();
            
            
            LinkedHashMap<Integer,Photo> listLocations;
            listLocations = property.getPhotos();
            
            Photo photo;
        
            Set set = listLocations.entrySet();        
            Iterator iterator = set.iterator();
            
            boolean b = true;

            while(iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry)iterator.next();               
                photo = (Photo) mentry.getValue();
                photo.setPropertyId(property.getId());
                
                if (PhotoDAO.uploadPhoto(photo) == false){
                    b = false;                    
                }                        
            }
            
            if (b == false){
                JOptionPane.showMessageDialog(null, "Problem with image uploading");
                return false;
            }else{
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
    
    public static LinkedHashMap<Integer,Property> searchPropertiesByOwner(int idOwner, String order) throws IOException{
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
           
            connection = DBConnection.getConnection();
            
            String query = null;
            
            if (order.compareTo("Owner") == 0){
                query = SEARCH_PROPERTIES_BY_OWNER + "order by idproperty asc";
            }else{
                if (order.compareTo("NumberRooms") == 0){
                    query = SEARCH_PROPERTIES_BY_OWNER + "order by number_rooms asc";
                }else{
                    query = SEARCH_PROPERTIES_BY_OWNER + "order by rent asc";
                }                   
            }
            
            ps = connection.prepareStatement(query);
            
            ps.setInt(1, idOwner);
            
            rs = ps.executeQuery();
            
            LinkedHashMap<Integer,Property> listProperties = new LinkedHashMap<>();
            
            Property property;
            
            while (rs.next()){
                
                property = new Property();
                
                property.setId(rs.getInt("idproperty"));
                property.setType(rs.getString("type"));
                property.setAddress(rs.getString("address"));
                property.setNumber_rooms(rs.getInt("number_rooms"));
                property.setRent(rs.getLong("rent"));
                property.setDeletion_status(rs.getString("deletion_status"));
                property.setIdLocation(rs.getInt("location_idlocation"));
                property.setIdOwner(idOwner);
                
                LinkedHashMap<Integer, Photo> listPhotos;
                listPhotos = PhotoDAO.retrievePhotos(property.getId(),"Id");
                
                property.setPhotos(listPhotos);
                
                listProperties.put(property.getId(), property);
                
            }  
            
            rs.close();
            
            return listProperties;            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
            return null;    
            
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);                           
            }            
        }       
       
    }
    
    public static boolean deleteProperty(int idProperty){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;   
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(DELETE_PROPERTY);
                      
            ps.setInt(1, idProperty);                
            
            ps.executeUpdate();
            
            connection.commit();
            
            JOptionPane.showMessageDialog(null, "The property was deleted successfully"); 
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
    
    public static LinkedHashMap<Integer,Property> searchPropertiesByCriteria(String type,
            String numberRooms, String minRent,String maxRent,HashMap<Integer,String> listSelectedLocations) throws IOException{
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
           
            connection = DBConnection.getConnection();
            
            String query = SEARCH_PROPERTIES_BY_CRITERIA;
            
            if (type != null){
                query = query + " and type = ?";                               
            }else{
                type = "";
                query = query + " and (type = 'Apartment' or type = 'House' or type = ?)";                
            }
            
            if (numberRooms != null){
                query = query + " and number_rooms = ?";                
            }else{
                numberRooms = "1";
                query = query + " and (number_rooms = ? or number_rooms = ANY(select number_rooms from property))";
            }
            
            if (minRent != null && maxRent != null){
                query = query + " and (rent between = ? and ?)";                
            }else{
                minRent = "0";
                maxRent = "1";
                query = query + " and (rent = ? or rent = ? or rent = ANY(select rent from property))"; 
            }           
            
            if(listSelectedLocations.isEmpty() == false){
                
                query = query + " and (";
                
                int n = listSelectedLocations.size();
                
                for (int j=0; j<n; j++){         
                    if (j == n-1){
                        query = query + " location_idlocation = ?)";
                    }else{
                        query = query + " location_idlocation = ? or ";
                    }                                           
                }                
            }
            
            //System.out.println(query);
            
            query = query + " order by idproperty asc";
            
            ps = connection.prepareStatement(query);
                        
            ps.setString(1, type);
            ps.setInt(2, Integer.parseInt(numberRooms));
            ps.setLong(3, Long.parseLong(minRent));
            ps.setLong(4, Long.parseLong(maxRent));

            int i = 4;
            if(listSelectedLocations.isEmpty() == false){
                
                Set set = listSelectedLocations.entrySet();        
                Iterator iterator = set.iterator();

                while(iterator.hasNext()) {
                    
                    Map.Entry mentry = (Map.Entry)iterator.next(); 
                    i++;                    
                    ps.setInt(i, (int) mentry.getKey());
                }
                
            }
            
            rs = ps.executeQuery();
            
            LinkedHashMap<Integer,Property> listProperties = new LinkedHashMap<>();
            
            Property property;
            
            while (rs.next()){
                
                property = new Property();
                
                property.setId(rs.getInt("idproperty"));
                property.setType(rs.getString("type"));
                property.setAddress(rs.getString("address"));
                property.setNumber_rooms(rs.getInt("number_rooms"));
                property.setRent(rs.getLong("rent"));
                property.setDeletion_status(rs.getString("deletion_status"));
                property.setIdLocation(rs.getInt("location_idlocation"));
                property.setIdOwner(rs.getInt("owner_iduser"));
                
                LinkedHashMap<Integer, Photo> listPhotos;
                listPhotos = PhotoDAO.retrievePhotos(property.getId(),"Id");
                
                property.setPhotos(listPhotos);
                
                listProperties.put(property.getId(), property);                
            }  
            
            rs.close();
            
            return listProperties;            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
            return null;    
            
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);                           
            }            
        }       
       
    }
    
}
