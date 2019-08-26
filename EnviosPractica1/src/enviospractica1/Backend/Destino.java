
package enviospractica1.Backend;

import enviospractica1.ConectorMySQL;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Destino {
    
    private String codDestino;
    public int monto;

    public Destino() {
    }

    public String getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(String codDestino) {
        this.codDestino = codDestino;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    public void ListarDestinos(ConectorMySQL conector , javax.swing.JComboBox<String> destino){
        try{
            Statement instruccionSQL4 = conector.getConexion().createStatement();
            instruccionSQL4.executeQuery("USE enviosPractica");
            ResultSet obtenerDestino = instruccionSQL4.executeQuery("SELECT nombre FROM Destino");
            System.out.println(obtenerDestino.first()+ "POOOL");
            destino.addItem(obtenerDestino.getString(1));
            while(obtenerDestino.next()){
                 destino.addItem(obtenerDestino.getString("nombre"));
            }
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en crear usuario" );
        }
    }
    public void obtenerPrecio(ConectorMySQL conector, String nombreDestino){
        try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenerPresioGlobal= instruccionSQL3.executeQuery("SELECT precio FROM Destino WHERE nombre ='"+ nombreDestino+"';");
            System.out.println(obtenerPresioGlobal.first());
            monto = obtenerPresioGlobal.getInt("precio");
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener Numero" );
            e.printStackTrace();
        }
    }
    
    public void CambiarPrecio(ConectorMySQL conector, javax.swing.JTextField txtNuevoMonto, javax.swing.JComboBox<String> destino ){
         try {
            codDestino = destino.getSelectedItem().toString();
            monto = Integer.valueOf(txtNuevoMonto.getText());
            Statement instruccionSQL2 = conector.getConexion().createStatement();
            instruccionSQL2.execute("USE enviosPractica");
            instruccionSQL2.executeUpdate("UPDATE enviosPractica.Destino SET precio =" + monto + " WHERE nombre ='"+ codDestino +"';");
            JOptionPane.showMessageDialog(null,"Se han registrado los Cambios");
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");
        }
    }
    
   public int obtenerCodigo(ConectorMySQL conector, String nombreDestino){
       try{
            int codigo;
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenercodigoD= instruccionSQL3.executeQuery("SELECT codDestino FROM Destino WHERE nombre ='"+ nombreDestino+"';");
            System.out.println(obtenercodigoD.first());
            codigo = obtenercodigoD.getInt("codDestino");
            System.out.println(codigo);
            return  codigo;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener Numero" );
            e.printStackTrace();
            return 0;
        }
   }
    public String obtenerNombre(ConectorMySQL conector, int codDestino){
       try{
            String nombre;
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenercodigoD= instruccionSQL3.executeQuery("SELECT nombre FROM Destino WHERE codDestino ='"+ codDestino+"';");
            System.out.println(obtenercodigoD.first());
            nombre = obtenercodigoD.getString("nombre");
            System.out.println(nombre);
            return  nombre;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener NOmbre Destino" );
            e.printStackTrace();
            return null;
        }
   }
}
