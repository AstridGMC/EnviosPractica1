/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviospractica1.UI;

import enviospractica1.Backend.Cliente;
import enviospractica1.Backend.Factura;
import enviospractica1.Backend.Paquete;

/**
 *
 * @author astridmc
 */
public class detalleFactura extends javax.swing.JDialog {

    /**
     * Creates new form Factura
     * @param parent
     * @param factura
     * @param cliente
    */
    
    private String CUI;
    private String NIT;
    private String nombre;
    private String direccion;
    private int monto;
    private int numero ;
    String formatString = String.format("%%0%dd", 5);
    
    
    public detalleFactura(java.awt.Frame parent, Factura factura , Cliente cliente) {
        super(parent, true);
        initComponents();
        System.out.println(factura.getMonto());
        this.CUI = cliente.getCUI();
        this.NIT = cliente.getNIT();
        this.nombre = cliente.getNombre();
        this.direccion = cliente.getDireccion();
        this.numero = factura.getIdFactura();
        this.monto = factura.getMonto();
        Diseño();
        agregarDatos(factura);
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTotal1 = new javax.swing.JLabel();
        lblDatos1 = new javax.swing.JLabel();
        lblDatos2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLogo1 = new javax.swing.JLabel();
        txtFactura = new javax.swing.JLabel();
        txtNoFactura = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JLabel();
        txtDPI = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNit = new javax.swing.JLabel();
        panelDetalle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalleEnvioTable = new javax.swing.JTable();
        lblTotal2 = new javax.swing.JLabel();
        lblDatos3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        lblDatos5 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        lblTotal1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(146, 7, 7));
        lblTotal1.setText("Q.");

        lblDatos1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDatos1.setText(".00");

        lblDatos2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDatos2.setForeground(new java.awt.Color(176, 1, 1));
        lblDatos2.setText("******");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(219, 253, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/LogoFactura.png"))); // NOI18N
        jPanel1.add(lblLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 120));

        txtFactura.setFont(new java.awt.Font("Century Schoolbook L", 1, 48)); // NOI18N
        txtFactura.setForeground(new java.awt.Color(33, 46, 57));
        txtFactura.setText("FACTURA");
        jPanel1.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 260, 60));

        txtNoFactura.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        txtNoFactura.setForeground(new java.awt.Color(168, 1, 1));
        txtNoFactura.setText("********");
        jPanel1.add(txtNoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(168, 1, 1));
        jLabel2.setText("No.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(220, 246, 237));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(18, 47, 59), null, null));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Direccion:");

        txtDireccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDireccion.setText("****************************************");

        txtDPI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDPI.setText("****************");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("No. DPI:");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombre.setText("****************************************");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Numero Nit:");

        txtNit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNit.setText("***********");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDPI))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 94, Short.MAX_VALUE)))
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 680, 130));

        panelDetalle.setBackground(null
        );
        panelDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetalle.setOpaque(false);

        detalleEnvioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descripcion Paquete", "No.Guia", "Destino", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        detalleEnvioTable.setOpaque(false);
        jScrollPane1.setViewportView(detalleEnvioTable);
        if (detalleEnvioTable.getColumnModel().getColumnCount() > 0) {
            detalleEnvioTable.getColumnModel().getColumn(1).setMinWidth(150);
            detalleEnvioTable.getColumnModel().getColumn(1).setMaxWidth(150);
            detalleEnvioTable.getColumnModel().getColumn(3).setMinWidth(87);
            detalleEnvioTable.getColumnModel().getColumn(3).setMaxWidth(87);
        }

        lblTotal2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblTotal2.setForeground(new java.awt.Color(146, 7, 7));
        lblTotal2.setText("Q.");

        lblDatos3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDatos3.setText(".00");

        txtTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(176, 1, 1));
        txtTotal.setText("******");

        lblDatos5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDatos5.setText("TOTAL");

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDatos5)
                .addGap(28, 28, 28)
                .addComponent(lblTotal2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDatos3)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal)
                    .addComponent(lblDatos3)
                    .addComponent(lblTotal2)
                    .addComponent(lblDatos5))
                .addContainerGap())
        );

        jPanel1.add(panelDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 680, 330));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviospractica1/UI/Imagenes/LogoFondo.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 372, 690, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 2, 2)));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 180, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void agregarDatos(Factura factura ){
        String noFactura = String.format(formatString, numero);
        System.out.println(nombre);
        txtNombre.setText(nombre);
        txtNit.setText(NIT);
        txtNoFactura.setText(noFactura);
        txtNombre.setText(nombre);
        txtDireccion.setText(direccion);
        txtDPI.setText(CUI);
        txtNit.setText(NIT);
        txtTotal.setText(String.valueOf(monto));
        factura.listarFactura(IngresarUsuario.conector, String.valueOf(numero), detalleEnvioTable);
    }
    
    
    private void Diseño(){
        this.setResizable(true);
        this.setTitle("FACTURA");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable detalleEnvioTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatos1;
    private javax.swing.JLabel lblDatos2;
    private javax.swing.JLabel lblDatos3;
    private javax.swing.JLabel lblDatos5;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal2;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JLabel txtDPI;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtFactura;
    private javax.swing.JLabel txtNit;
    private javax.swing.JLabel txtNoFactura;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
