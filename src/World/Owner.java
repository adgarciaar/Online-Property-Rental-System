/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

import java.util.Date;

/**
 *
 * @author adrian
 */
public class Owner extends User{

    public Owner(String deletionStatus, int idAgent, int id, String name, 
            String lastname, String email, String username, String password) {
        super(deletionStatus, idAgent, id, name, lastname, email, username, password);
    }    

    public Owner(String deletionStatus, int idAgent, String name, String lastname, String email, String username, String password) {
        super(deletionStatus, idAgent, name, lastname, email, username, password);
    }    
    
}
