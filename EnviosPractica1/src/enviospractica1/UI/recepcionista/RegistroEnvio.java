/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviospractica1.UI.recepcionista;

import enviospractica1.UI.Factura;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author astridmc
 */
public class RegistroEnvio extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroEnvio
     */
    
    Frame f = JOptionPane.getFrameForComponent(this);
    
    Factura factura = new Factura(f);
    
    public RegistroEnvio() {
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
        lblNIT = new javax.swing.JLabel();
        lblConsejo = new javax.swing.JLabel();
        rBtnCF = new javax.swing.JRadioButton();
        panelDatos = new javax.swing.JPanel();
        lblNombre1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion1 = new javax.swing.JLabel();
        txtDireccion2 = new javax.swing.JTextField();
        lblDestino = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblDescripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblDatos = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtNIT = new javax.swing.JTextField();
        panelDatosReconocidos = new javax.swing.JPanel();
        lblNombres = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCUI = new javax.swing.JLabel();
        lblCUI1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        rBtnPrioridad = new javax.swing.JRadioButton();
        txtDescripcion = new javax.swing.JTextField();
        lblTotal1 = new javax.swing.JLabel();
        lblDatos1 = new javax.swing.JLabel();
        lblDatos2 = new javax.swing.JLabel();
        lblPrioridad = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();

        panelFondo.setBackground(new java.awt.Color(141, 234, 179));

        lblNIT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNIT.setForeground(new java.awt.Color(30, 65, 32));
        lblNIT.setText("Ingrese Numero de NIT:");

        lblConsejo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblConsejo.setText("Si el cliente no esta ingresado  en el sistema favor  Registrarlo antes :");

        rBtnCF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rBtnCF.setText("CONSUMIDOR FINAL");
        rBtnCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnCFActionPerformed(evt);
            }
        });

        panelDatos.setBackground(new java.awt.Color(129, 240, 194));
        panelDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 201, 178), 3, true));

        lblNombre1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(30, 65, 32));
        lblNombre1.setText("Ingrese Nombres :");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(13, 58, 12));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblDireccion1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblDireccion1.setForeground(new java.awt.Color(30, 65, 32));
        lblDireccion1.setText("Ingrese Direccion:");

        txtDireccion2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtDireccion2.setForeground(new java.awt.Color(13, 58, 12));
        txtDireccion2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccion2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion1)
                    .addComponent(lblNombre1))
                .addGap(69, 69, 69)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion1)
                    .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblDestino.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(30, 65, 32));
        lblDestino.setText("DESTINO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDescripcion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(30, 65, 32));
        lblDescripcion.setText("DESCRIPCION");

        lblDatos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDatos.setText("DATOS DEL PAQUETE:");

        txtPeso.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(13, 58, 12));
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Kg.");

        lblPeso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(30, 65, 32));
        lblPeso.setText("PESO ");

        txtNIT.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNIT.setForeground(new java.awt.Color(13, 58, 12));
        txtNIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNITActionPerformed(evt);
            }
        });
        txtNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNITKeyTyped(evt);
            }
        });

        panelDatosReconocidos.setBackground(new java.awt.Color(129, 240, 194));
        panelDatosReconocidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 201, 178), 3, true));

        lblNombres.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombres.setText("****************************");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(30, 65, 32));
        lblNombre.setText("Nombre del remitente :");

        lblCUI.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCUI.setForeground(new java.awt.Color(30, 65, 32));
        lblCUI.setText("Numero de cui:");

        lblCUI1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCUI1.setText("****************************");

        javax.swing.GroupLayout panelDatosReconocidosLayout = new javax.swing.GroupLayout(panelDatosReconocidos);
        panelDatosReconocidos.setLayout(panelDatosReconocidosLayout);
        panelDatosReconocidosLayout.setHorizontalGroup(
            panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosReconocidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosReconocidosLayout.createSequentialGroup()
                        .addComponent(lblCUI)
                        .addGap(121, 121, 121)
                        .addComponent(lblCUI1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosReconocidosLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombres)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelDatosReconocidosLayout.setVerticalGroup(
            panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosReconocidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosReconocidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCUI)
                    .addComponent(lblCUI1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnGuardar.setText("Generar Factura");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        rBtnPrioridad.setBackground(new java.awt.Color(21, 53, 44));
        rBtnPrioridad.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rBtnPrioridad.setForeground(new java.awt.Color(254, 254, 254));
        rBtnPrioridad.setText("PRIORIDAD");
        rBtnPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnPrioridadActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(13, 58, 12));

        lblTotal1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(146, 7, 7));
        lblTotal1.setText("Q.");

        lblDatos1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDatos1.setText(".00");

        lblDatos2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDatos2.setForeground(new java.awt.Color(176, 1, 1));
        lblDatos2.setText("******");

        lblPrioridad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPrioridad.setText(".");

        btnAgregar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAgregar.setText("Añadir Envio");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatosReconocidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(lblTotal1)
                        .addGap(18, 18, 18)
                        .addComponent(lblDatos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDatos1)
                        .addGap(46, 46, 46)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(lblNIT)
                        .addGap(52, 52, 52)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rBtnCF)
                            .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblConsejo)
                    .addComponent(lblDatos)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addGap(41, 41, 41)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(lblDestino)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(lblPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(rBtnPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsejo)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNIT)
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rBtnCF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatosReconocidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDestino)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(lblPeso)))
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBtnPrioridad)
                .addGap(2, 2, 2)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblPrioridad))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotal1)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDatos2)
                                .addComponent(lblDatos1)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rBtnPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnPrioridadActionPerformed
        prioridad();
    }//GEN-LAST:event_rBtnPrioridadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        factura.show();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNITKeyTyped
        char f = evt.getKeyChar();
        if(f<'0'||f>'9') evt.consume();
        if(txtNIT.getText().length()==7) txtNIT.setText(txtNIT.getText()+"-");

        if(txtNIT.getText().length()==9) evt.consume();
    }//GEN-LAST:event_txtNITKeyTyped

    private void txtNITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNITActionPerformed

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        char f = evt.getKeyChar();
        if(f<'0'||f>'9') evt.consume();
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtDireccion2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccion2KeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A'||c>'z')&&(c<' '|| c>' ')) {
            evt.consume();}
    }//GEN-LAST:event_txtDireccion2KeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A'||c>'z')&&(c<' '|| c>' ')) {
            evt.consume();}
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void rBtnCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnCFActionPerformed
        Campos();
    }//GEN-LAST:event_rBtnCFActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        vaciarCampos();
    }//GEN-LAST:event_btnAgregarActionPerformed


    private void Diseño(){
        panelDatos.setVisible(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("REGISTRAR NUEVO EVNVIO");
        Campos();
        vaciarCampos();
    }
    
    private void Campos(){
        if(rBtnCF.isSelected()){
            panelDatos.setVisible(true);
            panelDatosReconocidos.setVisible(false);
        }else if(!rBtnCF.isSelected()){
            panelDatos.setVisible(false);
            panelDatosReconocidos.setVisible(true);
        }
    }
    
    public void prioridad(){
        if(rBtnPrioridad.isSelected()){
            lblPrioridad.setText("se agregaran Q."+ "  a su factura");
        } else if(!rBtnPrioridad.isSelected()){
            lblPrioridad.setText(" ");
        }
    }
    
    public void vaciarCampos(){
        txtDescripcion.setText(" ");
        txtDireccion2.setText(" ");
        txtNIT.setText("");
        txtNombre.setText(" ");
        txtPeso.setText(" ");
        rBtnCF.setSelected(false);
        rBtnPrioridad.setSelected(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCUI;
    private javax.swing.JLabel lblCUI1;
    private javax.swing.JLabel lblConsejo;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblDatos1;
    private javax.swing.JLabel lblDatos2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblNIT;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPrioridad;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatosReconocidos;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JRadioButton rBtnCF;
    private javax.swing.JRadioButton rBtnPrioridad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
