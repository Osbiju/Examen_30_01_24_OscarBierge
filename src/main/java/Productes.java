import java.util.Date;

public abstract class Productes {
    private static int codiProducte = 0;
    private final int ID;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;
    private Date fechaCompra;
    private double rebaja;

    public Productes(String nombre, String marca, double precio, int stock, double rebaja) {
        this.ID = codiProducte++;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.rebaja = rebaja;
    }

    public static int getCodiProducte() {
        return codiProducte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public double getRebaja() {
        return precio * (1 - rebaja / 100);
    }

    public int getID() {
        return ID;
    }

    public static void setCodiProducte(int codiProducte) {
        Productes.codiProducte = codiProducte;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setRebaja(int rebaja) {
        this.rebaja = rebaja;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "codigoProducto=" + ID +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", fechaCompra=" + fechaCompra +
                ", porcentajeRebaja=" + rebaja +
                '}';
    }

    public abstract void calcularFechaVencimientoGarantia();

    public abstract double aplicarRebaja();


}
