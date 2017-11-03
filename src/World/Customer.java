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
public class Customer extends User {   
    
    private long maximumRent;

    public Customer() {
    }

    public Customer(long maximumRent, String deletionStatus, int idAgent, int id, 
            String name, String lastname, String email, String username, String password) {
        super(deletionStatus, idAgent, id, name, lastname, email, username, password);
        this.maximumRent = maximumRent;
    }

    public long getMaximumRent() {
        return maximumRent;
    }

    public void setMaximumRent(long maximumRent) {
        this.maximumRent = maximumRent;
    }
           
}
