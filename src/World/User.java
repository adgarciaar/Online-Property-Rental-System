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
    
    protected Date account_creation_datetime;
    protected String deletionStatus;
    protected int idAgent;
    protected long maximumRent;

    public User() {
    }

    public User(Date account_creation_datetime, String deletionStatus, int idAgent, long maximumRent, int id, String name, String lastname, String email, String username, String password) {
        super(id, name, lastname, email, username, password);
        this.account_creation_datetime = account_creation_datetime;
        this.deletionStatus = deletionStatus;
        this.idAgent = idAgent;
        this.maximumRent = maximumRent;
    }

    public Date getAccount_creation_datetime() {
        return account_creation_datetime;
    }

    public void setAccount_creation_datetime(Date account_creation_datetime) {
        this.account_creation_datetime = account_creation_datetime;
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

    public long getMaximumRent() {
        return maximumRent;
    }

    public void setMaximumRent(long maximumRent) {
        this.maximumRent = maximumRent;
    }
    
}
