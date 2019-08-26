
package enviospractica1.Backend;

import enviospractica1.ConectorMySQL;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Paquete {
    private int peso;
    private int destino;
    private boolean prioridad;
    private final int precioPrioridad = 10;
    private String remitente;
    private String estado;
    private String codRuta;
    private int NumeroGuia;
    private int precioPaquete;

    public Paquete(int peso, int destino, boolean prioridad, String remitente) {
        this.peso = peso;
        this.destino = destino;
        this.prioridad = prioridad;
        this.remitente = remitente;
    }

    public Paquete() {
    }

    
    
    public String getCodRuta() {
        return codRuta;
    }

    public void setCodRuta(String codRuta) {
        this.codRuta = codRuta;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int Destino) {
        this.destino = Destino;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroGuia() {
        return NumeroGuia;
    }

    public void setNumeroGuia(int NumeroGuia) {
        this.NumeroGuia = NumeroGuia;
    }

    public int getPrecioPrioridad() {
        return precioPrioridad;
    }

    public int getPrecioPaquete() {
        return precioPaquete;
    }

    public void setPrecioPaquete(int precioPaquete) {
        this.precioPaquete = precioPaquete;
    }
    
    
    public boolean GuardarEnvio(ConectorMySQL conector, int codFactura){
         try{
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeUpdate("INSERT INTO Paquete VALUES ('"+NumeroGuia+"',"+ peso+","+destino+",'0','" +String.valueOf(codFactura)+"','" +estado+ "',"+prioridad+" ,"+precioPaquete+");");
            JOptionPane.showMessageDialog(null,"EL paquete SE HA REGISTRADO CON EXITO");
             System.out.println("se ha guardado el paquete");
            return true;
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en crear usuario" );
            e.printStackTrace();
            return false;
        }
    }
    
    public int obtenerNumeroGuia(ConectorMySQL conector){
        try{
            int guia;
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenerGuia= instruccionSQL3.executeQuery("SELECT MAX(numeroDeGuia) FROM Paquete;");
            System.out.println(obtenerGuia.first());
            guia = Integer.parseInt(obtenerGuia.getString("MAX(numeroDeGuia)"));
            System.out.println(guia);
            return (guia+1);
            
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener Numero" );
            e.printStackTrace();
            return 0;
        }
    }
     
    public void obtenerPaquetesDelPunto(ConectorMySQL conector , String codPunto , javax.swing.JComboBox<String> paquete){
          try{
              System.out.println(codPunto);
            paquete.removeAllItems();
            Statement instruccionSQL4 = conector.getConexion().createStatement();
            instruccionSQL4.executeQuery("USE enviosPractica");
            ResultSet obtenerPunto= instruccionSQL4.executeQuery("SELECT numeroDeGuia FROM Pasar WHERE (codPuntoDeControl = '"+codPunto+"') AND (numeroDeHoras<=0);");
            obtenerPunto.first();
            paquete.addItem(obtenerPunto.getString("numeroDeGuia"));
            while(obtenerPunto.next()){
                 paquete.addItem(obtenerPunto.getString("numeroDeGuia"));
            }
        } catch (HeadlessException | SQLException e){
            System.out.println("no hay paquetes en la ruta" );
            
        }
     }
    
    public void ListarPaquetesDelPunto(ConectorMySQL conector , String codPunto ,javax.swing.JTable tablaReportes){
          try{
            DefaultTableModel reportePaquetes = new DefaultTableModel();
            Statement instruccionSQL4 = conector.getConexion().createStatement();
            instruccionSQL4.executeQuery("USE enviosPractica");
            ResultSet obtenerPaquete= instruccionSQL4.executeQuery("SELECT numeroDeGuia, codPuntoDeControl, numeroHoras FROM Pasar WHERE (codPuntoDeControl = '"+codPunto+"') AND (numeroDeHoras<=0);");
            obtenerPaquete.first();
            reportePaquetes.setColumnIdentifiers(new Object[]{"Numero De Guia" , "Codigo Del Punto ", "Horas" , "Capacidad"});
            reportePaquetes.addRow(new Object []{obtenerPaquete.getString("numeroDeGuia"),obtenerPaquete.getString("codPuntoDeControl"), obtenerPaquete.getInt("numeroHoras")});
            while(obtenerPaquete.next()){
                reportePaquetes.addRow(new Object []{obtenerPaquete.getString("numeroDeGuia"),obtenerPaquete.getString("codPuntoDeControl"), obtenerPaquete.getInt("numeroHoras")});
            }
            tablaReportes.setModel(reportePaquetes);
        } catch (HeadlessException | SQLException e){
            System.out.println("no hay paquetes en la ruta" );
            
        }
     }
     
    public int obtenerDestino(ConectorMySQL conector, String numeroGuia){
        try{
            System.out.println(numeroGuia);
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenerGuia= instruccionSQL3.executeQuery("SELECT codDestino FROM Paquete WHERE numeroDeGuia ='"+numeroGuia+"';");
            System.out.println(obtenerGuia.first());
            System.out.println(obtenerGuia.getInt("codDestino"));
            return obtenerGuia.getInt("codDestino");
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener DESTINO" );
            JOptionPane.showMessageDialog(null, "el paquete no existe esta Asignado al punto de contol" );
            return 0;
        }
    }
    
    public int obtenerFactura(ConectorMySQL conector, String numeroGuia){
        try{
            System.out.println(numeroGuia);
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            ResultSet obtenerGuia= instruccionSQL3.executeQuery("SELECT idFactura FROM Paquete WHERE numeroDeGuia ='"+numeroGuia+"';");
            System.out.println(obtenerGuia.first());
            System.out.println(obtenerGuia.getInt("idFactura"));
            return Integer.valueOf(obtenerGuia.getString("idFactura"));
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en obtener idFactura" );
            return 0;
        }
    }
     
    public void ingresarHoras(ConectorMySQL conector, String numeroGuia, int horas){
         try{
            System.out.println(numeroGuia);
             System.out.println(horas);
            Statement instruccionSQL3 = conector.getConexion().createStatement();
            instruccionSQL3.executeQuery("USE enviosPractica");
            instruccionSQL3.executeUpdate("UPDATE Pasar SET numeroHoras = "+horas+" WHERE (numeroDeGuia ='"+numeroGuia+"');");
            
        } catch (HeadlessException | SQLException e){
            System.out.println("ha fallado la conexion en ingresar horas" );
            
        }
    }
}
