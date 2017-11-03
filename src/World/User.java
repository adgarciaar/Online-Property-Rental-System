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
public abstract class User extends Person {
    
    protected String deletionStatus;
    protected int idAgent;

    public User() {
    }

    public User(String deletionStatus, int idAgent, int id, String name, String lastname, String email, String username, String password) {
        super(id, name, lastname, email, username, password);
        this.deletionStatus = deletionStatus;
        this.idAgent = idAgent;
    }

    
    public String getDeletionStatus() {
        return deletionStatus;
    }

    public void setDeletionStatus(String deletionStatus) {
        this.deletionStatus = deletionStatus;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }
    
}
