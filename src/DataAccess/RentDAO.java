/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Rent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class RentDAO {
    
    public static final String ADD_RENT = "insert into rent "
            + "(datetimerent,duration,payment,property_idproperty,"
            + "customer_iduser,rent_request_idrentrequest) "
            + "values (SYSDATE, ?, ?, ?, ?, ?)";
    
    public static boolean addRent(Rent rent){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(ADD_RENT);
                      
            ps.setInt(1, rent.getDuration());
            ps.setLong(2, PropertyDAO.getRentProperty(rent.getIdProperty()*rent.getDuration()));
            ps.setInt(3, rent.getIdProperty());    
            ps.setInt(4, rent.getIdCustomer());
            ps.setInt(5, rent.getIdRentRequest());                                                
            
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
