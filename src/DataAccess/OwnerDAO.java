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
    
    public static final String CREATE_OWNER = "insert into Property_Owner (iduser, "
            + "username, password, name, lastname, email_address, account_creation_datetime, "
            + "deletion_status, agent_idagent) values (?, ?, ?, ?, ?, ?, SYSDATE, ?, ?)";

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
                      
            ps.setInt(1, owner.getId());
            ps.setString(2, owner.getUsername());
            ps.setString(3, owner.getPassword());
            ps.setString(4, owner.getName());
            ps.setString(5, owner.getLastname());
            ps.setString(6, owner.getEmail());
            ps.setString(7, owner.getDeletionStatus());
            ps.setInt(8, owner.getIdAgent());                        
            
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
}
