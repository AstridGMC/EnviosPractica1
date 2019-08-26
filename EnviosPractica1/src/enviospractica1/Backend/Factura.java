
package enviospractica1.Backend;

import enviospractica1.ConectorMySQL;
import static enviospractica1.UI.IngresarUsuario.conector;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;


public class Factura {
    private int idFactura;
    private int monto;
    private Date fecha;
    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private String nombreCliente;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    

    public Factura() {
    }
    
    
    
    public int obtenerIDFactura(){
        int numero;
         try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenerRuta= instruccionSQL3.executeQuery("SELECT MAX(idFactura) FROM Factura;");
            System.out.println(obtenerRuta.first());
            Integer intObj = obtenerRuta.getInt("MAX(idFactura)");
            if(intObj<1){
                numero=1;
                return numero;
            }else{
                numero = obtenerRuta.getInt("MAX(idFactura)")+1;
                System.out.println(numero+"numero de Factura");
                return numero;
            }
            
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener Numero" );
            e.printStackTrace();
            return 0;
        }
    }
     public boolean GuardarFactura(ConectorMySQL conector){
         try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeUpdate("INSERT INTO Factura VALUES ("+ idFactura+", (STR_TO_DATE(REPLACE('"+dateFormat.format(date)+"','/','.') ,GET_FORMAT(date,'EUR'))),"+monto+",'"+nombreCliente+"');");
            return true;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en crear usuario" );
            e.printStackTrace();
            return false;
        }
    }
     
    public void listarFactura(ConectorMySQL conector, String noFactura, javax.swing.JTable tablaFactura){
         try {
             int codDestino;
            DefaultTableModel reporteFactura = new DefaultTableModel();
            Statement instruccionSQL3 = conector.getConexion().createStatement();
             Statement instruccionSQL = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            instruccionSQL.executeQuery("USE enviosPractica");
             System.out.println(noFactura);
            
            ResultSet rs= instruccionSQL3.executeQuery("SELECT numeroDeGuia, codDestino, peso , precioPaquete FROM Paquete WHERE idFactura = '"+noFactura+"';");
            System.out.println(rs.first());
            codDestino = rs.getInt("codDestino");
             System.out.println(codDestino);
            ResultSet rs0= instruccionSQL.executeQuery("SELECT nombre FROM Destino WHERE codDestino = "+codDestino+";");
            rs0.first();
             System.out.println("dsfsdf");
            reporteFactura.setColumnIdentifiers(new Object[]{"numero De Guia" , "destino", "peso" , "precioPaquete"});
            reporteFactura.addRow(new Object []{rs.getString("numeroDeGuia"),rs0.getString("nombre"), rs.getInt("peso"), rs.getInt("precioPaquete") });
            
            while(rs.next()){
                ResultSet rs2= instruccionSQL.executeQuery("SELECT nombre FROM Destino WHERE codDestino = "+codDestino);
                rs2.first();
                reporteFactura.addRow(new Object []{rs.getString("numeroDeGuia"),rs2.getString("nombre"), rs.getInt("peso"), rs.getInt("precioPaquete") });
            }
            tablaFactura.setModel(reporteFactura);
            
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }
    
    
    public String obtenerRemitente(ConectorMySQL conector, int idFactura){
       try{
            String nombre;
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenercodigoD= instruccionSQL3.executeQuery("SELECT nombreCliente FROM Factura WHERE idFactura ='"+ idFactura+"';");
            System.out.println(obtenercodigoD.first());
            nombre = obtenercodigoD.getString("nombreCliente");
            System.out.println(nombre);
            return  nombre;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener Nombre " );
            return null;
        }
    }
}
