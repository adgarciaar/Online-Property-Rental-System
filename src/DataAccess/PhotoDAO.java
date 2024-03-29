/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import World.Photo;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class PhotoDAO {
    
    public static final String UPLOAD_PHOTO = "insert into photo (filename,image, "
            + "description,datephoto,country_idcountry,property_idproperty) values "
            + "(?, ?, ?, TO_DATE(?, 'dd/mm/yyyy'), ?, ?)";
    
    public static final String RETRIEVE_PHOTOS = "select idphoto,filename,image, "
            + "description,datephoto,country_idcountry,property_idproperty from "
            + "Photo where property_idproperty = ? ";
    
    public static final String RETRIEVE_PHOTOS_BY_ORDER = "select idphoto,filename,image, "
            + "description,datephoto,country_idcountry,property_idproperty from "
            + "Photo where property_idproperty = ? ";
    
    public static boolean uploadPhoto(Photo photo){
        
        Connection connection = null;       
        PreparedStatement ps = null;
        
        try{
           
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(UPLOAD_PHOTO);
            
            FileInputStream fis = new FileInputStream((File) photo.getImage());
            ps.setString(1, photo.getFilename());            
            ps.setBinaryStream(2, fis, fis.available());
            ps.setString(3, photo.getDescription());
            ps.setString(4, photo.getDatephoto());
            ps.setInt(5, photo.getCountryId());
            ps.setInt(6, photo.getPropertyId());
            
            ps.executeUpdate();
            
            connection.commit();
            
            return true;
            
        }catch(IOException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
            return false;   
        
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);                           
            }            
        }
        
    }
    
    public static LinkedHashMap<Integer, Photo> retrievePhotos(int propertyId, String order) throws IOException{
        
        Connection connection = null;       
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        LinkedHashMap<Integer,Photo> listPhotos = new LinkedHashMap<>();
        
        try{
            
            String query = RETRIEVE_PHOTOS;
            
            if (order.compareTo("Id") == 0){
                query = query + "order by idphoto asc";
            }else{            
                if (order.compareTo("Date") == 0){
                    query = query + "order by datephoto asc";
                }else{
                    if (order.compareTo("Country") == 0){
                        query = query + "order by country_idcountry asc";
                    }else{
                        query = query + "order by description asc";
                    }
                }
            }
           
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement(query);        
            ps.setInt(1, propertyId);
            
            rs = ps.executeQuery();

            Photo photo;            
            
            while (rs.next()){
                
                photo = new Photo();
                
                photo.setId(rs.getInt("idphoto"));
                photo.setFilename(rs.getString("filename"));
                
                Blob b = rs.getBlob("image");
		byte[] bt = new byte[(int) b.length()];
                bt = b.getBytes(1, (int)b.length());
                InputStream is = new ByteArrayInputStream(bt);                
                BufferedImage bufImage = null;
                bufImage = ImageIO.read(is);
                
                photo.setImage(bufImage);
                
                photo.setDescription(rs.getString("description"));
                photo.setDatephoto(rs.getString("datephoto"));
                photo.setCountryId(rs.getInt("country_idcountry"));
                photo.setPropertyId(rs.getInt("property_idproperty"));
                
                listPhotos.put(photo.getId(), photo);
                
            }   
            
            rs.close();     
            
            return listPhotos;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
            return null;
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);                           
            }            
        }
    }
    
}
