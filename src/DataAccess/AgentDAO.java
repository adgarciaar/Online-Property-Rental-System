/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Agent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class AgentDAO {
    
    public static final String SEARCH_AGENT = "select count(*) from OPR_Agent "
                                               + "where username = ? and password = ?";
    public static final String LOAD_AGENT = "select idagent, name, last_name, "
                                               + "email_address, password from OPR_Agent where username = ?";

    public AgentDAO() {
    }   
    
    public static boolean searchAgent(String username, String password){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
           
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(SEARCH_AGENT);
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
                return false;            
            }            
        }       
       
    }
    
    public static Agent LoadAgent(String username){
        
        Agent agent = null;
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(LOAD_AGENT);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            while (rs.next()){           
                
                agent = new Agent(rs.getInt("idagent"), rs.getString("name"), 
                        rs.getString("last_name"), rs.getString("email_address"), 
                        username, rs.getString("password"));
                        
            }
            
            rs.close();
            
            return agent;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error" + ex);
            return null;    
            
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
                return null;            
            }            
        }
          
    }
    
}