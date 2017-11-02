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

    public Owner() {
    }

    public Owner(Date account_creation_datetime, String deletionStatus, int idAgent, long maximumRent, int id, String name, String lastname, String email, String username, String password) {
        super(account_creation_datetime, deletionStatus, idAgent, maximumRent, id, name, lastname, email, username, password);
    }
    
}
