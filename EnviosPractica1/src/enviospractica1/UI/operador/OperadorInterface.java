/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviospractica1.UI.operador;

/**
 *
 * @author astridmc
 */
public class OperadorInterface extends javax.swing.JInternalFrame {
    ProcesarPaquete procesarPaquete = new ProcesarPaquete();
    /**
     * Creates new form RegistradorHoras
     */
    public OperadorInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopOperador = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnrRegistroHora = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnRegistrarEnvio = new javax.swing.JMenuItem();

        jDesktopOperador.setBackground(new java.awt.Color(0, 201, 178));

        barraMenu.setBackground(new java.awt.Color(1, 1, 1));

        jMenu1.setForeground(new java.awt.Color(254, 250, 243));
        jMenu1.setText("PAQUETES");
        jMenu1.setActionCommand("CLIENTE");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        btnrRegistroHora.setBackground(new java.awt.Color(1, 1, 1));
        btnrRegistroHora.setForeground(new java.awt.Color(254, 254, 254));
        btnrRegistroHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/ProcesarPaquete.png"))); // NOI18N
        btnrRegistroHora.setText("Procesar Paquete");
        btnrRegistroHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrRegistroHoraActionPerformed(evt);
            }
        });
        jMenu1.add(btnrRegistroHora);

        jMenuItem3.setBackground(new java.awt.Color(1, 1, 1));
        jMenuItem3.setForeground(new java.awt.Color(254, 254, 254));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/colaPaquetes.png"))); // NOI18N
        jMenuItem3.setText("Ver Paquete en cola");
        jMenu1.add(jMenuItem3);

        barraMenu.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(1, 1, 1));
        jMenu2.setForeground(new java.awt.Color(254, 254, 254));
        jMenu2.setText("INFORMACION");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        btnRegistrarEnvio.setBackground(new java.awt.Color(1, 1, 1));
        btnRegistrarEnvio.setForeground(new java.awt.Color(254, 254, 254));
        btnRegistrarEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/info.png"))); // NOI18N
        btnRegistrarEnvio.setText("info punto de Control");
        btnRegistrarEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEnvioActionPerformed(evt);
            }
        });
        jMenu2.add(btnRegistrarEnvio);

        barraMenu.add(jMenu2);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopOperador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopOperador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrRegistroHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrRegistroHoraActionPerformed
        procesarPaquete.setVisible(true);
        jDesktopOperador.add(procesarPaquete);
    }//GEN-LAST:event_btnrRegistroHoraActionPerformed

    private void btnRegistrarEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEnvioActionPerformed

    }//GEN-LAST:event_btnRegistrarEnvioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem btnRegistrarEnvio;
    private javax.swing.JMenuItem btnrRegistroHora;
    private javax.swing.JDesktopPane jDesktopOperador;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
