/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviospractica1.UI;

import enviospractica1.UI.Administrador.AdministradorInterface;
import enviospractica1.UI.operador.OperadorInterface;
import enviospractica1.UI.recepcionista.RecepcionistaInterface;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author astridmc
 */
public class Principal extends javax.swing.JFrame {

    IngresarUsuario acceder = new IngresarUsuario(this);
    RecepcionistaInterface recepcionistaInterface = new RecepcionistaInterface();
    OperadorInterface operadorInterface = new OperadorInterface();
    AdministradorInterface AdministradorInterface = new AdministradorInterface();

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopUsuarios = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        barraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnRecepcionista = new javax.swing.JMenuItem();
        btnAdministrador = new javax.swing.JMenuItem();
        btnOPerador = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopUsuarios.setBackground(new java.awt.Color(197, 238, 214));
        jDesktopUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 201, 178), 5, true));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 201, 178), 7));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/LogoPrincipal.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        barraMenu.setBackground(new java.awt.Color(1, 1, 1));

        jMenu1.setForeground(new java.awt.Color(254, 250, 243));
        jMenu1.setText("USUARIO");
        jMenu1.setActionCommand("CLIENTE");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        btnRecepcionista.setBackground(new java.awt.Color(1, 1, 1));
        btnRecepcionista.setForeground(new java.awt.Color(254, 254, 254));
        btnRecepcionista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/recepcionista.png"))); // NOI18N
        btnRecepcionista.setText("RECEPCIONISTA");
        btnRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionistaActionPerformed(evt);
            }
        });
        jMenu1.add(btnRecepcionista);

        btnAdministrador.setBackground(new java.awt.Color(1, 1, 1));
        btnAdministrador.setForeground(new java.awt.Color(254, 254, 254));
        btnAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/Administrador.png"))); // NOI18N
        btnAdministrador.setText("ADMINISTRADOR");
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });
        jMenu1.add(btnAdministrador);

        btnOPerador.setBackground(new java.awt.Color(1, 1, 1));
        btnOPerador.setForeground(new java.awt.Color(254, 254, 254));
        btnOPerador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/operador.png"))); // NOI18N
        btnOPerador.setText("OPERADOR");
        btnOPerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOPeradorActionPerformed(evt);
            }
        });
        jMenu1.add(btnOPerador);

        barraMenu.add(jMenu1);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jDesktopUsuarios)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionistaActionPerformed
        acceder.setVisible(true);
       
            if(acceder.reconocerUsuario()==3){
                recepcionistaInterface.setVisible(true);
                jDesktopUsuarios.add(recepcionistaInterface);
            }else if(acceder.reconocerUsuario()!=3){
                JOptionPane.showMessageDialog(null,"El usuario no tiene permitido el acceso a Recepcionista");
            }else if(acceder.reconocerUsuario()==0){
                
            }
        
        
    }//GEN-LAST:event_btnRecepcionistaActionPerformed

    private void btnOPeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOPeradorActionPerformed
        acceder.setVisible(true);
        int reconocedor;
        reconocedor = acceder.reconocerUsuario();
        if(!acceder.isVisible()){
            if(reconocedor==2){
                operadorInterface.setVisible(true);
                jDesktopUsuarios.add(operadorInterface);
            }else if(acceder.reconocerUsuario()!=2 ){
                JOptionPane.showMessageDialog(null,"El usuario no tiene permitido el acceso a Operador");
            }
        }
       
    }//GEN-LAST:event_btnOPeradorActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        acceder.setVisible(true);
        if(!acceder.isVisible()){
            if(acceder.reconocerUsuario()==1){
                AdministradorInterface.setVisible(true);
                jDesktopUsuarios.add(AdministradorInterface);
            }else if(acceder.reconocerUsuario()!=1){
                JOptionPane.showMessageDialog(null,"El usuario no tiene permitido el acceso a Administrador");
            }
        }
    }//GEN-LAST:event_btnAdministradorActionPerformed

     private void Diseño(){
        setTitle("EMPRESA DE ENVIOS");
        setLocation(400,0);
        ImageIcon portada = new ImageIcon("2.png");
        this.setIconImage(new ImageIcon("2.png").getImage());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem btnAdministrador;
    private javax.swing.JMenuItem btnOPerador;
    private javax.swing.JMenuItem btnRecepcionista;
    private javax.swing.JDesktopPane jDesktopUsuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
