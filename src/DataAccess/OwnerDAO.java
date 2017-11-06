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
                    + "where username = ? and password = ? "
                    + "and deletion_status = 'Active'";
    
    public static final String LOAD_OWNER = "select iduser, name, lastname, "
                                               + "email_address, account_creation_datetime, "
                                               + "deletion_status, agent_idagent "
                                               + "from Property_Owner where username = ?";
    
    public static final String CREATE_OWNER = "insert into Property_Owner ( "
            + "username, password, name, lastname, email_address, account_creation_datetime, "
            + "deletion_status, agent_idagent) values (?, ?, ?, ?, ?, SYSDATE, ?, ?)";
    
    public static final String SEARCH_USERNAME = "select count(*) from Property_Owner "
                    + "where username = ?";
    
    public static final String DELETE_OWNER = "update Property_Owner set "
            + "deletion_status = 'Deleted' where iduser = ?";
    
    public static boolean searchOwner(String username, String password){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(SEARCH_OWNER);
            ps.setString(1, username);
            ps.setString(2, Encryption.encrypt(password));
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
            }            
        }       
       
    }
    
    public static Owner LoadOwner(String username){
        
        Owner owner = null;
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(LOAD_OWNER);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            while (rs.next()){           
                
                owner = new Owner(rs.getString("deletion_status"),rs.getInt("agent_idagent"),
                                        rs.getInt("iduser"),rs.getString("name"),
                                        rs.getString("lastname"),rs.getString("email_address"),
                                        username,null);
                                             
            }
            
            rs.close();
            
            return owner;
            
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
    
    public static boolean createOwner(Owner owner){
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;   
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(CREATE_OWNER);
                      
            ps.setString(1, owner.getUsername());
            ps.setString(2, Encryption.encrypt(owner.getPassword()));
            ps.setString(3, owner.getName());
            ps.setString(4, owner.getLastname());
            ps.setString(5, owner.getEmail());
            ps.setString(6, owner.getDeletionStatus());
            ps.setInt(7, owner.getIdAgent());                        
            
            ps.executeUpdate();
            
            connection.commit();
            
            JOptionPane.showMessageDialog(null, "Owner was added successfully");
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
    
    public static boolean validateUsername(String username){
               
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;   
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(SEARCH_USERNAME);
                      
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            int number = 0;
            
            while (rs.next()){            
                number = rs.getInt("count(*)");
            }
            
            rs.close();
            
            if(number == 1){
                JOptionPane.showMessageDialog(null, "This username is already registered. Please write another else");
                return false;
            }else{
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
    
    public static boolean deleteOwner(Owner owner){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;   
        
        PropertyDAO.deletePropertiesByOwner(owner.getId());
        
        try{
            
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(DELETE_OWNER);
                      
            ps.setInt(1, owner.getId());                
            
            ps.executeUpdate();
            
            connection.commit();
            
            JOptionPane.showMessageDialog(null, "The account was deleted successfully");
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
}
