package capa_Datos;

/**
 *
 * @author mikey
 */
public class Producto {
    
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private String descripcion;
    private int porcentaje_IVA;
    private int idCategoria;
    private int estado;

    public Producto(int idProducto, String nombre, int cantidad, double precio, String descripcion, int porcentaje_IVA, int idCategoria, int estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.porcentaje_IVA = porcentaje_IVA;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }

    public Producto() {
        this.idProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0;
        this.descripcion = "";
        this.porcentaje_IVA = 0;
        this.idCategoria = 0;
        this.estado = 0;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcentaje_IVA() {
        return porcentaje_IVA;
    }

    public void setPorcentaje_IVA(int porcentaje_IVA) {
        this.porcentaje_IVA = porcentaje_IVA;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
