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
public class Customer {
    private int id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String email;
    private Date account_creation_datetime;
    private String deletionStatus;
    private int idAgent;
    private long maximumRent;

    public Customer() {
    }

    public Customer(int id, String username, String password, String name, String lastname, String email, Date account_creation_datetime, String deletionStatus, int idAgent, long maximumRent) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.account_creation_datetime = account_creation_datetime;
        this.deletionStatus = deletionStatus;
        this.idAgent = idAgent;
        this.maximumRent = maximumRent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
