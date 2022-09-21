
package beans;


public class Producto {
    private int id_producto;
    private String marca;
    private int existencias;
    private String especificaciones;
    private double precio;

    public Producto(int id_producto, String marca, int existencias, String especificaciones, double precio) {
        this.id_producto = id_producto;
        this.marca = marca;
        this.existencias = existencias;
        this.especificaciones = especificaciones;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", marca=" + marca + ", existencias=" + existencias + ", especificaciones=" + especificaciones + ", precio=" + precio + '}';
    }


}
