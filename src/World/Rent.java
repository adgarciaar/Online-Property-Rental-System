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
public class Rent {
    
    private int id;
    private String dateTime;
    private int duration;
    private long payment;
    private int idProperty;
    private int idCustomer;
    private int idRentRequest;

    public Rent() {
    }

    public Rent(int id, String dateTime, int duration, long payment, int idProperty, int idCustomer, int idRentRequest) {
        this.id = id;
        this.dateTime = dateTime;
        this.duration = duration;
        this.payment = payment;
        this.idProperty = idProperty;
        this.idCustomer = idCustomer;
        this.idRentRequest = idRentRequest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getPayment() {
        return payment;
    }

    public void setPayment(long payment) {
        this.payment = payment;
    }

    public int getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(int idProperty) {
        this.idProperty = idProperty;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdRentRequest() {
        return idRentRequest;
    }

    public void setIdRentRequest(int idRentRequest) {
        this.idRentRequest = idRentRequest;
    }
    
}
