import java.util.Date;

public class Belleza extends Productes{
    private boolean esVegano;
    private String temporadaUso;


    public Belleza(String nombre, String marca, double precio, int stock, Date fechaCompra, double rebaja, boolean esVegano, String temporadaUso) {
        super(nombre, marca, precio, stock, rebaja);
        this.esVegano = esVegano;
        this.temporadaUso = temporadaUso;
    }

    public boolean isEsVegano() {
        return esVegano;
    }

    public String getTemporadaUso() {
        return temporadaUso;
    }

    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }

    public void setTemporadaUso(String temporadaUso) {
        this.temporadaUso = temporadaUso;
    }

    @Override
    public void calcularFechaVencimientoGarantia() {

    }

    @Override
    public double aplicarRebaja() {
        return 0;//pq no tiene rebaja
    }
}
