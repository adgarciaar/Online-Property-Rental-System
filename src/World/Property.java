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
public class Property {
    
    private int id;
    private String type;
    private String address;
    private int number_rooms;
    private long rent;
    private String deletion_status;
    private int idLocation;
    private int idOwner;

    public Property(int id, String type, String address, int number_rooms, long rent, String deletion_status, int idLocation, int idOwner) {
        this.id = id;
        this.type = type;
        this.address = address;
        this.number_rooms = number_rooms;
        this.rent = rent;
        this.deletion_status = deletion_status;
        this.idLocation = idLocation;
        this.idOwner = idOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber_rooms() {
        return number_rooms;
    }

    public void setNumber_rooms(int number_rooms) {
        this.number_rooms = number_rooms;
    }

    public long getRent() {
        return rent;
    }

    public void setRent(long rent) {
        this.rent = rent;
    }

    public String getDeletion_status() {
        return deletion_status;
    }

    public void setDeletion_status(String deletion_status) {
        this.deletion_status = deletion_status;
    }

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }
        
}
