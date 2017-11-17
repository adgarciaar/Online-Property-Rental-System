/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Country;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class CountryDAO {
    
    public static final String SEARCH_COUNTRIES = "select idcountry, name from "
            + "Country order by idcountry asc";
    
    public static final String RETRIEVE_NAME_COUNTRY= "select name from "
            + "Country where idcountry = ?";
    
    public static LinkedHashMap<Integer, Country> retrieveCountries(){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        LinkedHashMap<Integer,Country> listCountries = new LinkedHashMap<>();
        
        try{
           
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(SEARCH_COUNTRIES);      
            
            rs = ps.executeQuery();

            Country country;      
            
            while (rs.next()){
                
                country = new Country();      
                
                country.setId(rs.getInt("idcountry"));
                country.setName(rs.getString("name"));                
                
                listCountries.put(country.getId(), country);
                
            }   
            
            rs.close();   
            
            return listCountries;
            
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
    
    public static String retrieveNameCountry(int idCountry){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
           
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(RETRIEVE_NAME_COUNTRY);     
            ps.setInt(1, idCountry);
            
            rs = ps.executeQuery();

            String nameLocation = null;      
            
            while (rs.next()){  
                nameLocation =rs.getString("name");
            }   
            
            rs.close();     
            
            return nameLocation;
            
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
