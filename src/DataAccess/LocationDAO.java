/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Location;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class LocationDAO {
    
    public static final String SEARCH_LOCATIONS = "select idlocation, name, zipcode from Map_Location";
    
    public static HashMap<Integer, Location> retrieveLocations(){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        HashMap<Integer,Location> listLocations = new HashMap<Integer,Location>();
        
        try{
           
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(SEARCH_LOCATIONS);      
            
            rs = ps.executeQuery();

            Location location;      
            
            while (rs.next()){
                
                location = new Location();      
                
                location.setId(rs.getInt("idlocation"));
                location.setName(rs.getString("name"));
                location.setZipcode(rs.getInt("zipcode"));
                
                listLocations.put(location.getId(), location);
                
            }   
            
            rs.close();     
            
            return listLocations;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error" + ex);
            return null;
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);                           
            }            
        }
    }
    
}
