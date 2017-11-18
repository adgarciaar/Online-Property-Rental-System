/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

/**
 *
 * @author adrian
 */
public class Visit {
    
    private int idCustomer;
    private int idProperty;
    private String dateTime;
    private String comments;
    private String status;

    public Visit() {
    }

    public Visit(int idCustomer, int idProperty, String dateTime, String comments, String status) {
        this.idCustomer = idCustomer;
        this.idProperty = idProperty;
        this.dateTime = dateTime;
        this.comments = comments;
        this.status = status;
    }

    public Visit(int idCustomer, int idProperty, String dateTime) {
        this.idCustomer = idCustomer;
        this.idProperty = idProperty;
        this.dateTime = dateTime;
    }    

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(int idProperty) {
        this.idProperty = idProperty;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
