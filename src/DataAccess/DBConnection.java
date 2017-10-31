/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author adrian
 */
public class DBConnection {

    public DBConnection() {
        
    }       
    
    public static Connection getConnection() throws SQLException{
        String username = "is186406";
        String password = "A7jFCV5cLs";
        String thinConn = "jdbc:oracle:thin:@orion.javeriana.edu.co:1521:PUJDB";
        DriverManager.registerDriver (new OracleDriver());
        
        Connection connection = DriverManager.getConnection(thinConn,username,password);
        connection.setAutoCommit(false);
        return connection;
    }
    
}
