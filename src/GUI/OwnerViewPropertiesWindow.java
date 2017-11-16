/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataAccess.LocationDAO;
import World.ISystemFacade;
import World.Owner;
import World.Photo;
import World.Property;
import World.SystemFacade;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class OwnerViewPropertiesWindow extends javax.swing.JFrame {
    
    private final Owner owner;
    private LinkedHashMap<Integer,Property> listProperties;
    private final JFrame OwnerWindow;
    private Property property;   

    /**
     * Creates new form OwnerViewProperties
     * @param owner
     * @param listProperties
     * @param OwnerWindow
     */
    public OwnerViewPropertiesWindow(Owner owner, LinkedHashMap<Integer,Property> listProperties, JFrame OwnerWindow) {
        
        initComponents();
        this.owner = owner;
        this.listProperties = listProperties;
        this.OwnerWindow = OwnerWindow;
        ImageLabel.setText("");
        
        this.stablishListProperties();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        LocationComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        NumberRoomsTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RentTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        PropertiesComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OrderByNumberRoomsButton = new javax.swing.JButton();
        OrderByRentButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PhotosComboBox = new javax.swing.JComboBox<>();
        ShowPhotoButton = new javax.swing.JButton();
        FilenameTextField = new javax.swing.JTextField();
        DeletePropertyButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        DeletionStatusTextField = new javax.swing.JTextField();
        ImageLabel = new javax.swing.JLabel();
        ShowPropertyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(995, 731));
        setResizable(false);

        jLabel4.setText("Location");

        LocationComboBox.setEnabled(false);

        jLabel5.setText("Number of rooms");

        NumberRoomsTextField.setEnabled(false);

        jLabel6.setText("Rent");

        RentTextField.setEnabled(false);

        jLabel1.setText("View properties");

        jLabel2.setText("Type");

        TypeComboBox.setEnabled(false);

        jLabel3.setText("Address");

        AddressTextField.setEnabled(false);

        PropertiesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropertiesComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("My properties");

        jLabel8.setText("Photos of the property");

        jLabel9.setText("Property information");

        OrderByNumberRoomsButton.setText("Order by number of rooms");
        OrderByNumberRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderByNumberRoomsButtonActionPerformed(evt);
            }
        });

        OrderByRentButton.setText("Order by rent");
        OrderByRentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderByRentButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Filename");

        jLabel16.setText("Image");

        PhotosComboBox.setEnabled(false);
        PhotosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhotosComboBoxActionPerformed(evt);
            }
        });

        ShowPhotoButton.setText("Show photo");
        ShowPhotoButton.setEnabled(false);
        ShowPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPhotoButtonActionPerformed(evt);
            }
        });

        FilenameTextField.setEnabled(false);

        DeletePropertyButton.setText("Delete property");
        DeletePropertyButton.setEnabled(false);
        DeletePropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePropertyButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Deletion status");

        DeletionStatusTextField.setEnabled(false);

        ImageLabel.setText("theImage");
        ImageLabel.setMaximumSize(new java.awt.Dimension(389, 215));
        ImageLabel.setPreferredSize(new java.awt.Dimension(350, 200));

        ShowPropertyButton.setText("Show property");
        ShowPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPropertyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PropertiesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(ShowPropertyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ShowPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhotosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FilenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(OrderByNumberRoomsButton)
                                        .addGap(48, 48, 48)
                                        .addComponent(OrderByRentButton)
                                        .addGap(200, 200, 200)))))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(DeletePropertyButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3))
                                                    .addComponent(jLabel11)))
                                            .addComponent(jLabel2))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(RentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                            .addComponent(NumberRoomsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                            .addComponent(LocationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AddressTextField)
                                            .addComponent(DeletionStatusTextField))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addComponent(BackButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel8))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PropertiesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ShowPropertyButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderByNumberRoomsButton)
                    .addComponent(OrderByRentButton))
                .addGap(18, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(PhotosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(ShowPhotoButton)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FilenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumberRoomsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(DeletionStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeletePropertyButton)
                    .addComponent(BackButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderByNumberRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderByNumberRoomsButtonActionPerformed
        this.clean();
        ISystemFacade facade = new SystemFacade();         
        this.listProperties = facade.propertiesByOwner(this.owner.getId(),"NumberRooms");
        this.stablishListProperties();
    }//GEN-LAST:event_OrderByNumberRoomsButtonActionPerformed

    private void OrderByRentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderByRentButtonActionPerformed
        this.clean();
        ISystemFacade facade = new SystemFacade();         
        this.listProperties = facade.propertiesByOwner(this.owner.getId(),"Rent");
        this.stablishListProperties();
    }//GEN-LAST:event_OrderByRentButtonActionPerformed

    private void ShowPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPhotoButtonActionPerformed
        this.showPhoto();
    }//GEN-LAST:event_ShowPhotoButtonActionPerformed

    private void DeletePropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePropertyButtonActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        
            this.property.setDeletion_status("Deleted");
            ISystemFacade facade = new SystemFacade();   
            boolean b;
            b = facade.deleteProperty(this.property.getId());
            this.clean();        
            PropertiesComboBox.setSelectedIndex(0);
        
        }
    }//GEN-LAST:event_DeletePropertyButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.dispose();
        this.OwnerWindow.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PropertiesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertiesComboBoxActionPerformed
        
    }//GEN-LAST:event_PropertiesComboBoxActionPerformed

    private void ShowPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPropertyButtonActionPerformed
        this.showProperty();
    }//GEN-LAST:event_ShowPropertyButtonActionPerformed

    private void PhotosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhotosComboBoxActionPerformed
        
    }//GEN-LAST:event_PhotosComboBoxActionPerformed

    private void stablishListProperties(){
        
        PropertiesComboBox.removeAllItems();
        
        Property prop;
        
        Set set = this.listProperties.entrySet();        
        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();               
            prop = (Property) mentry.getValue();
            PropertiesComboBox.addItem(prop.getId()+". "+prop.getType()
                    +" located in "+LocationDAO.retrieveNameLocation(prop.getIdLocation())
                    +" with "+prop.getNumber_rooms()+" rooms and rent of "
                    +prop.getRent());            
        }
    }
    
    private void clean(){
        
        TypeComboBox.removeAllItems();
        LocationComboBox.removeAllItems();
        PhotosComboBox.removeAllItems();
        PhotosComboBox.setEnabled(false);
        DeletePropertyButton.setEnabled(false);
        ShowPhotoButton.setEnabled(false);
        ImageLabel.setIcon(null);  
        FilenameTextField.setText("");
        AddressTextField.setText("");
        NumberRoomsTextField.setText("");
        RentTextField.setText("");
        DeletionStatusTextField.setText("");
        ImageLabel.setIcon(null);  
    }
    
    private void showProperty(){
        
        this.clean();
        
        TypeComboBox.addItem("Apartment");
        TypeComboBox.addItem("House");        
        
        String propertyData = (String)PropertiesComboBox.getSelectedItem(); 
        
        int pointIndex = propertyData.indexOf(".");        
        
        int idProperty = Integer.parseInt(propertyData.substring(0, pointIndex));
        
        this.property = this.listProperties.get(idProperty);
        
        TypeComboBox.setSelectedItem(this.property.getType());
        AddressTextField.setText(this.property.getAddress());
        LocationComboBox.addItem(LocationDAO.retrieveNameLocation(this.property.getIdLocation()));        
        NumberRoomsTextField.setText(Integer.toString(this.property.getNumber_rooms()));
        RentTextField.setText(Long.toString(this.property.getRent()));
        DeletionStatusTextField.setText(this.property.getDeletion_status());
        
        if (this.property.getDeletion_status().compareTo("Active") == 0){
            DeletePropertyButton.setEnabled(true);
        }else{
            DeletePropertyButton.setEnabled(false);
        }
        
        LinkedHashMap<Integer, Photo> listPhotos;
        listPhotos = this.property.getPhotos();
        
        Set set = listPhotos.entrySet();        
        Iterator iterator = set.iterator();
        
        Photo photo;

        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();               
            photo = (Photo) mentry.getValue();  
            PhotosComboBox.addItem(photo.getId()+". "+photo.getFilename());
        }
        
        PhotosComboBox.setEnabled(true);
        
        ShowPhotoButton.setEnabled(true);    
    }
    
    private void showPhoto(){
        
        ImageLabel.setIcon(null); 
        
        FilenameTextField.setText("");
        
        String photoData = (String)PhotosComboBox.getSelectedItem();
        
        int pointIndex = photoData.indexOf("."); 
        
        int idPhoto = Integer.parseInt(photoData.substring(0, pointIndex));
        
        LinkedHashMap<Integer, Photo> listPhotos;
        listPhotos = this.property.getPhotos();
        
        Photo photo = listPhotos.get(idPhoto);
        
        FilenameTextField.setText(photo.getFilename());
        
        BufferedImage bufImage = (BufferedImage) photo.getImage();  
        
        Icon icon = new ImageIcon(bufImage.getScaledInstance(389, 215, Image.SCALE_DEFAULT));        
        ImageLabel.setIcon(icon);   
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeletePropertyButton;
    private javax.swing.JTextField DeletionStatusTextField;
    private javax.swing.JTextField FilenameTextField;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JComboBox<String> LocationComboBox;
    private javax.swing.JTextField NumberRoomsTextField;
    private javax.swing.JButton OrderByNumberRoomsButton;
    private javax.swing.JButton OrderByRentButton;
    private javax.swing.JComboBox<String> PhotosComboBox;
    private javax.swing.JComboBox<String> PropertiesComboBox;
    private javax.swing.JTextField RentTextField;
    private javax.swing.JButton ShowPhotoButton;
    private javax.swing.JButton ShowPropertyButton;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
