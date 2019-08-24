/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviospractica1.UI.Administrador;

import enviospractica1.ConectorMySQL;
import enviospractica1.UI.IngresarUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author astridmc
 */
public class DesactivaUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form DesactivaUsuario
     */
    IngresarUsuario usuario = new IngresarUsuario();
    private String CUI;
    private String estado;
    private String rango;
    private String nombre;

    public DesactivaUsuario() {
        initComponents();
        Diseño();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        txtCUI = new javax.swing.JTextField();
        lblCU = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        panelDatosReconocidos = new javax.swing.JPanel();
        txtNombresUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblRango = new javax.swing.JLabel();
        txtRango = new javax.swing.JLabel();
        lblRango1 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        btnEstado = new javax.swing.JButton();
        LblTitulo3 = new javax.swing.JLabel();

        panelFondo.setBackground(new java.awt.Color(141, 234, 179));

        txtCUI.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtCUI.setForeground(new java.awt.Color(13, 58, 12));
        txtCUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCUIActionPerformed(evt);
            }
        });
        txtCUI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCUIKeyTyped(evt);
            }
        });

        lblCU.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCU.setForeground(new java.awt.Color(30, 65, 32));
        lblCU.setText("Ingrese Numero de CUI:");

        btnBuscar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        panelDatosReconocidos.setBackground(new java.awt.Color(129, 240, 194));
        panelDatosReconocidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 201, 178), 3, true));

        txtNombresUsuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtNombresUsuario.setText("****************************");

        lblNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(30, 65, 32));
        lblNombreUsuario.setText("Nombre del usuario :");

        lblRango.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRango.setForeground(new java.awt.Color(30, 65, 32));
        lblRango.setText("RANGO:");

        txtRango.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtRango.setText("****************************");

        lblRango1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRango1.setForeground(new java.awt.Color(30, 65, 32));
        lblRango1.setText("ESTADO:");

        txtEstado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtEstado.setText("****************************");

        javax.swing.GroupLayout panelDatosReconocidosLayout = new javax.swing.GroupLayout(panelDatosReconocidos);
        panelDatosReconocidos.setLayout(panelDatosReconocidosLayout);
        panelDatosReconocidosLayout.setHorizontalGroup(
            panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosReconocidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreUsuario)
                    .addComponent(lblRango)
                    .addComponent(lblRango1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstado)
                    .addComponent(txtRango)
                    .addComponent(txtNombresUsuario))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelDatosReconocidosLayout.setVerticalGroup(
            panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosReconocidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosReconocidosLayout.createSequentialGroup()
                        .addComponent(lblNombreUsuario)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosReconocidosLayout.createSequentialGroup()
                        .addComponent(txtNombresUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRango)
                    .addComponent(txtRango))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRango1)
                    .addComponent(txtEstado))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnEstado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnEstado.setText("DESACTIVAR");
        btnEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoActionPerformed(evt);
            }
        });

        LblTitulo3.setFont(new java.awt.Font("Abyssinica SIL", 1, 28)); // NOI18N
        LblTitulo3.setForeground(new java.awt.Color(30, 65, 32));
        LblTitulo3.setText("DESACTIVACION DE UN  USUARIO");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCU)
                        .addGap(18, 18, 18)
                        .addComponent(txtCUI, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(435, 435, 435)
                                .addComponent(btnEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(LblTitulo3))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(panelDatosReconocidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LblTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCU)
                    .addComponent(txtCUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(28, 28, 28)
                .addComponent(panelDatosReconocidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoActionPerformed
        validarCUI();
        if (verificador == 2) {
            if("DESACTIVAR".equals(btnEstado.getText())){
                System.out.println("DESACTIVAR");
                this.setVisible(false);
                DesactivarUsuario(IngresarUsuario.conector);
            } else if("ACTIVAR".equals(btnEstado.getText())){
                ActivarUsuario(IngresarUsuario.conector);
                this.setVisible(false);
            }
            
        }
    }//GEN-LAST:event_btnEstadoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        validarCUI();
        if (verificador == 2) {
            if(ReconocerUsuario(IngresarUsuario.conector)){
                panelDatosReconocidos.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCUIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCUIKeyTyped
        char b = evt.getKeyChar();
        if (b < '0' || b > '9') {
            evt.consume();
        }
        if (txtCUI.getText().length() == 13) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCUIKeyTyped

    private void txtCUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCUIActionPerformed

    private int verificador = 1;

    private void validarCUI() {
        if (txtCUI.getText().length() != 13 || txtCUI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CUI requiere 13 digitos");
            verificador = 1;
        } else if (txtCUI.getText().length() == 13 || !txtCUI.getText().isEmpty()) {
            verificador = 2;
        }
    }

    private boolean ReconocerUsuario(ConectorMySQL conector) {
        try {
            CUI = txtCUI.getText();
            System.out.println(conector.getConexion().getHost());
            Statement instruccionSQL2 = conector.getConexion().createStatement();
            System.out.println(CUI);
            instruccionSQL2.execute("USE enviosPractica");
            ResultSet resultadosConsulta = instruccionSQL2.executeQuery("SELECT * FROM Usuario WHERE cuiOperador ='" + CUI + "'");
            //instruccionSQL2.executeUpdate("")
            if (resultadosConsulta.first()) {
                System.out.println("correcto si encontrado por CUI");
                Buscar(conector);
                return true;        //usuario validado correctamente
            } else if (!resultadosConsulta.first()) {
                System.out.println("incorrecto");
                JOptionPane.showMessageDialog(null, "el usuario no existe en la base de datos");

                return false;        //usuario validado incorrectamente
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(" incorrecto usuario no existe en base de datos");

            return false;
        }
    }

    private void DesactivarUsuario(ConectorMySQL conector) {
        try {
            CUI = txtCUI.getText();
            Statement instruccionSQL2 = conector.getConexion().createStatement();
            instruccionSQL2.execute("USE enviosPractica");
            instruccionSQL2.executeUpdate("UPDATE enviosPractica.Usuario SET estado ='" + Estado() + "' WHERE cuiOperador = '" + CUI + "';");
            instruccionSQL2.execute("REVOKE '"+rango +"' FROM '" +nombre +"';");
            instruccionSQL2.execute( "GRANT '"+rango+"' TO '"+nombre+ "';");
            JOptionPane.showMessageDialog(null,"El usuario se Ha DESACTIVADO con exito");
            VaciarCampos();
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }
    
    private void ActivarUsuario(ConectorMySQL conector){
         try {
            CUI = txtCUI.getText();
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.execute("USE enviosPractica");
            instruccionSQL3.executeUpdate("UPDATE enviosPractica.Usuario SET estado ='" + Estado() + "' WHERE cuiOperador = '" + CUI + "';");
            instruccionSQL3.execute( "GRANT '"+rango+"' TO '"+nombre+ "';");
            instruccionSQL3.execute("SET DEFAULT ROLE ALL TO '" +nombre+"'@'%';");
            JOptionPane.showMessageDialog(null,"El usuario se Ha ACTIVADO con exito");
            VaciarCampos();
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }

    private void Buscar(ConectorMySQL conector) {
        Statement instruccionSQL5;
        try {
            System.out.println(conector.getConexion().getHost());
            instruccionSQL5 = conector.getConexion().createStatement();
            instruccionSQL5.execute("USE enviosPractica");
            ResultSet obtenerDato = instruccionSQL5.executeQuery("SELECT * FROM Usuario WHERE cuiOperador = '" + CUI + "'");
            System.out.println(obtenerDato.first());
            System.out.println("si funciona");
            nombre = obtenerDato.getString("nombreUsuario");
             rango = obtenerDato.getString("rango");
            estado = obtenerDato.getString("estado");
            System.out.println(nombre);
            System.out.println(estado);
            System.out.println(rango);
            txtNombresUsuario.setText(nombre);
            txtRango.setText(rango);
            txtEstado.setText(estado);
            Estado();
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");

        }
    }
    //reconoce la accion del boton activar/desactivar
    private String Estado(){
        if("Activo".equals(estado)){
            btnEstado.setText("DESACTIVAR");
            return "Inactivo";
        }else if("Inactivo".equals(estado)){
            btnEstado.setText("ACTIVAR");
            return "Activo";
        }else{
            return estado;
        }
    }

    private void Diseño() {
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("DESACTIVAR/ ACTIVAR USUSARIO");
        panelDatosReconocidos.setVisible(false);
    }

    private void VaciarCampos() {
        panelDatosReconocidos.setVisible(false);
        txtCUI.setText("              ");
        txtEstado.setText("*************************");
        txtNombresUsuario.setText("*************************");
        txtRango.setText("*************************");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTitulo3;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEstado;
    private javax.swing.JLabel lblCU;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblRango;
    private javax.swing.JLabel lblRango1;
    private javax.swing.JPanel panelDatosReconocidos;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtCUI;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtNombresUsuario;
    private javax.swing.JLabel txtRango;
    // End of variables declaration//GEN-END:variables
}
