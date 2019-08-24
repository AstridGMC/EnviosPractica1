
package enviospractica1.Backend;

import enviospractica1.ConectorMySQL;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ruta {
    
    private String codigoRuta;
    private int codDestino;

    public String getCodigoRuta() {
        return codigoRuta;
    }

    public void setCodigoRuta(String codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    public int getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(int codDestino) {
        this.codDestino = codDestino;
    }
    
      public void identificarCodDestino(ConectorMySQL conector, javax.swing.JComboBox<String> destino){
        String destinos = destino.getSelectedItem().toString();
        Statement instruccionSQL5;
        try {
            System.out.println(conector.getConexion().getHost());
            instruccionSQL5 = conector.getConexion().createStatement();
            instruccionSQL5.execute("USE enviosPractica");
            ResultSet obtenerDato = instruccionSQL5.executeQuery("SELECT codDestino FROM Destino WHERE nombre = '" + destinos + "'");
            System.out.println(obtenerDato.first());
            codDestino = obtenerDato.getInt("codDestino");
            System.out.println("si funciona");
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe en base de datos");

        }
    }
      
      public boolean GuardarRutal(ConectorMySQL conector,javax.swing.JComboBox<String> destino , int numeroCodRuta){
         try{
            identificarCodDestino(conector,destino);
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeUpdate("INSERT INTO Ruta VALUES ("+ codDestino+", 'A"+numeroCodRuta+"', 'Activo');");
            return true;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en crear usuario" );
            e.printStackTrace();
            return false;
        }
    }
      
       public void leerRuta(ConectorMySQL conector, javax.swing.JTable tablaReportes){
        try {
            int codigoDestino =1;
            DefaultTableModel reportePuntos = new DefaultTableModel();
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            Statement instruccionSQL4 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet rs= instruccionSQL3.executeQuery(" SELECT codDestino, codigoRuta, estado FROM Ruta ;");
            System.out.println(rs.first());
            reportePuntos.setColumnIdentifiers(new Object[]{"Codigo Ruta" , "Estado", "codDestino" , "Nombre Destino"});
            
            System.out.println(rs.getInt("codDestino"));
            while(rs.next()){
                codigoDestino = rs.getInt("codDestino");
                ResultSet rs2 = instruccionSQL4.executeQuery("SELECT nombre FROM Destino WHERE codDestino ="+ codigoDestino +";");
                rs2.first();
                reportePuntos.addRow(new Object []{rs.getString("codigoRuta"),rs.getString("estado"), rs.getString("codDestino"), rs2.getString("nombre")});
            }
            tablaReportes.setModel(reportePuntos);
            
        } catch (SQLException e) {
            System.out.println(" incorrecto no existe Rutas en la base de datos");
            
        }
    }
    
}
