package conexion;

import java.sql.*;

/**
 *
 * @author mikey
 */
public class Conexion {
    
    private static Connection cn = null;
    //Conexion Local
    public static Connection conectar(){
        String url = "jdbc:mysql://localhost:3306/Sistema_Ventas?";
        String usuario = "root";
        String pass = "12345678";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Ha ocurrido un error al conectar la base de datos" + e.getMessage());
        }
        
        try {
            cn = DriverManager.getConnection(url, usuario, pass);
        } catch (SQLException e) {
            System.out.println("Error de conexion con el driver" + e.getMessage());
        }
        return cn;
    }
}
