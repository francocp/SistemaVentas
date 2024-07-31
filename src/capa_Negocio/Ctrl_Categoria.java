package capa_Negocio;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import capa_Datos.Categoria;

/**
 *
 * @author mikey
 */
public class Ctrl_Categoria {
    
    //Metodo para agregar categorias
    
    
    public boolean guardar(Categoria categoria){
        boolean resultado = false;
        Connection cn = Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tbl_Categoria VALUES(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, categoria.getDescripcion());
            consulta.setInt(3, categoria.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                resultado = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al guardar la categoria: " + e);
        }
        return resultado;
    }
    
    //Metodo para validar la existencia de una categoria
    public boolean existencia_Categoria(String categoria){
        boolean resultado = false;
        String sql = "SELECT descripcion FROM tbl_Categoria WHERE descripcion = '" +categoria+ "';";
        Statement st;
        
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println("Hay un error al consultar un la categoria: " + e);
        }
        return resultado;
    }
    
    public boolean actualizar(Categoria categoria, int id_Categoria){
        boolean resultado = false;
        Connection con = Conexion.conectar();
        
        try {
            PreparedStatement consulta = con.prepareStatement("UPDATE tbl_Categoria SET descripcion = ? WHERE idCategoria = '" + id_Categoria + "'");
            consulta.setString(1, categoria.getDescripcion());
            
            if (consulta.executeUpdate() > 0) {
                resultado = true;
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al actualizar la categoria: " + e);
        }
        return resultado;
    }
    
    public boolean eliminar(int id_Categoria){
        boolean resultado = false;
        Connection con = Conexion.conectar();
        
        try {
            PreparedStatement consulta = con.prepareStatement("DELETE FROM tbl_Categoria WHERE idCategoria = '" + id_Categoria + "'");
            consulta.executeUpdate();
            
            if (consulta.executeUpdate() > 0) {
                resultado = true;
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al eliminar la categoria: " + e);
        }
        return resultado;
    }
}
