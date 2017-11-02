/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Owner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class OwnerDAO {
    
    public static final String SEARCH_OWNER = "select count(*) from Property_Owner "
                    + "where username = ? and password = ?"; 

    public OwnerDAO() {
    }
    
    public static boolean searchOwner(String username, String password){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(SEARCH_OWNER);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            int number = 0;
            
            while (rs.next()){            
                number = rs.getInt("count(*)");
            }
            
            rs.close();
            
            if(number == 0){
                return false;
            }else{
                return true;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error" + ex);
            return false;    
            
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
                return false;            
            }            
        }       
       
    }
    
    /*
    public static Owner LoadCustomer(String username){
        
        Owner owner = null;
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            
            connection = DBConnection.getConnection();
           // ps = connection.prepareStatement(LOAD_OWNER);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            while (rs.next()){           
                
               owner = new Owner(rs.getDate("account_creation_datetime"),
                                        rs.getString("deletion_status"),rs.getInt("agent_idagent"),
                                        rs.getInt("maximum_rent"),rs.getInt("iduser"),rs.getString("name"),
                                        rs.getString("last_name"),rs.getString("email_address"),
                                        username,rs.getString("password"));
                                             
            }
            
            rs.close();
            
            //return customer;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error" + ex);
            return null;    
            
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
                return null;            
            }            
        }
          
    }
    */
}