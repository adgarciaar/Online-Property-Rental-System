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
public class RentRequest {
    
    private int id;
    private String dateTime;
    private int duration;
    private String finantialStatus;
    private String confirmationStatus;
    private long payment;
    private long cardNumber;
    private int idCustomer;
    private int idProperty;

    public RentRequest() {
    }

    public RentRequest(int id, String dateTime, int duration, String finantialStatus, String confirmationStatus, long payment, long cardNumber, int idCustomer, int idProperty) {
        this.id = id;
        this.dateTime = dateTime;
        this.duration = duration;
        this.finantialStatus = finantialStatus;
        this.confirmationStatus = confirmationStatus;
        this.payment = payment;
        this.cardNumber = cardNumber;
        this.idCustomer = idCustomer;
        this.idProperty = idProperty;
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

    public String getFinantialStatus() {
        return finantialStatus;
    }

    public void setFinantialStatus(String finantialStatus) {
        this.finantialStatus = finantialStatus;
    }

    public String getConfirmationStatus() {
        return confirmationStatus;
    }

    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    public long getPayment() {
        return payment;
    }

    public void setPayment(long payment) {
        this.payment = payment;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
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
    
}
