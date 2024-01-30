import java.util.Calendar;
import java.util.Date;

public class Electrodomesticos extends Productes{

    private int consumoEnergetico;
    private Date fechaFabricacion;
    private int capacidadCargaLavadora;
    private final int GARANTIA = 18;


    public Electrodomesticos(String nombre, String marca, double precio, int stock, Date fechaCompra, double rebaja,int consumoEnergetico, Date fechaFabricacion, int capacidadCargaLavadora) {
        super(nombre, marca, precio, stock, rebaja);
        this.consumoEnergetico = consumoEnergetico;
        this.fechaFabricacion = fechaFabricacion;
        this.capacidadCargaLavadora = capacidadCargaLavadora;

    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public int getCapacidadCargaLavadora() {
        return capacidadCargaLavadora;
    }

    public int getGARANTIA() {
        return GARANTIA;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setCapacidadCargaLavadora(int capacidadCargaLavadora) {
        this.capacidadCargaLavadora = capacidadCargaLavadora;
    }

    //metode per calcular fi garantia
    @Override
    public void calcularFechaVencimientoGarantia() {
        // La garantía de los electrodomésticos es de 18 meses
        this.fechaFabricacion = new Date(fechaFabricacion.getTime());
    }

    @Override
    public double aplicarRebaja() {
        // Los electrodomésticos no tienen rebajas
        return 0;
    }

    @Override
    public String toString() {
        return "Electrodomésticos{" +
                "consumoEnergetico=" + consumoEnergetico +
                ", fechaFabricacion=" + fechaFabricacion +
                ", capacidad=" + capacidadCargaLavadora +
                ", " + super.toString() +
                '}';
    }

}
