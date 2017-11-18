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
public class CreditCard {
    
    private long number;
    private String type;
    private String nameHolder;
    private int expiryMonth;
    private int expiryYear;

    public CreditCard() {
    }

    public CreditCard(long number, String type, String nameHolder, int expiryMonth, int expiryYear) {
        this.number = number;
        this.type = type;
        this.nameHolder = nameHolder;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }
    
}
