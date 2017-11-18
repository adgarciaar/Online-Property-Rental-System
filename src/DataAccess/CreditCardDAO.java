/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.CreditCard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class CreditCardDAO {
    
    public static final String ADD_CREDIT_CARD = "insert into credit_card "
            + "(card_number,type,name_primary_holder,month_expiry_date,year_expiry_date) " 
            + "values (?, ?, ?, ?, ?)";
    
    public static boolean addCreditCard(CreditCard creditCard){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(ADD_CREDIT_CARD);
                      
            ps.setLong(1, creditCard.getNumber());
            ps.setString(2, creditCard.getType());
            ps.setString(3, creditCard.getNameHolder());
            ps.setInt(4, creditCard.getExpiryMonth());
            ps.setInt(5, creditCard.getExpiryYear());                                 
            
            ps.executeUpdate();
            
            connection.commit();
            
            JOptionPane.showMessageDialog(null, "Credit card was added successfully");
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
