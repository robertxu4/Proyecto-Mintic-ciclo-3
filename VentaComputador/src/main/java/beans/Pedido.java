
package beans;
import java.sql.Date;

public class Pedido {
    private int id_compra;
    private String usuario;
    private int id_producto;
    private double valor_total;
    private int cantidad;
    private Date fecha;
    private String ciudad;
    private String direccion;
    private String marca;
    private String especificaciones;

    public Pedido(int id_compra, String usuario, int id_producto, double valor_total, int cantidad, Date fecha, String ciudad, String direccion, String marca, String especificaciones) {
        this.id_compra = id_compra;
        this.usuario = usuario;
        this.id_producto = id_producto;
        this.valor_total = valor_total;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.marca = marca;
        this.especificaciones = especificaciones;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_compra=" + id_compra + ", usuario=" + usuario + ", id_producto=" + id_producto + ", valor_total=" + valor_total + ", cantidad=" + cantidad + ", fecha=" + fecha + ", ciudad=" + ciudad + ", direccion=" + direccion + ", marca=" + marca + ", especificaciones=" + especificaciones + '}';
    }

 
    
}
