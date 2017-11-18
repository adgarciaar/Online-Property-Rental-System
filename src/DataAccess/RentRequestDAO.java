/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.RentRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class RentRequestDAO {
    
    public static final String ADD_RENT_REQUEST = "insert into rent_request (datetimerequest,duration, " 
            +"status_financial_authorization,status_confirmation,payment,credit_card_number," 
            +"customer_iduser,property_idproperty) values (SYSDATE, ?, 'Approved', 'Confirmed', ?, ?, ?, ?)";
    
    public static boolean addRentRequest(RentRequest rentRequest){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(ADD_RENT_REQUEST);            
            
            ps.setInt(1, rentRequest.getDuration());
            ps.setLong(2, PropertyDAO.getRentProperty(rentRequest.getIdProperty()*rentRequest.getDuration()));
            ps.setLong(3, rentRequest.getCardNumber());
            ps.setInt(4, rentRequest.getIdCustomer());
            ps.setInt(5, rentRequest.getIdProperty());                                        
            
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
