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
            + "where username = ? and password = ? "
            + "and deletion_status = 'Active'";
    
    public static final String LOAD_CUSTOMER = "select iduser, name, lastname, "
                                               + "email_address, account_creation_datetime, "
                                               + "deletion_status, agent_idagent, maximum_rent "
                                               + "from Customer where username = ?";
    
    public static final String CREATE_CUSTOMER = "insert into Customer ( "
            + "username, password, name, lastname, email_address, account_creation_datetime, "
            + "deletion_status, agent_idagent, maximum_rent) values (?, ?, ?, ?, ?, SYSDATE, ?, ?, ?)";
    
    public static final String SEARCH_USERNAME = "select count(*) from Customer "
                    + "where username = ?";
    
    public static final String DELETE_CUSTOMER = "update Customer set "
            + "deletion_status = 'Deleted' where iduser = ?";
    
    public static final String VALIDATE_CUSTOMER_RENT = "select case when count(*)=0 "
            + "then 'false' else 'true' end as confirmation from customer "
            + "where iduser = ? and maximum_rent >= (select rent from property where idproperty = ?)";
    
    public static final String UPDATE_EMAIL = "update Customer set email = ? where iduser = ?";
    
    
    public static Customer searchCustomer(String username, String password){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(SEARCH_CUSTOMER);
            ps.setString(1, username);
            ps.setString(2, Encryption.encrypt(password));
            rs = ps.executeQuery();
            
            int number = 0;
            
            while (rs.next()){            
                number = rs.getInt("count(*)");
            }
            
            rs.close();
            
            if(number == 0){
                return null;
            }else{
                Customer customer = null;
                ps = connection.prepareStatement(LOAD_CUSTOMER);
                ps.setString(1, username);
                rs = ps.executeQuery();

                while (rs.next()){
                    customer = new Customer(rs.getLong("maximum_rent"),
                                            rs.getString("deletion_status"),rs.getInt("agent_idagent"),
                                            rs.getInt("iduser"),rs.getString("name"),
                                            rs.getString("lastname"),rs.getString("email_address"),
                                            username,null);

                }
                rs.close();
                return customer;                
            }
            
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
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(CREATE_CUSTOMER);
                      
            ps.setString(1, customer.getUsername());
            ps.setString(2, Encryption.encrypt(customer.getPassword()));
            ps.setString(3, customer.getName());
            ps.setString(4, customer.getLastname());
            ps.setString(5, customer.getEmail());
            ps.setString(6, customer.getDeletionStatus());
            ps.setInt(7, customer.getIdAgent());
            ps.setLong(8, customer.getMaximumRent());            
            
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
    
    public static boolean deleteCustomer(Customer customer){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(DELETE_CUSTOMER);
                      
            ps.setInt(1, customer.getId());                
            
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
    
    public static boolean validateRentCostumer(int idCustomer, int idProperty){
               
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;   
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(VALIDATE_CUSTOMER_RENT);
                      
            ps.setInt(1, idCustomer);
            ps.setInt(2, idProperty);
            
            rs = ps.executeQuery();
            
            String b = null;
            
            while (rs.next()){            
                b = rs.getString("confirmation");
            }
            
            rs.close();
            
            if(b.compareTo("true") == 0){                
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "The rent of this property exceeds your maximum rent registered");
                return false;
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
    
    public static boolean updateEmail(int idCustomer, String email){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(UPDATE_EMAIL);            
                      
            ps.setString(1, email);    
            ps.setInt(2, idCustomer);
            
            ps.executeUpdate();
            
            connection.commit();            
            
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
