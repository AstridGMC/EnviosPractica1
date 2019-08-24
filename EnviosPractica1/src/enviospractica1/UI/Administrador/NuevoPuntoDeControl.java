/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviospractica1.UI.Administrador;

import enviospractica1.Backend.PuntoControl;
import enviospractica1.ConectorMySQL;
import enviospractica1.UI.IngresarUsuario;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author astridmc
 */
public class NuevoPuntoDeControl extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevoPuntoDeControl
     */
    private int contador=1;
    private String codRuta;
    private String codigoPunto;
    PuntoControl puntoControl = new PuntoControl();
    public NuevoPuntoDeControl(int codPunto) {
        initComponents();
        Diseño(codPunto);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPrecios = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LblTitulo3 = new javax.swing.JLabel();
        txtCodPunto = new javax.swing.JLabel();
        lblCodRutaPunto = new javax.swing.JLabel();
        rdPrecioGlobal = new javax.swing.JRadioButton();
        rdPrecioIndividual = new javax.swing.JRadioButton();
        panelPrecioIndividual = new javax.swing.JPanel();
        lblCodRuta2 = new javax.swing.JLabel();
        txtPrecioIndividual = new javax.swing.JTextField();
        rutas = new javax.swing.JComboBox<>();
        lblAsignarRuta = new javax.swing.JLabel();
        btnGuardar2 = new javax.swing.JButton();
        lblPaquetesCola = new javax.swing.JLabel();
        txtPaquetesEnCola = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(141, 234, 179));

        LblTitulo3.setFont(new java.awt.Font("Abyssinica SIL", 1, 30)); // NOI18N
        LblTitulo3.setForeground(new java.awt.Color(30, 65, 32));
        LblTitulo3.setText("CREACION DE NUEVO PUNTO DE CONTROL");

        txtCodPunto.setFont(new java.awt.Font("Abyssinica SIL", 1, 28)); // NOI18N
        txtCodPunto.setForeground(new java.awt.Color(1, 101, 168));
        txtCodPunto.setText("*********");

        lblCodRutaPunto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCodRutaPunto.setForeground(new java.awt.Color(30, 65, 32));
        lblCodRutaPunto.setText("CODIGO DEL PUNTO DE CONTROL:");

        rdPrecioGlobal.setBackground(new java.awt.Color(141, 234, 179));
        grupoPrecios.add(rdPrecioGlobal);
        rdPrecioGlobal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rdPrecioGlobal.setForeground(new java.awt.Color(30, 65, 32));
        rdPrecioGlobal.setText("Conservar Precio Global");
        rdPrecioGlobal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdPrecioGlobalMouseClicked(evt);
            }
        });
        rdPrecioGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPrecioGlobalActionPerformed(evt);
            }
        });

        rdPrecioIndividual.setBackground(new java.awt.Color(141, 234, 179));
        grupoPrecios.add(rdPrecioIndividual);
        rdPrecioIndividual.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rdPrecioIndividual.setForeground(new java.awt.Color(30, 65, 32));
        rdPrecioIndividual.setText("Asignar Precio individual");
        rdPrecioIndividual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdPrecioIndividualMouseClicked(evt);
            }
        });
        rdPrecioIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPrecioIndividualActionPerformed(evt);
            }
        });

        panelPrecioIndividual.setBackground(new java.awt.Color(141, 234, 179));

        lblCodRuta2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCodRuta2.setForeground(new java.awt.Color(30, 65, 32));
        lblCodRuta2.setText("Q.");

        txtPrecioIndividual.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtPrecioIndividual.setForeground(new java.awt.Color(13, 58, 12));
        txtPrecioIndividual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioIndividualMouseClicked(evt);
            }
        });
        txtPrecioIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioIndividualActionPerformed(evt);
            }
        });
        txtPrecioIndividual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioIndividualKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelPrecioIndividualLayout = new javax.swing.GroupLayout(panelPrecioIndividual);
        panelPrecioIndividual.setLayout(panelPrecioIndividualLayout);
        panelPrecioIndividualLayout.setHorizontalGroup(
            panelPrecioIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrecioIndividualLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblCodRuta2)
                .addGap(18, 18, 18)
                .addComponent(txtPrecioIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        panelPrecioIndividualLayout.setVerticalGroup(
            panelPrecioIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrecioIndividualLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblCodRuta2)
                .addContainerGap())
            .addGroup(panelPrecioIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPrecioIndividual))
        );

        rutas.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        rutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "******" }));
        rutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rutasMousePressed(evt);
            }
        });
        rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutasActionPerformed(evt);
            }
        });

        lblAsignarRuta.setFont(new java.awt.Font("Abyssinica SIL", 1, 28)); // NOI18N
        lblAsignarRuta.setForeground(new java.awt.Color(30, 65, 32));
        lblAsignarRuta.setText("Asignar Ruta:");

        btnGuardar2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnGuardar2.setText("GUARDAR");
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });

        lblPaquetesCola.setFont(new java.awt.Font("Abyssinica SIL", 1, 28)); // NOI18N
        lblPaquetesCola.setForeground(new java.awt.Color(30, 65, 32));
        lblPaquetesCola.setText("Cantidad de Paquetes en cola:");

        txtPaquetesEnCola.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtPaquetesEnCola.setForeground(new java.awt.Color(13, 58, 12));
        txtPaquetesEnCola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPaquetesEnColaMouseClicked(evt);
            }
        });
        txtPaquetesEnCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaquetesEnColaActionPerformed(evt);
            }
        });
        txtPaquetesEnCola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaquetesEnColaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPaquetesCola)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPaquetesEnCola, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblCodRutaPunto)
                            .addGap(18, 18, 18)
                            .addComponent(txtCodPunto))
                        .addComponent(rdPrecioGlobal)
                        .addComponent(LblTitulo3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblAsignarRuta)
                            .addGap(112, 112, 112)
                            .addComponent(rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rdPrecioIndividual)
                            .addGap(46, 46, 46)
                            .addComponent(panelPrecioIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(LblTitulo3)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodPunto)
                    .addComponent(lblCodRutaPunto))
                .addGap(37, 37, 37)
                .addComponent(rdPrecioGlobal)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(rdPrecioIndividual))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelPrecioIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsignarRuta)
                    .addComponent(rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPaquetesCola)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPaquetesEnCola, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar2)))
                .addGap(20, 43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdPrecioGlobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPrecioGlobalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdPrecioGlobalActionPerformed

    private void rdPrecioIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPrecioIndividualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdPrecioIndividualActionPerformed

    private void txtPrecioIndividualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioIndividualMouseClicked
    
    }//GEN-LAST:event_txtPrecioIndividualMouseClicked

    private void txtPrecioIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioIndividualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioIndividualActionPerformed

    private void txtPrecioIndividualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioIndividualKeyTyped
        char a = evt.getKeyChar();
        if(a<'0'||a>'9') evt.consume();
        contador =1;
    }//GEN-LAST:event_txtPrecioIndividualKeyTyped

    private void rutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutasActionPerformed

    }//GEN-LAST:event_rutasActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        obtenerRuta();
        contador =1;
        botonElegido(IngresarUsuario.conector);
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void rutasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutasMousePressed
        if(contador ==1){
        puntoControl.ListarRutas(IngresarUsuario.conector, rutas);
        contador =2;
        }
    }//GEN-LAST:event_rutasMousePressed

    private void rdPrecioIndividualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdPrecioIndividualMouseClicked
        panelPrecioIndividual.setVisible(true);
    }//GEN-LAST:event_rdPrecioIndividualMouseClicked

    private void rdPrecioGlobalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdPrecioGlobalMouseClicked
        panelPrecioIndividual.setVisible(false);
    }//GEN-LAST:event_rdPrecioGlobalMouseClicked

    private void txtPaquetesEnColaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaquetesEnColaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaquetesEnColaMouseClicked

    private void txtPaquetesEnColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaquetesEnColaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaquetesEnColaActionPerformed

    private void txtPaquetesEnColaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaquetesEnColaKeyTyped
        char a = evt.getKeyChar();
        if(a<'0'||a>'9') evt.consume();
    }//GEN-LAST:event_txtPaquetesEnColaKeyTyped

    private void obtenerRuta(){
        if(rutas.getSelectedItem() != "******"){
            codRuta = rutas.getSelectedItem().toString();
            contador =1;
        }else{
            JOptionPane.showMessageDialog(null,"no ha especificado ruta");
        }
    }
    
    private boolean validarCapacidad(){
        if(txtPaquetesEnCola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"NO HA ESPECIFICADO EL PRECIO INDIVIDUAL");
            this.setVisible(true);
            return false;
        }else{
            puntoControl.setCapacidad(Integer.parseInt(txtPaquetesEnCola.getText()));
            return true;
        }
    }
    // segun el tipo de precio elegido guarda la ruta 
    private void botonElegido(ConectorMySQL conector){
        if(rdPrecioGlobal.isSelected()){
            if(validarCapacidad()){
                if(puntoControl.GuardarPuntoPrecioGlobal(conector, codigoPunto, codRuta)){
                    this.setVisible(false);
                }
            }
        }else if(rdPrecioIndividual.isSelected()){
            if(txtPrecioIndividual.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null,"NO HA ESPECIFICADO EL PRECIO INDIVIDUAL");
                this.setVisible(true);
            }else if(validarCapacidad()){
               if( puntoControl.GuardarPuntoPrecioIndividual(conector, codigoPunto, codRuta, Integer.parseInt(txtPrecioIndividual.getText()))){
                    this.setVisible(false);
               }
            }
        }else if(!rdPrecioIndividual.isSelected() && !rdPrecioGlobal.isSelected()){
            JOptionPane.showMessageDialog(null,"NO HA ESPECIFICADO EL PRECIO");
        }
    }
    
    private void Diseño( int codPunto){
        System.out.println(codPunto);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("NUEVO PUNTO DE CONTROL");
        codigoPunto = "P"+ codPunto;
        txtCodPunto.setText(codigoPunto);
        panelPrecioIndividual.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTitulo3;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.ButtonGroup grupoPrecios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAsignarRuta;
    private javax.swing.JLabel lblCodRuta2;
    private javax.swing.JLabel lblCodRutaPunto;
    private javax.swing.JLabel lblPaquetesCola;
    private javax.swing.JPanel panelPrecioIndividual;
    private javax.swing.JRadioButton rdPrecioGlobal;
    private javax.swing.JRadioButton rdPrecioIndividual;
    private javax.swing.JComboBox<String> rutas;
    private javax.swing.JLabel txtCodPunto;
    private javax.swing.JTextField txtPaquetesEnCola;
    private javax.swing.JTextField txtPrecioIndividual;
    // End of variables declaration//GEN-END:variables
}
