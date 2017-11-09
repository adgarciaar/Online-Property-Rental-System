/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

import java.awt.image.BufferedImage;
import java.util.Date;

/**
 *
 * @author adrian
 */
public class Photo {
    
    private int id;
    private String filename;
    BufferedImage image;
    private String description;
    private Date datephoto;
    private int countryId;
    private int propertyId;

    public Photo() {
    }

    public Photo(int id, String filename, BufferedImage image, String description, Date datephoto, int countryId, int propertyId) {
        this.id = id;
        this.filename = filename;
        this.image = image;
        this.description = description;
        this.datephoto = datephoto;
        this.countryId = countryId;
        this.propertyId = propertyId;
    }

    public Photo(int id, String filename, String description, Date datephoto, int countryId, int propertyId) {
        this.id = id;
        this.filename = filename;
        this.description = description;
        this.datephoto = datephoto;
        this.countryId = countryId;
        this.propertyId = propertyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatephoto() {
        return datephoto;
    }

    public void setDatephoto(Date datephoto) {
        this.datephoto = datephoto;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }
    
}
