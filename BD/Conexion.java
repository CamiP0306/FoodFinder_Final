package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    String bd = "FoodFinder";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.jdbc.Driver";
    Connection cx;

    public Conexion() {
    }

    public Connection conectar() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Se conectó a la bd " + bd);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar a la bd " + bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }

    public void desconectar() {
        try {
            cx.close();
            System.out.println("Se desconectó de la bd " + bd);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
    }
}