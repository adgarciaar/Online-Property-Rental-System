/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import World.Agent;
import World.Customer;
import World.ISystemFacade;
import World.Owner;
import World.SystemFacade;
import World.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author adrian
 */
public class CreateUserAccountWindow extends javax.swing.JFrame {
    
    private final Agent agent;
    private final JFrame AgentWindow;    

    /**
     * Creates new form CreateUserAccountWindow
     */
    public CreateUserAccountWindow(Agent agent, JFrame AgentWindow) {
        initComponents();
        this.agent = agent;
        this.AgentWindow = AgentWindow;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        CreateUserButton = new javax.swing.JButton();
        NameTextField = new javax.swing.JTextField();
        LastnameTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        UsernameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        UserTypeComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        MaximumRentTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Create user account");

        jLabel3.setText("Username");

        jLabel4.setText("Name");

        jLabel5.setText("Last name");

        jLabel6.setText("Email address");

        jLabel7.setText("Maximun rent");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        CreateUserButton.setText("Create user account");
        CreateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserButtonActionPerformed(evt);
            }
        });

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        LastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameTextFieldActionPerformed(evt);
            }
        });

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });

        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("User type");

        UserTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Owner" }));
        UserTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setText("Password");

        MaximumRentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaximumRentTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(EmailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(LastnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(UsernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(MaximumRentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UserTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(CreateUserButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                    .addComponent(CancelButton))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(UserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(MaximumRentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(CreateUserButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
        this.AgentWindow.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void CreateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserButtonActionPerformed
       
       if(this.testRequirements() == true){
           
            boolean b;

            User user = null; 
            
            ISystemFacade facade = new SystemFacade();

            if ((String)UserTypeComboBox.getSelectedItem() == "Customer"){
                
                 user = new Customer(Long.parseLong(MaximumRentTextField.getText()), "Active", 
                         this.agent.getId(), NameTextField.getText(), LastnameTextField.getText(), 
                         EmailTextField.getText(), UsernameTextField.getText(), 
                         PasswordTextField.getText());
             }else{
                                
                 user = new Owner("Active",this.agent.getId(),                          
                         NameTextField.getText(), LastnameTextField.getText(), 
                         EmailTextField.getText(), UsernameTextField.getText(), 
                         PasswordTextField.getText());
             }

             b = facade.createUser(user);

             if (b == true){
                 this.dispose();
                 this.AgentWindow.setVisible(true);
             }
        
        }
        
    }//GEN-LAST:event_CreateUserButtonActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void LastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void UserTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTypeComboBoxActionPerformed
        if ((String)UserTypeComboBox.getSelectedItem() == "Customer"){
            MaximumRentTextField.setEnabled(true);
        }
        if ((String)UserTypeComboBox.getSelectedItem() == "Owner"){
            MaximumRentTextField.setEnabled(false);
            MaximumRentTextField.setText("");
        }
    }//GEN-LAST:event_UserTypeComboBoxActionPerformed

    private void MaximumRentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaximumRentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaximumRentTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccountWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccountWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccountWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccountWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CreateUserAccountWindow().setVisible(true);
            }
        });
    }
    
    private boolean testRequirements(){
        
        boolean b = true;
        boolean fill = true;
        
        if(UsernameTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if(UsernameTextField.getText().length() > 25){ 
                b = false;
                JOptionPane.showMessageDialog(null, "Username has a maximum lenght of 25 characters");
            }else{                
                if (isValid(UsernameTextField.getText(),"alphanumeric") == false){
                    JOptionPane.showMessageDialog(null, "Username can only contain letters and numbers. Write another else");
                    b = false;                
                }else{  
                    //validate unique username
                    ISystemFacade facade = new SystemFacade();
                    if (facade.validateUsername(UsernameTextField.getText(),(String)UserTypeComboBox.getSelectedItem()) == false){ 
                        b = false;
                    }
                }
            }
        }
        
        if(NameTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if(NameTextField.getText().length() > 25){ 
                b = false;
                JOptionPane.showMessageDialog(null, "Name has a maximum lenght of 25 characters");
            }else{
                if (isValid(NameTextField.getText(),"letters") == false){
                    b = false;
                    JOptionPane.showMessageDialog(null, "Name can contain only letters");
                }
            }
        }
        
        if(LastnameTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if(LastnameTextField.getText().length() > 25){ 
                b = false;
                JOptionPane.showMessageDialog(null, "Lastname has a maximum lenght of 25 characters");
            }else{
                if (isValid(LastnameTextField.getText(),"letters") == false){
                    b = false;
                    JOptionPane.showMessageDialog(null, "Lastname can contain only letters");
                }
            }
        }
        
        if(EmailTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if(EmailTextField.getText().length() > 35){ 
                b = false;
                JOptionPane.showMessageDialog(null, "Email has a maximum lenght of 35 characters");
            }else{
                if (isValid(EmailTextField.getText(),"email") == false){
                    b = false;
                    JOptionPane.showMessageDialog(null, "Email is incorrect");
                }
            }
        }
        
        if ((String)UserTypeComboBox.getSelectedItem() == "Customer"){
            if(MaximumRentTextField.getText().compareTo("") == 0){      
                b = false;
                fill = false;
            }else{
                if (isValid(MaximumRentTextField.getText(),"number") == false){
                    b = false;
                    JOptionPane.showMessageDialog(null, "Maximum rent can contain only numbers");
                }else{
                    if(MaximumRentTextField.getText().length() > 18){ 
                        b = false;
                        JOptionPane.showMessageDialog(null, "Maximum rent has a maximum lenght of 18 numbers");
                    }
                }                
            }
        }
        
        if(PasswordTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if(PasswordTextField.getText().length() > 16){ 
                b = false;
                JOptionPane.showMessageDialog(null, "Password has a maximum lenght of 16 characters");
            }else{
                if (isValid(PasswordTextField.getText(),"alphanumeric") == false){
                    JOptionPane.showMessageDialog(null, "Pasword can only contain letters and numbers. Write another else");
                    b = false;   
                }
            }
        }
        
        if (fill == false){
            JOptionPane.showMessageDialog(null, "Warning: you have to fill all the fields");
        }
        
        return b;
    }
    
    private boolean isValid (String toValid, String type){
        String regex = null;
        
        switch (type) {
            case "email":
                regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
                break;
            case "number":           
                regex = "[0-9]+";
                break;
            case "letters":
                regex = "[a-zA-Z ]+";
                break;
            case "alphanumeric":
                regex = "[a-zA-Z0-9]*";
                break;
        }
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(toValid);
        return matcher.matches();        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CreateUserButton;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField LastnameTextField;
    private javax.swing.JTextField MaximumRentTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JComboBox<String> UserTypeComboBox;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
