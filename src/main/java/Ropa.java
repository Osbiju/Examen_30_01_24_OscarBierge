import java.util.Date;

public class Ropa extends Productes{

    private String talla;
    private String tipoTejido;
    private String tipoDePrenda;

    public Ropa(String nombre, String marca, double precio, int stock, double rebaja, String talla, String tipoTejido, String tipoDePrenda) {
        super(nombre, marca, precio, stock, rebaja);
        this.talla = talla;
        this.tipoTejido = tipoTejido;
        this.tipoDePrenda = tipoDePrenda;
    }

    public String getTalla() {
        return talla;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public String getTipoDePrenda() {
        return tipoDePrenda;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    public void setTipoDePrenda(String tipoDePrenda) {
        this.tipoDePrenda = tipoDePrenda;
    }

    @Override
    public void calcularFechaVencimientoGarantia() {

    }

    @Override
    public double aplicarRebaja() {
        return 0; // pq no tiene rebaja
    }
}
