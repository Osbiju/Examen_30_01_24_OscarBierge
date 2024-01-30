import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcio = 0;
        String resposta = "";

        do {
        System.out.println("Benvingut al Corte Irlandes, esculli una de les seguents opcions" +
                "\n1. Crear un producto" +
                "\n2. Listar productos ordenados de mayor a menor precio" +
                "\n3. Eliminar producto" +
                "\n4. Calcular fecha de vencimiento de la garantia" +
                "\n5. Aplicar rebajas a productos" +
                "\n6. Productos en rebajas" +
                "\n7. Consultar stock de un producto" +
                "\n8. Aumentar stock de un prducto" +
                "\n9. Quitar stock de un producto" +
                "\n10. Salir");
        opcio = entrada.nextInt();

        switch (opcio){
            case 1:
                //TODO crear producte
                break;
            case 2:
                //TODO llistar producte (de major a menor)
                break;
            case 3:
                //TODO Eliminar producte
                break;
            case 4:
                //TODO Calcular fecha vencimiento garantia
                break;
            case 5:
                //TODO Aplicar rebaja
                break;
            case 6:
                //TODO listar productos en rebajas
                break;
            case 7:
                //TODO consultar stock de un producto
                break;
            case 8 :
                //TODO augmentar stock de un producto
                break;
            case 9:
                //TODO quitar stock de un producto
                break;
            case 10:
                resposta = "Gracies per utilizar el programa, fins aviat";
                break;
            default:
                resposta = "Error, no has seleccionat una opcio valida";
                break;
        }
            System.out.println(resposta);

        }while (opcio != 10);


    }
}
