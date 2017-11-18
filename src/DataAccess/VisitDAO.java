/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Visit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class VisitDAO {
    
    public static final String SCHEDULE_VISIT = "insert into visit (customer_iduser, "
            + "property_idproperty, datetimevisit, comments, status) values "
            + "(?, ?, TO_DATE(?, 'dd/mm/yyyy hh24:mi:ss'), NULL, 'Scheduled');";
    
    public static boolean scheduleVisit(Visit visit){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(SCHEDULE_VISIT);
                      
            ps.setInt(1, visit.getIdCustomer());
            ps.setInt(2, visit.getIdProperty());
            ps.setString(3, visit.getDateTime());
            
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
    
}
