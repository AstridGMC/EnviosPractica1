/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviospractica1.UI;

import com.mysql.jdbc.Connection;
import enviospractica1.ConectorMySQL;
import java.lang.NullPointerException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author astridmc
 */
public class IngresarUsuario extends javax.swing.JDialog {

    private String usuario ;
    private String password;
    
    
    /**
     * Creates new form ingresarUsuario
     */
    public IngresarUsuario(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        lblImagen.setVisible(false);
        VaciarCampos();
        this.setLocationRelativeTo(null);
    }

    public IngresarUsuario() {
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        LblTitulo1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 175, 163), 4));

        LblTitulo.setFont(new java.awt.Font("Abyssinica SIL", 1, 28)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(254, 254, 254));
        LblTitulo.setText("Ingrese su contraseña:");

        txtNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });

        LblTitulo1.setFont(new java.awt.Font("Abyssinica SIL", 1, 28)); // NOI18N
        LblTitulo1.setForeground(new java.awt.Color(254, 254, 254));
        LblTitulo1.setText("Ingrese su nombre de usuario:");

        txtContraseña.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtContraseña.setText("jPasswordField1");
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/incorrecto.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("ACCEDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(LblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(296, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(LblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(LblTitulo1)
                    .addContainerGap(216, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        txtContraseña.setText("");
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        obtenerDatos();
        
        try {
            ValidadorUsuario();
        } catch (IOException ex) {
            Logger.getLogger(IngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public static ConectorMySQL conector; 
    
    public void obtenerDatos(){
        usuario = txtNombreUsuario.getText();
        password = txtContraseña.getText();
        conector = new ConectorMySQL(usuario,password); 
        conector.conector();
    }
    
    public void ValidadorUsuario() throws IOException{
            
        //chekar si el usuario escrbio el nombre de usuario y pw
        if (txtNombreUsuario.getText().length() > 0 && txtContraseña.getPassword().length > 0 ){
            // Si el usuario si fue validado correctamente
            if(ValidarUsuario(conector.getConexion())){
                lblImagen.setVisible(false);
                setVisible(false);
                VaciarCampos();
            }else {
                lblImagen.setVisible(true);
                
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe escribir nombre de usuario y contrasenia.\n" +
                    "NO puede dejar ningun campo vacio");
            
        }
                 
            }
    
     public  boolean ValidarUsuario( Connection conexion ) throws NullPointerException {
        try{
            if(conexion != null){
                Statement instruccionSQL2 = conexion.createStatement();
                ResultSet resultadosConsulta = instruccionSQL2.executeQuery ("SELECT * FROM Usuario WHERE nombreUsuario ='"+usuario+"' AND passwordUser='"+password+"' AND estado = 'Activo'");

                if( resultadosConsulta.first()){   
                    System.out.println("correcto");
                    return true;        //usuario validado correctamente
                }else  if(!resultadosConsulta.first()){
                    System.out.println("incorrecto" + usuario + password);

                    return false;        //usuario validado incorrectamente
                }else{
                    return false;
                }
            } else{
                return false;
            }
        } catch ( SQLException e ){
            System.out.println(" incorrecto" + usuario + password+"no existe en base de datos");
            return false;
        }
 
    }

    public int reconocerUsuario(){
            
            if(conector != null){
                int validacionRango = conector.ValidarRango(conector.getConexion());
                if(validacionRango==1){
                    System.out.println(1);
                    return 1;
                } else if (validacionRango==2){
                    System.out.println(2);
                    return 2;
                } else if(validacionRango==3){
                    System.out.println(3);
                    return 3;
                }else{
                    System.out.println("nada encontrado");
                    return 0;
                }
            }else{
                    System.out.println("no encontrado");
                    return 4;
                }
    }
    
    
     private void VaciarCampos(){
        txtNombreUsuario.setText("");
        txtContraseña.setText("             ");
        lblImagen.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JLabel LblTitulo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
