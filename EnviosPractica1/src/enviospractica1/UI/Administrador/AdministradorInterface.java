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

/**
 *
 * @author astridmc
 */
public class AdministradorInterface extends javax.swing.JInternalFrame {

    private int reconocedor = 0;
    /**
     * Creates new form AdministradorInterface
     */
    private String codigoRuta;
    private String codigoPunto;
    private int numero;
    
    
    
    NuevaRuta nuevaRuta;
    NuevoPuntoDeControl agregarPunto;
    Reportes reporte;
    
    public AdministradorInterface() {
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

        jDesktopUsuarios = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        btnUsuarios = new javax.swing.JMenu();
        btnAgregarUsuario = new javax.swing.JMenuItem();
        btnActivarDesactivar = new javax.swing.JMenuItem();
        btnMisUsuarios = new javax.swing.JMenuItem();
        btnRutas = new javax.swing.JMenu();
        btnCrearRuta = new javax.swing.JMenuItem();
        btnAgregarPuntoControl = new javax.swing.JMenuItem();
        btnCambiarPrecio = new javax.swing.JMenuItem();
        btnINformacion = new javax.swing.JMenu();
        btnReporteRutas = new javax.swing.JMenuItem();
        btnGanancias = new javax.swing.JMenuItem();
        btnClientes = new javax.swing.JMenuItem();
        btnRutasPopulares = new javax.swing.JMenuItem();
        btnPuntosDeControl = new javax.swing.JMenuItem();

        jDesktopUsuarios.setBackground(new java.awt.Color(0, 201, 178));

        barraMenu.setBackground(new java.awt.Color(1, 1, 1));

        btnUsuarios.setForeground(new java.awt.Color(254, 250, 243));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setActionCommand("CLIENTE");
        btnUsuarios.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        btnAgregarUsuario.setBackground(new java.awt.Color(1, 1, 1));
        btnAgregarUsuario.setForeground(new java.awt.Color(254, 254, 254));
        btnAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/nuevoUsuario.png"))); // NOI18N
        btnAgregarUsuario.setText("Agregar Nuevo ");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });
        btnUsuarios.add(btnAgregarUsuario);

        btnActivarDesactivar.setBackground(new java.awt.Color(1, 1, 1));
        btnActivarDesactivar.setForeground(new java.awt.Color(254, 254, 254));
        btnActivarDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/userConfiguration .png"))); // NOI18N
        btnActivarDesactivar.setText(" Desactivar");
        btnActivarDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarDesactivarActionPerformed(evt);
            }
        });
        btnUsuarios.add(btnActivarDesactivar);

        btnMisUsuarios.setBackground(new java.awt.Color(1, 1, 1));
        btnMisUsuarios.setForeground(new java.awt.Color(254, 254, 254));
        btnMisUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/nuevoUsuario.png"))); // NOI18N
        btnMisUsuarios.setText("Ver Usuarios");
        btnMisUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisUsuariosActionPerformed(evt);
            }
        });
        btnUsuarios.add(btnMisUsuarios);

        barraMenu.add(btnUsuarios);

        btnRutas.setBackground(new java.awt.Color(1, 1, 1));
        btnRutas.setForeground(new java.awt.Color(254, 254, 254));
        btnRutas.setText("RUTAS");
        btnRutas.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        btnCrearRuta.setBackground(new java.awt.Color(1, 1, 1));
        btnCrearRuta.setForeground(new java.awt.Color(254, 254, 254));
        btnCrearRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/nuevaRuta.png"))); // NOI18N
        btnCrearRuta.setText("Crear  Ruta");
        btnCrearRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRutaActionPerformed(evt);
            }
        });
        btnRutas.add(btnCrearRuta);

        btnAgregarPuntoControl.setBackground(new java.awt.Color(1, 1, 1));
        btnAgregarPuntoControl.setForeground(new java.awt.Color(254, 254, 254));
        btnAgregarPuntoControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/punto.png"))); // NOI18N
        btnAgregarPuntoControl.setText("Agregar Punto de Control");
        btnAgregarPuntoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPuntoControlActionPerformed(evt);
            }
        });
        btnRutas.add(btnAgregarPuntoControl);

        btnCambiarPrecio.setBackground(new java.awt.Color(1, 1, 1));
        btnCambiarPrecio.setForeground(new java.awt.Color(254, 254, 254));
        btnCambiarPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/nuevaRuta.png"))); // NOI18N
        btnCambiarPrecio.setText("Modificar Cuotas");
        btnCambiarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarPrecioActionPerformed(evt);
            }
        });
        btnRutas.add(btnCambiarPrecio);

        barraMenu.add(btnRutas);

        btnINformacion.setBackground(new java.awt.Color(1, 1, 1));
        btnINformacion.setForeground(new java.awt.Color(254, 254, 254));
        btnINformacion.setText("INFORMACION");
        btnINformacion.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        btnReporteRutas.setBackground(new java.awt.Color(1, 1, 1));
        btnReporteRutas.setForeground(new java.awt.Color(254, 254, 254));
        btnReporteRutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/ReporteRutas.png"))); // NOI18N
        btnReporteRutas.setText("Reporte de Rutas");
        btnReporteRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteRutasActionPerformed(evt);
            }
        });
        btnINformacion.add(btnReporteRutas);

        btnGanancias.setBackground(new java.awt.Color(1, 1, 1));
        btnGanancias.setForeground(new java.awt.Color(254, 254, 254));
        btnGanancias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/reporteGanancias.png"))); // NOI18N
        btnGanancias.setText("Reporte de Ganancias");
        btnGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGananciasActionPerformed(evt);
            }
        });
        btnINformacion.add(btnGanancias);

        btnClientes.setBackground(new java.awt.Color(1, 1, 1));
        btnClientes.setForeground(new java.awt.Color(254, 254, 254));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/clientesPrincipal.png"))); // NOI18N
        btnClientes.setText("Reporte de Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnINformacion.add(btnClientes);

        btnRutasPopulares.setBackground(new java.awt.Color(1, 1, 1));
        btnRutasPopulares.setForeground(new java.awt.Color(254, 254, 254));
        btnRutasPopulares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/RutasPopulares.png"))); // NOI18N
        btnRutasPopulares.setText("Rutas  Populares");
        btnRutasPopulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutasPopularesActionPerformed(evt);
            }
        });
        btnINformacion.add(btnRutasPopulares);

        btnPuntosDeControl.setBackground(new java.awt.Color(1, 1, 1));
        btnPuntosDeControl.setForeground(new java.awt.Color(254, 254, 254));
        btnPuntosDeControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/localizar.png"))); // NOI18N
        btnPuntosDeControl.setText("Ver Puntos de Control");
        btnPuntosDeControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntosDeControlActionPerformed(evt);
            }
        });
        btnINformacion.add(btnPuntosDeControl);

        barraMenu.add(btnINformacion);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        NuevoUsuario registrarUsuario = new NuevoUsuario();
        jDesktopUsuarios.add(registrarUsuario);
        registrarUsuario.setVisible(true);
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnCrearRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRutaActionPerformed
        AsignarCodigoRuta(IngresarUsuario.conector);
        System.out.println(numero);
        nuevaRuta = new NuevaRuta(numero);
        jDesktopUsuarios.add(nuevaRuta);
        nuevaRuta.setVisible(true);
    }//GEN-LAST:event_btnCrearRutaActionPerformed

    private void btnAgregarPuntoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPuntoControlActionPerformed
        AsignarCodigoPunto(IngresarUsuario.conector);
        agregarPunto = new NuevoPuntoDeControl(numero);
        jDesktopUsuarios.add(agregarPunto);
        agregarPunto.setVisible(true);
    }//GEN-LAST:event_btnAgregarPuntoControlActionPerformed

    private void btnReporteRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteRutasActionPerformed
        reconocedor = 1;
        reporte = new Reportes(reconocedor);
        reporte.setVisible(true);
        jDesktopUsuarios.add(reporte);
    }//GEN-LAST:event_btnReporteRutasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        reconocedor =2;
        reporte = new Reportes(reconocedor);
        reporte.setVisible(true);
        jDesktopUsuarios.add(reporte);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGananciasActionPerformed
        reconocedor =3;
        reporte = new Reportes(reconocedor);
        reporte.setVisible(true);
        jDesktopUsuarios.add(reporte);
    }//GEN-LAST:event_btnGananciasActionPerformed

    private void btnRutasPopularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutasPopularesActionPerformed
        reconocedor =4;
        reporte = new Reportes(reconocedor);
        reporte.setVisible(true);
        jDesktopUsuarios.add(reporte);
    }//GEN-LAST:event_btnRutasPopularesActionPerformed

    private void btnActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarDesactivarActionPerformed
        DesactivaUsuario desactivaUsuario  = new DesactivaUsuario();
        jDesktopUsuarios.add(desactivaUsuario);
        desactivaUsuario.setVisible(true);
    }//GEN-LAST:event_btnActivarDesactivarActionPerformed

    private void btnCambiarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarPrecioActionPerformed
        ModificadorPrecio modificarPrecio = new ModificadorPrecio();
        jDesktopUsuarios.add(modificarPrecio);
        modificarPrecio.setVisible(true);
    }//GEN-LAST:event_btnCambiarPrecioActionPerformed

    private void btnPuntosDeControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntosDeControlActionPerformed
        reconocedor =5;
        reporte = new Reportes(reconocedor);
        reporte.setVisible(true);
        jDesktopUsuarios.add(reporte);
    }//GEN-LAST:event_btnPuntosDeControlActionPerformed

    private void btnMisUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisUsuariosActionPerformed
        reconocedor =6;
        reporte = new Reportes(reconocedor);
        reporte.setVisible(true);
        jDesktopUsuarios.add(reporte);
    }//GEN-LAST:event_btnMisUsuariosActionPerformed

    public void AsignarCodigoRuta(ConectorMySQL conector){
        
        
        try{
            Statement instruccionSQL = conector.getConexion().createStatement();
            instruccionSQL.executeQuery("USE enviosPractica");
            ResultSet obtenerUltimaRuta = instruccionSQL.executeQuery("SELECT MAX(codigoRuta) FROM Ruta;");
            System.out.println(obtenerUltimaRuta.first());
            codigoRuta= obtenerUltimaRuta.getString("MAX(codigoRuta)");
            System.out.println(codigoRuta);
            numero = Integer.parseInt(String.valueOf(codigoRuta.charAt(1)))+1;
        } catch ( SQLException e){
            System.out.println("ha fallado la conexion en asignar codigo Ruta"  );
        }
    }
    
    public void AsignarCodigoPunto(ConectorMySQL conector){
        try{
            Statement instruccionSQL = conector.getConexion().createStatement();
            instruccionSQL.executeQuery("USE enviosPractica");
            ResultSet obtenerUltimoPunto = instruccionSQL.executeQuery("SELECT MAX(codPuntoDeControl) FROM PuntoDeControl;");
            System.out.println(obtenerUltimoPunto.first());
            codigoPunto= obtenerUltimoPunto.getString("MAX(codPuntoDeControl)");
            numero = Integer.parseInt(String.valueOf(codigoPunto.charAt(1)))+1;
            System.out.println(numero);
        } catch ( SQLException e){
            System.out.println("ha fallado la conexion en crear usuario Punto" );
        }
    }
    
    private void Diseño(){
        this.setResizable(true);
        this.setTitle("ADMINISTRADOR");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem btnActivarDesactivar;
    private javax.swing.JMenuItem btnAgregarPuntoControl;
    private javax.swing.JMenuItem btnAgregarUsuario;
    private javax.swing.JMenuItem btnCambiarPrecio;
    private javax.swing.JMenuItem btnClientes;
    private javax.swing.JMenuItem btnCrearRuta;
    private javax.swing.JMenuItem btnGanancias;
    private javax.swing.JMenu btnINformacion;
    private javax.swing.JMenuItem btnMisUsuarios;
    private javax.swing.JMenuItem btnPuntosDeControl;
    private javax.swing.JMenuItem btnReporteRutas;
    private javax.swing.JMenu btnRutas;
    private javax.swing.JMenuItem btnRutasPopulares;
    private javax.swing.JMenu btnUsuarios;
    private javax.swing.JDesktopPane jDesktopUsuarios;
    // End of variables declaration//GEN-END:variables
}
