/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class PropertyDAO {
    
    public static final String DELETE_PROPERTIES = "update Property set deletion_status"
            + " = 'Deleted' where owner_iduser = ?";
    
    public static boolean deletePropertiesByOwner(int idOwner){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;   
        
        try{
            connection = DBConnection.getConnection();
            
            ps = connection.prepareStatement(DELETE_PROPERTIES);
                      
            ps.setInt(1, idOwner);                
            
            ps.executeUpdate();
            
            connection.commit();
            
            JOptionPane.showMessageDialog(null, "The properties related to this account were deleted successfully"); 
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
