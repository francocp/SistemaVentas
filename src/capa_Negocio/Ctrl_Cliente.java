package capa_Negocio;

import capa_Datos.Cliente;
import conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author mikey
 */
public class Ctrl_Cliente {

    Conexion sql = new Conexion();
    Connection cn = sql.conectar();
    String SQL = "";
    
    public DefaultTableModel mostrarEnLaTabla(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "Apellidos", "DNI", "RUC", "Edad", "Sexo", "Telefono", "Direccion"};
        modelo = new DefaultTableModel(null, titulos);
        String[] registrosClientes = new String[9];

        SQL = ("CALL sp_BuscarClientes '" + buscar + "'");
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registrosClientes[0] = rs.getString(1);
                registrosClientes[1] = rs.getString(2);
                registrosClientes[2] = rs.getString(3);
                registrosClientes[3] = rs.getString(4);
                registrosClientes[4] = rs.getString(5);
                registrosClientes[5] = rs.getString(6);
                registrosClientes[6] = rs.getString(7);
                registrosClientes[7] = rs.getString(8);
                registrosClientes[8] = rs.getString(9);
                modelo.addRow(registrosClientes);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertarCliente(Cliente cliente) {
        Connection cn = Conexion.conectar();
        String SQL = "";
        SQL = (" CALL sp_GuardarClientes(?, ?, ?, ?, ?, ?, ?, ?, ?)");

        try {
            PreparedStatement ps = cn.prepareStatement(SQL);
            ps.setString(1, cliente.getID());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellidos());
            ps.setString(4, cliente.getDni());
            ps.setString(5, cliente.getRuc());
            ps.setInt(6, cliente.getEdad());
            ps.setString(7, cliente.getSexo());
            ps.setString(8, cliente.getTelefono());
            ps.setString(9, cliente.getDireccion());

            int n = ps.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error" + e.getMessage());
            return false;
        }
    }

    public boolean editarCliente(Cliente cliente) {
        Connection cn = Conexion.conectar();
        String SQL = "";
        SQL = (" CALL sp_editarClientes(?, ?, ?, ?, ?, ?, ?, ?, ?)");

        try {
            PreparedStatement ps = cn.prepareStatement(SQL);
            ps.setString(1, cliente.getID());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellidos());
            ps.setString(4, cliente.getDni());
            ps.setString(5, cliente.getRuc());
            ps.setInt(6, cliente.getEdad());
            ps.setString(7, cliente.getSexo());
            ps.setString(8, cliente.getTelefono());
            ps.setString(9, cliente.getDireccion());

            int n = ps.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminarCliente(Cliente cliente) {
        Connection cn = Conexion.conectar();
        String SQL = "";
        SQL = ("CALL sp_EliminarClientes(?)");
        try {
            PreparedStatement ps = cn.prepareStatement(SQL);
            ps.setString(1, cliente.getID());

            int n = ps.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public int generarIDCliente() {
        Connection cn = Conexion.conectar();
        String SQL = "";
        String sql = ("SELECT MAX(idCliente) as id FROM tbl_Clientes");
        int cod = 0;

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                cod = rs.getInt("ID") + 1;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error con la Base de Datos" + e.getMessage());
        }
        return cod;
    }
}
