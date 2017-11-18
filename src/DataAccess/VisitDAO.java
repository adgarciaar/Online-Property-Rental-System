/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Visit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class VisitDAO {
    
    public static final String SCHEDULE_VISIT = "insert into visit (customer_iduser, "
            + "property_idproperty, datetimevisit, comments, status) values "
            + "(?, ?, NULL, NULL, 'Scheduled')";
    
    public static final String NUMBER_VISITS_BY_CUSTOMER_PROPERTY = "select count(*) "
            + "from visit where customer_iduser = ? and property_idproperty = ? "
            + "and (status = 'Done' or status = 'Scheduled')";    
    
    public static boolean scheduleVisit(Visit visit){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(SCHEDULE_VISIT);
                      
            ps.setInt(1, visit.getIdCustomer());
            ps.setInt(2, visit.getIdProperty());
            
            ps.executeUpdate();
            
            connection.commit();
            
            JOptionPane.showMessageDialog(null, "The visit was scheduled successfully");
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
    
    public static boolean searchVisitsByCustomerProperty(int idCustomer, int idProperty){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
           
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(NUMBER_VISITS_BY_CUSTOMER_PROPERTY);
            ps.setInt(1, idCustomer);
            ps.setInt(2, idProperty);
            rs = ps.executeQuery();
            
            int number = 0;
            
            while (rs.next()){            
                number = rs.getInt("count(*)");
            }            
            
            rs.close();
            
            if(number == 0){
                return true;
            }else{     
                JOptionPane.showMessageDialog(null, "This property is already in your visiting list");
                return false;
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
    
    
}
