import java.time.LocalDateTime;
import java.util.*;

public class SistemaGestion {

    Scanner entrada = new Scanner(System.in);

    private ArrayList<Productes> productes = new ArrayList<>();


    public void crearProducte(Productes p){
        String nom = "";
        String marca = "";
        double preu = 0;
        int stock = 0;
        int opcio = 0;


        System.out.println("Introdueix el nom del prudcte");
        nom = entrada.nextLine();
        System.out.println("Introdueix la marca del producte");
        marca = entrada.nextLine();
        System.out.println("Introdueix el preu del producte");
        preu = entrada.nextInt();
        System.out.println("Introdueix la cantitat d'estock del producte");
        stock = entrada.nextInt();
        System.out.println("De quin tipus es el producte?:" +
                "\n1. Ropa" +
                "\n2. Electrodomesticos" +
                "\n3. Componentes electronicos" +
                "\n4. Belleza");
        opcio = entrada.nextInt();
        switch (opcio){

            case 1:
                String talla = "";
                String tipoTejido = "";
                String tipusPrenda = "";
                double rebaja = 0;

                System.out.println("Talla de la roba");
                talla = entrada.nextLine();
                System.out.println("Quint es el tipus de teixit utilitzat?");
                tipoTejido = entrada.nextLine();
                System.out.println("Quin tipus de prenda vols afegir?");
                tipusPrenda = entrada.nextLine();
                System.out.println("Quina rebaixa vols aplicar");
                rebaja = entrada.nextInt();

                Ropa ropa = new Ropa(nom, marca, preu, stock, rebaja, talla, tipoTejido, tipusPrenda );

                //TODO crear el producte y afegirlo a larray
                break;
            case 2:
                //TODO crear el producto de electrodomesticos
                break;
            case 3:
                //TODO crear el producto de componentes
                break;
            case 4:
                //TODO crear el producto de belleza
                break;
        }


        productes.add(p);
    }

    public void llistarProducte(){
        Collections.sort(productes, (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));

        for (Productes p : productes) {
            System.out.println(p.getID()+ " - " + p.getNombre() + " - " + p.getPrecio());
        }
    }

    public void eliminarProducto(int codigo) {
        Productes productoAEliminar = null;
        boolean encontrado = false;

        for (Productes p : productes) {
            if (p.getID() == codigo) {
                encontrado = true;
                productoAEliminar = p;
            }
        }
        if (encontrado) {
            productes.remove(productoAEliminar);
            System.out.println("Producte eliminat");
        } else {
            System.out.println("No existeix el producto amb el codi " + codigo);
        }
    }
    public void calcularFechaVencimiento(){

    }

    public void aplicarRebaja(int porcentaje){
        for (Productes p : productes){
            p.setRebaja(porcentaje);
        }

    }

    public void listarProductosRebajados(){
        for (Productes p : productes){
            if(p.getRebaja() > 0){
                System.out.println(p.getID() + " - " + p.getNombre() + " - Rebaja: " + p.getRebaja() + " %");
            }
        }

    }

    public void consultarStock(int codigo){
        for (Productes p : productes){
            System.out.println(p);
        }

    }

    public void augmentarStock(){

    }

    public void quitarStock(){

    }

}
