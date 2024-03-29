/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import World.CreditCard;
import World.Customer;
import World.ISystemFacade;
import World.Property;
import World.Rent;
import World.RentRequest;
import World.SystemFacade;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class RentPropertyWindow extends javax.swing.JFrame {
    
    private final Customer customer;
    private final Property property;
    private final JFrame PreviousWindow;

    /**
     * Creates new form RentPropertyWindow
     * @param customer
     * @param property
     * @param PreviousWindow
     */
    public RentPropertyWindow(Customer customer, Property property, JFrame PreviousWindow) {
        
        initComponents();
        this.customer = customer;
        this.property = property;
        this.PreviousWindow = PreviousWindow;
        
        int year = Calendar.getInstance().get(Calendar.YEAR);
        
        for(int i=0; i<7; i++){
            YearComboBox.addItem(Integer.toString(year+i));
        }
        
        EmailTextField.setText(this.customer.getEmail());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CCTextField = new javax.swing.JTextField();
        TypeCCComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameHolderTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MonthComboBox = new javax.swing.JComboBox<>();
        CancelButton = new javax.swing.JButton();
        SendFormButton = new javax.swing.JButton();
        YearComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Rent property");

        jLabel2.setText("Payment form");

        jLabel3.setText("Email address");

        jLabel4.setText("Type of credit card");

        TypeCCComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VISA", "MasterCard" }));

        jLabel5.setText("Credit card number");

        jLabel6.setText("Name of the primary card holder");

        jLabel7.setText("Expiry date");

        MonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        SendFormButton.setText("Send form");
        SendFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendFormButtonActionPerformed(evt);
            }
        });

        YearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SendFormButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(MonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                                .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(NameHolderTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CCTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(EmailTextField)
                                            .addComponent(TypeCCComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(CancelButton)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TypeCCComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NameHolderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(MonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(SendFormButton))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
        this.PreviousWindow.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SendFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendFormButtonActionPerformed
        
        if(validateFields() == true){
            
            if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                boolean b = true;
                
                ISystemFacade facade = new SystemFacade(); 
                
                facade.updateEmail(this.customer.getId(), EmailTextField.getText());
                
                CreditCard creditCard = new CreditCard();
                
                creditCard.setType((String)TypeCCComboBox.getSelectedItem());
                creditCard.setNumber(Long.parseLong(CCTextField.getText()));
                creditCard.setNameHolder(NameHolderTextField.getText());
                creditCard.setExpiryMonth( Integer.parseInt( (String)MonthComboBox.getSelectedItem() ) );
                creditCard.setExpiryYear(Integer.parseInt( (String)YearComboBox.getSelectedItem() ) );
                
                if (facade.addCreditCard(creditCard) == false){
                    b = false;
                }
                
                RentRequest rentRequest = new RentRequest();
                
                rentRequest.setCardNumber(creditCard.getNumber());
                rentRequest.setDuration(1);
                rentRequest.setIdCustomer(this.customer.getId());
                rentRequest.setIdProperty(this.property.getId());
                
                if (facade.addRentRequest(rentRequest) == false){
                    b = false;
                }
                
                rentRequest.setId(facade.getLastIdRentRequest(this.customer.getId(), this.property.getId()));
                
                Rent rent = new Rent();
                
                rent.setDuration(rentRequest.getDuration());
                rent.setIdCustomer(this.customer.getId());
                rent.setIdProperty(this.property.getId());
                rent.setIdRentRequest(rentRequest.getId());
                
                if (facade.addRent(rent) == false){
                    b = false;
                }
                
                if (b == false){
                    JOptionPane.showMessageDialog(null, "There was a problem in the process. Please contact Adrian or Daniela");
                }else{
                    JOptionPane.showMessageDialog(null, "Process done successfully");
                    this.dispose();
                    this.PreviousWindow.setVisible(true);
                }
                
            }
        }       
    }//GEN-LAST:event_SendFormButtonActionPerformed

    private boolean validateFields(){
        
        boolean b = true;
        boolean fill = true;
        
        if(EmailTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if(EmailTextField.getText().length() > 35){ 
                b = false;
                JOptionPane.showMessageDialog(null, "Email has a maximum lenght of 35 characters");
            }else{
                if (EmailTextField.getText().
                        matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$") == false){
                    b = false;
                    JOptionPane.showMessageDialog(null, "Email is incorrect");
                }
            }
        }
        
        if(CCTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if (CCTextField.getText().matches("[0-9]+") == false){
                b = false;
                JOptionPane.showMessageDialog(null, "Credit card number can contain only numbers");
            }else{
                if(CCTextField.getText().length() != 16){ 
                    b = false;
                    JOptionPane.showMessageDialog(null, "Credit card number must have 16 digits");
                }
            }                
        }
        
        if(NameHolderTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if(NameHolderTextField.getText().length() > 25){ 
                b = false;
                JOptionPane.showMessageDialog(null, "Name of the holder has a maximum lenght of 25 characters");
            }else{
                if (NameHolderTextField.getText().matches("[a-zA-Z ]+") == false){
                    b = false;
                    JOptionPane.showMessageDialog(null, "Name of the holder can contain only letters");
                }
            }
        }
        
        if ((String)MonthComboBox.getSelectedItem() == "Month"){
            b = false;
            JOptionPane.showMessageDialog(null, "You have to select the month of the expiry date");
        }        
        
        if ((String)YearComboBox.getSelectedItem() == "Year"){
            b = false;
            JOptionPane.showMessageDialog(null, "You have to select the year of the expiry date");
        }
        
        if (fill == false){
            JOptionPane.showMessageDialog(null, "Warning: you have to fill all the fields");
        }
        
        return b;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCTextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JComboBox<String> MonthComboBox;
    private javax.swing.JTextField NameHolderTextField;
    private javax.swing.JButton SendFormButton;
    private javax.swing.JComboBox<String> TypeCCComboBox;
    private javax.swing.JComboBox<String> YearComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
