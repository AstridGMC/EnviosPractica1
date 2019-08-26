package enviospractica1.Backend;

import enviospractica1.ConectorMySQL;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cliente {
    private String nombre;
    private String CUI;
    private String telefono;
    private String NIT;
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
    public boolean GuardarCliente(ConectorMySQL conector){
         try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeUpdate("INSERT INTO Cliente VALUES ('"+NIT+"','"+ CUI+"','"+nombre+"','" +telefono+ "','"+direccion+"' , 0 );");
            JOptionPane.showMessageDialog(null,"EL CLIENTE SE HA REGISTRADO CON EXITO");
            return true;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en crear usuario" );
            e.printStackTrace();
            return false;
        }
    }
    
    public void leerClientes(ConectorMySQL conector, javax.swing.JTable tablaClientes){
        try {
            DefaultTableModel reportePuntos = new DefaultTableModel();
           Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet rs= instruccionSQL3.executeQuery(" SELECT nit, cui, nombreRemitente , telefono, direccion, paquetesEnRuta FROM Cliente ORDER BY nombreRemitente;");
            System.out.println(rs.first());
            reportePuntos.setColumnIdentifiers(new Object[]{"NIT" , "CUI", "Nombre y Apellido" , "Telefono", "direccion" ,"paquetes en Ruta"});
            reportePuntos.addRow(new Object []{rs.getString("nit"),rs.getString("cui"), rs.getString("nombreRemitente") , rs.getString("telefono"),  rs.getString("direccion") ,rs.getInt("paquetesEnRuta")});
            while(rs.next()){
                reportePuntos.addRow(new Object []{rs.getString("nit"),rs.getString("cui"), rs.getString("nombreRemitente") , rs.getString("telefono"),rs.getString("direccion") ,rs.getInt("paquetesEnRuta")});
            }
            tablaClientes.setModel(reportePuntos);
            
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }
    
    public String getNombreClienteByID(ConectorMySQL conector, String NIT){
        Statement instruccionSQL5;
        try {
            System.out.println(conector.getConexion().getHost());
            instruccionSQL5 = conector.getConexion().createStatement();
            instruccionSQL5.execute("USE enviosPractica");
            ResultSet obtenerDato = instruccionSQL5.executeQuery("SELECT nombreRemitente FROM Cliente WHERE nit = '" + NIT + "'");
            System.out.println(obtenerDato.first());
            return  obtenerDato.getString("nombreRemitente");
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
            return null;
        }
    }
    public String getCUIClienteByID(ConectorMySQL conector, String NIT){
        Statement instruccionSQL5;
        try {
            System.out.println(conector.getConexion().getHost());
            instruccionSQL5 = conector.getConexion().createStatement();
            instruccionSQL5.execute("USE enviosPractica");
            ResultSet obtenerDato = instruccionSQL5.executeQuery("SELECT cui FROM Cliente WHERE nit = '" + NIT + "'");
            System.out.println(obtenerDato.first());
            return  obtenerDato.getString("cui");
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
            return null;
        }
    }
    
    public String getDireccionClienteByID(ConectorMySQL conector, String NIT){
        Statement instruccionSQL5;
        try {
            System.out.println(conector.getConexion().getHost());
            instruccionSQL5 = conector.getConexion().createStatement();
            instruccionSQL5.execute("USE enviosPractica");
            ResultSet obtenerDato = instruccionSQL5.executeQuery("SELECT direccion FROM Cliente WHERE nit = '" + NIT + "'");
            System.out.println(obtenerDato.first());
            return  obtenerDato.getString("direccion");
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
            return null;
        }
    }
    
    public void aumentarPaquetesCliente(ConectorMySQL conector, String NIT){
        Statement instruccionSQL;
        try {
            System.out.println(conector.getConexion().getHost());
            instruccionSQL = conector.getConexion().createStatement();
            instruccionSQL.execute("USE enviosPractica");
            instruccionSQL.executeUpdate("UPDATE Cliente SET paquetesEnRuta=paquetesEnRuta+1 WHERE nit = '" + NIT + "'");
            System.out.println("ya guardado");
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }
}
