/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class CustomerDAO {
    
    public static final String SEARCH_CUSTOMER = "select count(*) from Customer "
                                               + "where username = ? and password = ?";
    
    public static final String LOAD_CUSTOMER = "select iduser, name, last_name, "
                                               + "email_address, password, account_creation_datetime"
                                               + "deletion_status, agent_idagent, maximum_rent"
                                               + "from Customer where username = ?";
    
    public static final String CREATE_CUSTOMER = "insert into Customer (iduser, "
            + "username, password, name, lastname, email_address, account_creation_datetime, "
            + "deletion_status, agent_idagent, maximum_rent) values (?, ?, ?, ?, ?, ?, SYSDATE, ?, ?, ?)";
    
    public static final String SEARCH_USERNAME = "select count(*) from Customer "
                    + "where username = ?";
                  
    public CustomerDAO() {
    }
    
    public static boolean searchCustomer(String username, String password){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(SEARCH_CUSTOMER);
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
            JOptionPane.showMessageDialog(null, "Error: " + ex);
            return false;    
            
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);                          
            }            
        }       
       
    }    
    
    public static Customer LoadCustomer(String username){
        
        Customer customer = null;
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(LOAD_CUSTOMER);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            while (rs.next()){           
                
                customer = new Customer(rs.getLong("maximum_rent"),
                                        rs.getString("deletion_status"),rs.getInt("agent_idagent"),
                                        rs.getInt("iduser"),rs.getString("name"),
                                        rs.getString("last_name"),rs.getString("email_address"),
                                        username,rs.getString("password"));
                                             
            }
            
            rs.close();
            
            return customer;
            
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
    
    public static boolean createCustomer(Customer customer){
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;   
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(CREATE_CUSTOMER);
                      
            ps.setInt(1, customer.getId());
            ps.setString(2, customer.getUsername());
            ps.setString(3, customer.getPassword());
            ps.setString(4, customer.getName());
            ps.setString(5, customer.getLastname());
            ps.setString(6, customer.getEmail());
            ps.setString(7, customer.getDeletionStatus());
            ps.setInt(8, customer.getIdAgent());
            ps.setLong(9, customer.getMaximumRent());            
            
            ps.executeUpdate();
            
            connection.commit();
            
            JOptionPane.showMessageDialog(null, "Customer was added successfully");
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
    
}
