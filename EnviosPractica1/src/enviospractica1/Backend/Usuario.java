
package enviospractica1.Backend;

import enviospractica1.ConectorMySQL;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private String rango;
    private String CUI;
    public int celular;
    public String nit;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String Cui) {
        this.CUI = Cui;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
    public int AsignarPrivilegios(ConectorMySQL conector){
        try{
            
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            System.out.println(contraseña);
            instruccionSQL3.execute("CREATE USER '"+ nombreUsuario+"'@'%'"+" IDENTIFIED BY '"+contraseña+"';");
            System.out.println("CREATE USER '"+ nombreUsuario+"'@'%'"+" IDENTIFIED BY '"+contraseña +"';");
            System.out.println("GRANT '"+rango+"'TO '"+nombreUsuario+"'@'%';");
            Statement instruccionSQL4 = conector.getConexion().createStatement();
            instruccionSQL4.execute("GRANT '"+rango+"'TO '"+nombreUsuario+"'@'%';");
            instruccionSQL4.execute("SET DEFAULT ROLE ALL TO '" +nombreUsuario+"'@'%';");
            return 2;
        } catch (SQLException e){
            System.out.println("ha fallado la conexion" );
            e.printStackTrace();
            return 1;
        }   
    }
    
    
    public int CrearUsuario(ConectorMySQL conector){
         try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeUpdate("INSERT INTO Usuario VALUES ('"+ nombreUsuario +"','"+CUI+"','"+contraseña+"','"+rango+"',"+celular+",'Activo');");
            JOptionPane.showMessageDialog(null,"El usuario "+ nombreUsuario + " se ha Registrado con exito");
            System.out.println(nombreUsuario);
            return 2;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en crear usuario" );
            e.printStackTrace();
            return 1;
        }
    }
    
    public void leerUsuarios(ConectorMySQL conector, javax.swing.JTable tablaReportes){
        try {
            DefaultTableModel reporteUsuario = new DefaultTableModel();
           Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet rs= instruccionSQL3.executeQuery(" SELECT nombreUsuario, cuiOperador, rango , estado FROM Usuario ;");
            System.out.println(rs.first());
            reporteUsuario.setColumnIdentifiers(new Object[]{"Nombre De Usuario" , "CUI Usuario", "Rango" , "Estado Actual"});
            
            while(rs.next()){
                reporteUsuario.addRow(new Object []{rs.getString("nombreUsuario"),rs.getString("cuiOperador"), rs.getString("rango"), rs.getString("estado") });
            }
            tablaReportes.setModel(reporteUsuario);
            
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }
    
    public String obtenerCui(ConectorMySQL conector){
         try {
           Statement instruccionSQL3 = conector.getConexion().createStatement();
            ResultSet rs= instruccionSQL3.executeQuery(" SELECT cuiOperador FROM enviosPractica.Usuario WHERE nombreUsuario ='"+obtenerUsuario(conector)+"';");
            rs.first();
            return rs.getString("cuiOperador");
            
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe usuario en base de datos");
            return null;
        }
    }
    
    public String obtenerCuiNombre(ConectorMySQL conector, String nombre){
         try {
           Statement instruccionSQL3 = conector.getConexion().createStatement();
            ResultSet rs= instruccionSQL3.executeQuery(" SELECT cuiOperador FROM enviosPractica.Usuario WHERE nombreUsuario ='"+nombre+"';");
            rs.first();
            return rs.getString("cuiOperador");
            
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe usuario en base de datos");
            return null;
        }
    }
    public String obtenerUsuario(ConectorMySQL conector){
        try {
           Statement instruccionSQL3 = conector.getConexion().createStatement();
            ResultSet rs= instruccionSQL3.executeQuery("SELECT LEFT(CURRENT_USER(), INSTR(CURRENT_USER(), '@') - 1);");
            rs.first();
            System.out.println(rs.getString("LEFT(CURRENT_USER(), INSTR(CURRENT_USER(), '@') - 1)"));
            return rs.getString("LEFT(CURRENT_USER(), INSTR(CURRENT_USER(), '@') - 1)");
            
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe el usuario en base de datos");
            return null;
        }
    }
    
    public void ListarOperadores( ConectorMySQL conector , javax.swing.JComboBox<String> operadores){
        try{
            Statement instruccionSQL4 = conector.getConexion().createStatement();
            instruccionSQL4.executeQuery("USE enviosPractica");
            ResultSet obtenerOperador= instruccionSQL4.executeQuery("SELECT nombreUsuario FROM Usuario WHERE rango = 'operador';");
            obtenerOperador.first();
            operadores.removeAllItems();
            operadores.addItem(obtenerOperador.getString("nombreUsuario"));
            while(obtenerOperador.next()){
                 operadores.addItem(obtenerOperador.getString("nombreUsuario"));
            }
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion al leer operadores" );
        }
    }
}
