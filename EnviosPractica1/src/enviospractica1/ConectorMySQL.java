
package enviospractica1;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectorMySQL {
    
    private String usuario;
    private String password;
    
    private Connection conexion = null;
    
    public ConectorMySQL(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
        conector();
    }

   
    
    // Declaramos los datos de conexion a la bd
   

    public void conector() {
        System.out.println(usuario);
        System.out.println(password);
        // Reseteamos a null la conexion a la bd
        String user = usuario;
        String pass= password;
        String stringConnection="jdbc:mysql://localhost:3306/enviosPractica";
        conexion=null;
        try{
            // Nos conectamos a la bd
            conexion= (Connection) DriverManager.getConnection(stringConnection, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (conexion!=null){
                //JOptionPane.showMessageDialog(null,"Conexion establecida");
                System.out.println("coneccion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch ( SQLException e){
            JOptionPane.showMessageDialog(null,"Error de conexion contraseña no valida");
            System.out.println("coneccion no establecida"+e);
        }
    }
    
    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    
    public int ValidarRango(Connection conexion){
        Statement instruccionSQL;
        System.out.println(usuario +"ddd");
        System.out.println(password +"dddss");
        System.out.println("  ");
        try{
            System.out.println(conexion.getHost());    
            instruccionSQL = conexion.createStatement();
            ResultSet validarRango = instruccionSQL.executeQuery("SELECT rango FROM Usuario WHERE nombreUsuario='"+usuario+"' AND passwordUser='"+ password+"'");
            System.out.println("si funciona");
            System.out.println(validarRango.first() );
            String rango = validarRango.getString("rango");

            if("administrador".equals(rango) ){
                System.out.println(rango);
                return 1;
            }else if("operador".equals(rango)){
                System.out.println(rango);
                return 2;
            }else if(rango.equals("recepcionista")){
                System.out.println(rango);
                return 3;
            }
            else{
                return 0;
            }
            } catch (SQLException e) {

                System.out.println("rango nulo  " + e.getSQLState());
                return 0;
            }
    }
    
}
