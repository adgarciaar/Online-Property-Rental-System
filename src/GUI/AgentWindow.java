/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import World.Agent;
import javax.swing.JFrame;

/**
 *
 * @author adrian
 */
public class AgentWindow extends javax.swing.JFrame {
    
    private final Agent agent;
    private final JFrame LoginWindow;

    /**
     * Creates new form AgentWindow
     * @param agent
     */
    public AgentWindow(Agent agent, JFrame LoginWindow) {
        initComponents();
        this.agent = agent;
        this.LoginWindow = LoginWindow;
        WelcomeLabel.setText("Welcome, agent "+this.agent.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomeLabel = new javax.swing.JLabel();
        CreateAccountButton = new javax.swing.JButton();
        SignOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setText("Welcome, agent");

        CreateAccountButton.setText("Create user account");
        CreateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountButtonActionPerformed(evt);
            }
        });

        SignOutButton.setText("Sign out");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateAccountButton)
                        .addGap(45, 45, 45)
                        .addComponent(SignOutButton))
                    .addComponent(WelcomeLabel))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(WelcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateAccountButton)
                    .addComponent(SignOutButton))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButtonActionPerformed
        this.dispose();
        new CreateUserAccountWindow(this.agent, this).setVisible(true);
    }//GEN-LAST:event_CreateAccountButtonActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        this.dispose();
        this.LoginWindow.setVisible(true);
    }//GEN-LAST:event_SignOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AgentWindow().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccountButton;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration//GEN-END:variables
}