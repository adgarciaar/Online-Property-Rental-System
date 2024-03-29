/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import World.Agent;
import World.ISystemFacade;
import World.Property;
import World.SystemFacade;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class VerPendientesAprobacionWindow extends javax.swing.JFrame {
    
    private final Agent agent;
    private final JFrame ventanaPrevia;
    private LinkedHashMap<Integer,Property> listaPropiedades;
    private Property property;

    /**
     * Creates new form VerPendientesAprobacionWindow
     * @param agent
     * @param ventanaPrevia
     * @param listaPropiedades
     */
    public VerPendientesAprobacionWindow(Agent agent, LinkedHashMap<Integer,Property> listaPropiedades,JFrame ventanaPrevia) {
        initComponents();
        this.agent = agent;
        this.ventanaPrevia = ventanaPrevia;
        this.listaPropiedades = listaPropiedades;
        establecerPropiedades();
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
        TipoTextField = new javax.swing.JTextField();
        DireccionTextField = new javax.swing.JTextField();
        PropietarioTextField = new javax.swing.JTextField();
        CambiarEstadoButton = new javax.swing.JButton();
        AtrasButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PropiedadesComboBox = new javax.swing.JComboBox<>();
        MostrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo de propiedad");

        jLabel3.setText("Dirección");

        jLabel4.setText("Nombre del propietario");

        TipoTextField.setEnabled(false);

        DireccionTextField.setEnabled(false);

        PropietarioTextField.setEnabled(false);

        CambiarEstadoButton.setText("Cambiar a activa");
        CambiarEstadoButton.setEnabled(false);
        CambiarEstadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarEstadoButtonActionPerformed(evt);
            }
        });

        AtrasButton.setText("Atrás");
        AtrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Propiedades");

        MostrarButton.setText("Mostrar");
        MostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(CambiarEstadoButton)
                .addGap(89, 89, 89)
                .addComponent(AtrasButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TipoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(DireccionTextField)
                            .addComponent(PropietarioTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)
                        .addComponent(PropiedadesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(MostrarButton)))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PropiedadesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MostrarButton))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PropietarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtrasButton)
                    .addComponent(CambiarEstadoButton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasButtonActionPerformed
        this.dispose();
        this.ventanaPrevia.setVisible(true);
    }//GEN-LAST:event_AtrasButtonActionPerformed

    private void CambiarEstadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarEstadoButtonActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Esta seguro?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        
            this.property.setDeletion_status("pendiente de aprobacion");
            ISystemFacade facade = new SystemFacade();   
            boolean b;
            b = facade.activarPropiedadPendiente(this.property.getId());
            
            if(b == true){
                
                this.limpiar();        
                PropiedadesComboBox.removeAllItems();               
                
                listaPropiedades = facade.buscarPropiedadesPorAprobar();

                if (listaPropiedades == null){  
                    JOptionPane.showMessageDialog(null, "Problema trayendo las propiedades"); 
                    this.dispose();
                    this.ventanaPrevia.setVisible(true);
                }else if (listaPropiedades.isEmpty() == true) {
                    JOptionPane.showMessageDialog(null, "No hay propiedades pendientes de aprobacion");
                    this.dispose();
                    this.ventanaPrevia.setVisible(true);                
                }
                establecerPropiedades();
                
            }else{
                JOptionPane.showMessageDialog(null, "Problema cambiando el estado");
            }         
        
        }
    }//GEN-LAST:event_CambiarEstadoButtonActionPerformed

    private void MostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarButtonActionPerformed
        mostrarPropiedad();
    }//GEN-LAST:event_MostrarButtonActionPerformed

    private void establecerPropiedades(){
        
        PropiedadesComboBox.removeAllItems();
        
        Property prop;
        
        Set set = this.listaPropiedades.entrySet();        
        Iterator iterator = set.iterator();
        
        ISystemFacade facade = new SystemFacade(); 

        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();               
            prop = (Property) mentry.getValue();
            
            String nameLocation = facade.retrieveNameLocation(prop.getIdLocation());
            if (nameLocation == null){
                nameLocation = "Problema trayendo ubicacion";
            }
            
            PropiedadesComboBox.addItem(prop.getId()+". "+prop.getType()
                    +" located in "+nameLocation
                    +" with "+prop.getNumber_rooms()+" rooms and rent of "
                    +prop.getRent());            
        }
    }
    
    private void mostrarPropiedad(){
        
        this.limpiar();             
        
        String propertyData = (String)PropiedadesComboBox.getSelectedItem(); 
        
        int pointIndex = propertyData.indexOf(".");        
        
        int idProperty = Integer.parseInt(propertyData.substring(0, pointIndex));
        
        this.property = this.listaPropiedades.get(idProperty);
        
        TipoTextField.setText(this.property.getType());
        DireccionTextField.setText(this.property.getAddress());
        
        ISystemFacade facade = new SystemFacade();      
        String nombrePropietario = facade.traerNombrePropietario(this.property.getIdOwner());
        if (nombrePropietario == null){
            nombrePropietario = "Problema trayendo nombre";
        }
        PropietarioTextField.setText(nombrePropietario);      
        CambiarEstadoButton.setEnabled(true);
        
    }
    
    private void limpiar(){
        TipoTextField.setText("");     
        DireccionTextField.setText("");        
        PropietarioTextField.setText("");
        CambiarEstadoButton.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasButton;
    private javax.swing.JButton CambiarEstadoButton;
    private javax.swing.JTextField DireccionTextField;
    private javax.swing.JButton MostrarButton;
    private javax.swing.JComboBox<String> PropiedadesComboBox;
    private javax.swing.JTextField PropietarioTextField;
    private javax.swing.JTextField TipoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
