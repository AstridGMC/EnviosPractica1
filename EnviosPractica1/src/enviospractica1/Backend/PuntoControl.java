
package enviospractica1.Backend;

import enviospractica1.ConectorMySQL;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PuntoControl {
    
    private String codigo;
    private String destino;
    private int precioGlobal;
    private int precioIndividual;
    private int numero;
    private int capacidad;

    public PuntoControl() {
        
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    

    public String getNombre() {
        return codigo;
    }

    public void setNombre(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPrecioGlobal() {
        return precioGlobal;
    }

    public void setPrecioGlobal(int precioGlobal) {
        this.precioGlobal = precioGlobal;
    }

    public int getPrecioIndividual() {
        return precioIndividual;
    }

    public void setPrecioIndividual(int precioIndividual) {
        this.precioIndividual = precioIndividual;
    }

    
    public void ListarPuntos(ConectorMySQL conector, javax.swing.JComboBox<String> rutas){
         try{
            Statement instruccionSQL4 = conector.getConexion().createStatement();
            instruccionSQL4.executeQuery("USE enviosPractica");
            ResultSet obtenerRuta= instruccionSQL4.executeQuery("SELECT codPuntoDeControl FROM PuntoDeControl");
            System.out.println(obtenerRuta.first()+ "POOOL");
            rutas.removeAllItems();
            rutas.addItem(obtenerRuta.getString(1));
            while(obtenerRuta.next()){
                 rutas.addItem(obtenerRuta.getString("codPuntoDeControl"));
            }
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion al leer rutas" );
            e.printStackTrace();
        }
        
    }
    public void ListarRutas(ConectorMySQL conector,javax.swing.JComboBox<String> rutas ){
        try{
            Statement instruccionSQL4 = conector.getConexion().createStatement();
            instruccionSQL4.executeQuery("USE enviosPractica");
            ResultSet obtenerRuta= instruccionSQL4.executeQuery("SELECT codigoRuta FROM Ruta");
            System.out.println(obtenerRuta.first()+ "POOOL");
            rutas.removeAllItems();
            rutas.addItem(obtenerRuta.getString(1));
            while(obtenerRuta.next()){
                 rutas.addItem(obtenerRuta.getString("codigoRuta"));
            }
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion al leer rutas" );
            e.printStackTrace();
        }
    }
    public boolean GuardarPuntoPrecioIndividual(ConectorMySQL conector, String codigoPunto, String codRuta, int precioInd){
        obtenerNumero(conector,codRuta);
        precioIndividual =precioInd;
        try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            instruccionSQL3.executeUpdate("INSERT INTO PuntoDeControl VALUES ("+precioGlobal+","+precioIndividual+"'"+ codigoPunto+"','"+codRuta+"',"+numero+",'Activo'," +capacidad+");");
            JOptionPane.showMessageDialog(null,"LA RUTA HA SIDO GUARDADA CON EXITO");
            return true;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en Guardar Punto" );
            e.printStackTrace();
            return false;
        }
    }
  
    public boolean GuardarPuntoPrecioGlobal(ConectorMySQL conector, String codigoPunto, String codRuta){
        obtenerNumero(conector,codRuta);
        obtenerPrecioGlobal(conector);
        precioIndividual=0;
        try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            instruccionSQL3.executeUpdate("INSERT INTO PuntoDeControl VALUES ("+precioGlobal+","+precioIndividual+",'"+ codigoPunto+"','"+codRuta+"',"+numero+",'Activo'," +capacidad+");");
            JOptionPane.showMessageDialog(null,"LA RUTA HA SIDO GUARDADA CON EXITO");
            return true;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en Guardar Punto" );
            e.printStackTrace();
            return false;
        }
    }
    
    public void obtenerPrecioGlobal(ConectorMySQL conector){
         try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenerPresioGlobal= instruccionSQL3.executeQuery("SELECT MAX(precioGlobal) FROM PuntoDeControl ;");
            System.out.println(obtenerPresioGlobal.first());
            precioGlobal = obtenerPresioGlobal.getInt("MAX(precioGlobal)");
            
            
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener Numero" );
            e.printStackTrace();
        }
    }
    
     public void obtenerPrecioIndividual(ConectorMySQL conector , javax.swing.JComboBox<String> rutas){
         try{
            codigo= rutas.getSelectedItem().toString();
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenerPresioGlobal= instruccionSQL3.executeQuery("SELECT precioIndividual FROM PuntoDeControl WHERE codigoPuntoDeControl = '"+codigo+ ";");
            System.out.println(obtenerPresioGlobal.first());
            precioGlobal = obtenerPresioGlobal.getInt("MAX(precioGlobal)");
            
            
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener Numero" );
            e.printStackTrace();
        }
    }
    
    public void obtenerNumero(ConectorMySQL conector, String codRuta){
        try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenerRuta= instruccionSQL3.executeQuery("SELECT MAX(numeroPuntoControl) FROM PuntoDeControl WHERE codigoRuta = '"+ codRuta + "';");
            System.out.println(obtenerRuta.first());
            Integer intObj = obtenerRuta.getInt("MAX(numeroPuntoControl)");
            if(intObj<1){
                numero=1;
            }else{
                numero = obtenerRuta.getInt("MAX(numeroPuntoControl)")+1;
                System.out.println(numero+"numero de punto de control");
            }
            
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener Numero" );
            e.printStackTrace();
        }
    }
  

    public void CambiarPrecioGlobal(ConectorMySQL conector, javax.swing.JTextField txtNuevoMonto,javax.swing.JComboBox<String> rutas ){
         try {
            precioGlobal = Integer.valueOf(txtNuevoMonto.getText());
            codigo = rutas.getSelectedItem().toString();
            System.out.println(precioGlobal);
            System.out.println(codigo);
            Statement instruccionSQL2 = conector.getConexion().createStatement();
            instruccionSQL2.execute("USE enviosPractica");
            instruccionSQL2.executeUpdate("UPDATE PuntoDeControl SET precioGlobal =" + precioGlobal +";");
            JOptionPane.showMessageDialog(null,"Se han registrado los Cambios");
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }
    public void CambiarPrecioIndividual(ConectorMySQL conector, javax.swing.JTextField txtNuevoMonto,javax.swing.JComboBox<String> rutas ){
         try {
            precioIndividual = Integer.valueOf(txtNuevoMonto.getText());
            codigo = rutas.getSelectedItem().toString();
            System.out.println(precioIndividual);
            System.out.println(codigo);
            Statement instruccionSQL2 = conector.getConexion().createStatement();
            instruccionSQL2.execute("USE enviosPractica");
            instruccionSQL2.executeUpdate("UPDATE PuntoDeControl SET precioIndividual =" + precioIndividual + " WHERE codPuntoDeControl ='"+ codigo +"';");
            JOptionPane.showMessageDialog(null,"Se han registrado los Cambios");
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }
    
    public void leerPuntosDeControl(ConectorMySQL conector, javax.swing.JTable tablaReportes){
        try {
            DefaultTableModel reportePuntos = new DefaultTableModel();
           Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet rs= instruccionSQL3.executeQuery(" SELECT precioGLobal, precioIndividual, estado , capacidad FROM PuntoDeControl ;");
            System.out.println(rs.first());
            reportePuntos.setColumnIdentifiers(new Object[]{"Precio GLobal" , "Precio Individual", "Estado" , "Capacidad"});
            
            while(rs.next()){
                reportePuntos.addRow(new Object []{rs.getInt("precioGLobal"),rs.getInt("precioIndividual"), rs.getString("estado"), rs.getInt("capacidad") });
            }
            tablaReportes.setModel(reportePuntos);
            
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }
}
