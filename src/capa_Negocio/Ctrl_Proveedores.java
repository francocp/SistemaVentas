package capa_Negocio;

import conexion.Conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikey
 */
public class Ctrl_Proveedores {
    
    Conexion sql = new Conexion();
    Connection cn = sql.conectar();
    String SQL = "";
    
    public DefaultTableModel mostrarProveedores(String buscar){
        DefaultTableModel modelo;
        
        String[] titulos= {"ID", "Razon Social", "RUC", "Telefono", "Direccion"};
        modelo = new DefaultTableModel(null, titulos);
        String[] registroProveedores = new String[5];
        
        try {
            
        } catch (Exception e) {
        }
        return null;
    }
    
}
