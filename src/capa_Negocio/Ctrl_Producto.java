package capa_Negocio;

import capa_Datos.Producto;
import conexion.Conexion;
import java.sql.*;
import capa_Datos.Categoria;

/**
 *
 * @author mikey
 */
public class Ctrl_Producto {
    
    //Metodo para Agregar un producto
    public boolean agregar(Producto producto){
        boolean resultado = false;
        Connection cn = Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tbl_Productos VALUES(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);// idProducto
            consulta.setString(2, producto.getNombre());
            consulta.setInt(3, producto.getCantidad());
            consulta.setDouble(4, producto.getPrecio());
            consulta.setString(5, producto.getDescripcion());
            consulta.setInt(6, producto.getPorcentaje_IVA());
            consulta.setInt(7, producto.getIdCategoria());
            consulta.setInt(8, producto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                resultado = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al guardar un producto: " + e);
        }
        return resultado;
    }
    
    //Metodo para validar la existencia de un producto
    public boolean existencia_Producto(String nom_Producto){
        boolean resultado = false;
        String sql = "SELECT nombre FROM tbl_Productos WHERE nombre = '" +nom_Producto+ "';";
        Statement st;
        
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println("Hay un error 'Este producto no existe': " + e);
        }
        return resultado;
    }
    
    //Metodo para actualizar un producto
    public boolean actualizar(Producto producto, int id_Producto){
        boolean resultado = false;
        Connection con = Conexion.conectar();
        
        try {
            PreparedStatement consulta = con.prepareStatement("UPDATE tbl_Productos SET nombre = ?, cantidad = ?, precio = ?, descripcion = ?, porcentaje_Iva = ?, idCategoria = ?, estado = ? WHERE idProducto = '" + id_Producto + "'");
            consulta.setString(1, producto.getNombre());
            consulta.setInt(2, producto.getCantidad());
            consulta.setDouble(3, producto.getPrecio());
            consulta.setString(4, producto.getDescripcion());
            consulta.setInt(5, producto.getPorcentaje_IVA());
            consulta.setInt(6, producto.getIdCategoria());
            consulta.setInt(7, producto.getEstado());
            if (consulta.executeUpdate() > 0) {
                resultado = true;
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al actualizar el producto: " + e);
        }
        return resultado;
    }
    
    //Metodo para eliminar un producto
    public boolean eliminar(int id_Producto){
        boolean resultado = false;
        Connection con = Conexion.conectar();
        
        try {
            PreparedStatement consulta = con.prepareStatement("DELETE FROM tbl_Productos WHERE idProducto = '" + id_Producto + "'");
            consulta.executeUpdate();
            
            if (consulta.executeUpdate() > 0) {
                resultado = true;
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al eliminar el producto: " + e);
        }
        return resultado;
    }
}
