/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataAccess.LocationDAO;
import World.Customer;
import World.ISystemFacade;
import World.Photo;
import World.Property;
import World.SystemFacade;
import World.Visit;
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
public class ViewVisitingListWindow extends javax.swing.JFrame {
    
    private final Customer customer;
    private LinkedHashMap<Integer,Property> listProperties;
    private final JFrame CustomerWindow;
    private Property property;   

    /**
     * Creates new form CustomerViewPropertiesWindow
     * @param customer
     * @param listProperties
     * @param CustomerWindow
     */
    public ViewVisitingListWindow(Customer customer, LinkedHashMap<Integer,Property> listProperties, JFrame CustomerWindow) {
        
        initComponents();
        this.customer = customer;
        this.listProperties = listProperties;
        this.CustomerWindow = CustomerWindow;
        ImageLabel.setText("");
        this.property = null;
        
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
        RentPropertyButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NumberRoomsTextField = new javax.swing.JTextField();
        DeletionStatusTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        RentTextField = new javax.swing.JTextField();
        ShowPropertyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        PropertiesComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PhotosComboBox = new javax.swing.JComboBox<>();
        ShowPhotoButton = new javax.swing.JButton();
        FilenameTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DateTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CountryTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionTextArea = new javax.swing.JTextArea();
        LocationTextField = new javax.swing.JTextField();
        TypeTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        VisitComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Location");

        RentPropertyButton.setText("Rent property");
        RentPropertyButton.setEnabled(false);
        RentPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentPropertyButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Number of rooms");

        jLabel11.setText("Deletion status");

        NumberRoomsTextField.setEnabled(false);

        DeletionStatusTextField.setEnabled(false);

        jLabel6.setText("Rent");

        ImageLabel.setText("theImage");
        ImageLabel.setMaximumSize(new java.awt.Dimension(389, 215));
        ImageLabel.setPreferredSize(new java.awt.Dimension(350, 200));

        RentTextField.setEnabled(false);

        ShowPropertyButton.setText("Show property");
        ShowPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPropertyButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Properties in my visiting list");

        jLabel2.setText("Type");

        jLabel3.setText("Address");

        AddressTextField.setEnabled(false);

        PropertiesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropertiesComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Properties");

        jLabel8.setText("Photos of the property");

        jLabel9.setText("Property information");

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

        jLabel12.setText("Date");

        DateTextField.setEnabled(false);

        jLabel13.setText("Country");

        CountryTextField.setEnabled(false);

        jLabel14.setText("Description");

        DescriptionTextArea.setColumns(20);
        DescriptionTextArea.setRows(5);
        DescriptionTextArea.setEnabled(false);
        jScrollPane1.setViewportView(DescriptionTextArea);

        LocationTextField.setEnabled(false);

        TypeTextField.setEnabled(false);

        jLabel15.setText("Your visit historial on this property");

        VisitComboBox.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
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
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel15)))
                                            .addComponent(jLabel2))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RentTextField)
                                            .addComponent(NumberRoomsTextField)
                                            .addComponent(AddressTextField)
                                            .addComponent(DeletionStatusTextField)
                                            .addComponent(LocationTextField)
                                            .addComponent(TypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(VisitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(PhotosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ShowPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CountryTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(FilenameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel13)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(14, 14, 14)
                                                        .addComponent(BackButton)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PropertiesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(ShowPropertyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(RentPropertyButton)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhotosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShowPhotoButton))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FilenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel4)
                            .addComponent(LocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(DeletionStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(VisitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RentPropertyButton)
                            .addComponent(BackButton))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RentPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentPropertyButtonActionPerformed
        this.setVisible(false);
        this.cleanPhotoData();
        this.clean();
        new RentPropertyWindow(this.customer, this.property, this).setVisible(true);
    }//GEN-LAST:event_RentPropertyButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.dispose();
        this.CustomerWindow.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ShowPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPropertyButtonActionPerformed
        this.showProperty();
    }//GEN-LAST:event_ShowPropertyButtonActionPerformed

    private void PropertiesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertiesComboBoxActionPerformed

    }//GEN-LAST:event_PropertiesComboBoxActionPerformed

    private void PhotosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhotosComboBoxActionPerformed

    }//GEN-LAST:event_PhotosComboBoxActionPerformed

    private void ShowPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPhotoButtonActionPerformed
        this.showPhoto();
    }//GEN-LAST:event_ShowPhotoButtonActionPerformed

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
        
        TypeTextField.setText("");
        LocationTextField.setText("");
        PhotosComboBox.removeAllItems();
        PhotosComboBox.setEnabled(false);
        RentPropertyButton.setEnabled(false);
        ShowPhotoButton.setEnabled(false);
        ImageLabel.setIcon(null);  
        FilenameTextField.setText("");
        AddressTextField.setText("");
        NumberRoomsTextField.setText("");
        RentTextField.setText("");
        DeletionStatusTextField.setText("");
        ImageLabel.setIcon(null);  
        DateTextField.setText("");
        CountryTextField.setText("");
        DescriptionTextArea.setText("");
        VisitComboBox.removeAllItems();
    }
    
    private void showProperty(){
        
        this.clean();
        
        String propertyData = (String)PropertiesComboBox.getSelectedItem(); 
        
        int pointIndex = propertyData.indexOf(".");        
        
        int idProperty = Integer.parseInt(propertyData.substring(0, pointIndex));
        
        this.property = this.listProperties.get(idProperty);
        
        TypeTextField.setText(this.property.getType());
        AddressTextField.setText(this.property.getAddress());
        ISystemFacade facade = new SystemFacade(); 
        LocationTextField.setText(facade.retrieveNameLocation(this.property.getIdLocation()));        
        NumberRoomsTextField.setText(Integer.toString(this.property.getNumber_rooms()));
        RentTextField.setText(Long.toString(this.property.getRent()));
        DeletionStatusTextField.setText(this.property.getDeletion_status());
        
        this.fillComboBoxPhotos();
        
        RentPropertyButton.setEnabled(true);
        
        this.fillVisitPhotos();
        VisitComboBox.setEnabled(true);
    }
    
    private void fillComboBoxPhotos(){
        
        LinkedHashMap<Integer, Photo> listPhotos;
        listPhotos = this.property.getPhotos();
        
        if(listPhotos.isEmpty() == true){
            ShowPhotoButton.setEnabled(false);
            PhotosComboBox.setEnabled(false);
        }else{
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
        
    }
    
    private void showPhoto(){
        
        this.cleanPhotoData();
        
        FilenameTextField.setText("");
        DateTextField.setText("");
        CountryTextField.setText("");
        DescriptionTextArea.setText("");
        
        String photoData = (String)PhotosComboBox.getSelectedItem();
        
        int pointIndex = photoData.indexOf("."); 
        
        int idPhoto = Integer.parseInt(photoData.substring(0, pointIndex));
        
        LinkedHashMap<Integer, Photo> listPhotos;
        listPhotos = this.property.getPhotos();
        
        Photo photo = listPhotos.get(idPhoto);
        
        FilenameTextField.setText(photo.getFilename());
        DateTextField.setText(photo.getDatephoto());
        ISystemFacade facade = new SystemFacade(); 
        CountryTextField.setText(facade.retrieveNameCountry(photo.getCountryId()));
        DescriptionTextArea.setText(photo.getDescription());
        
        BufferedImage bufImage = (BufferedImage) photo.getImage();  
        
        Icon icon = new ImageIcon(bufImage.getScaledInstance(389, 215, Image.SCALE_DEFAULT));        
        ImageLabel.setIcon(icon);   
        
    }
    
    private void cleanPhotoData(){        
        ImageLabel.setIcon(null);         
        FilenameTextField.setText("");
        DateTextField.setText("");
        CountryTextField.setText("");
        DescriptionTextArea.setText("");
    }
    
    private void fillVisitPhotos(){
        
        ISystemFacade facade = new SystemFacade(); 
        
        LinkedHashMap<Integer, Visit> listVisits;
        listVisits = facade.retrieveVisits(this.customer.getId(), this.property.getId());
        
        Set set = listVisits.entrySet();        
        Iterator iterator = set.iterator();
        
        Visit visit;

        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();               
            visit = (Visit) mentry.getValue();  
            if(visit.getDateTime() == null){
                VisitComboBox.addItem(visit.getId()+". "+visit.getStatus()+" but waiting for date assignation");
            }else{
                VisitComboBox.addItem(visit.getId()+". "+visit.getStatus()+" in "+visit.getDateTime());
            }
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField CountryTextField;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JTextField DeletionStatusTextField;
    private javax.swing.JTextArea DescriptionTextArea;
    private javax.swing.JTextField FilenameTextField;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextField LocationTextField;
    private javax.swing.JTextField NumberRoomsTextField;
    private javax.swing.JComboBox<String> PhotosComboBox;
    private javax.swing.JComboBox<String> PropertiesComboBox;
    private javax.swing.JButton RentPropertyButton;
    private javax.swing.JTextField RentTextField;
    private javax.swing.JButton ShowPhotoButton;
    private javax.swing.JButton ShowPropertyButton;
    private javax.swing.JTextField TypeTextField;
    private javax.swing.JComboBox<String> VisitComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
