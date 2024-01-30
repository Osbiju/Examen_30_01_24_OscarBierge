import java.util.Calendar;
import java.util.Date;

public class ComponentesElectronicos extends Productes{

    private int resolucionImagen;
    private int capacidadBateria;
    private final int GARANTIA = 9;


    public ComponentesElectronicos(String nombre, String marca, double precio, int stock, Date fechaCompra, double rebaja, int resolucionImagen, int capacidadBateria) {
        super(nombre, marca, precio, stock, fechaCompra, rebaja);
        this.resolucionImagen = resolucionImagen;
        this.capacidadBateria = capacidadBateria;
    }

    public int getResolucionImagen() {
        return resolucionImagen;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public int getGARANTIA() {
        return GARANTIA;
    }

    public void setResolucionImagen(int resolucionImagen) {
        this.resolucionImagen = resolucionImagen;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }


    @Override
    public void calcularFechaVencimientoGarantia() {

    }

    @Override
    public double aplicarRebaja() {
        return 0;
    }
}
