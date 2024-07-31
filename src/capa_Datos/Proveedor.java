package capa_Datos;

/**
 *
 * @author mikey
 */
public class Proveedor {
    
    private String idProvvedor;
    private String razonSocial;
    private String RUC;
    private String telefono;
    private String direccion;

    public Proveedor(String idProvvedor, String razonSocial, String RUC, String telefono, String direccion) {
        this.idProvvedor = idProvvedor;
        this.razonSocial = razonSocial;
        this.RUC = RUC;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Proveedor() {
    }

    public String getIdProvvedor() {
        return idProvvedor;
    }

    public void setIdProvvedor(String idProvvedor) {
        this.idProvvedor = idProvvedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
