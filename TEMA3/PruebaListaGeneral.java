package Tema3;

import java.util.Scanner;

public class PruebaListaGeneral {

    public static void main(String[] args) {
        ListaGeneral lg = new ListaGeneral();
        Scanner sc = new Scanner(System.in);
        int opc;

        int opc1 = 4;
        boolean salir = false;
        do {
            System.out.println("1. Insertar elementos");
            System.out.println("2. Borrar");
            System.out.println("3. Imprimir datos");
            System.out.println("4. Salir");
            System.out.println("5. Modificar dato");
            System.out.println("6. Busca a ver si el dato esta en la lista");

            System.out.println("Escribe una de las opciones");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Has seleccionado la opcion Insertar elementos");
                    lg.insertarElemento(sc.nextInt(),sc.nextInt());
           
                    System.out.println("");
                    if (lg.existe(115)) {
                        System.out.println("Se encuentra el 115 en la lista");
                    } else {
                        System.out.println("No se encuentra el 115 en la lista");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion Borrar");
                    lg.borrar(2);
                    lg.borrar(1);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion Imprimir");
                    lg.imprimir();
                    System.out.println("");
                    break;
                case 4:
                    salir = true;
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Modifica el dato");
                    lg.Modificar(4);
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("");
                    System.out.println(lg.buscarValor(30) ? "Valor encontrado" : "Valor no encontrado");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Solo numeros entre 1 y 4");
                    break;
            }
        } while (opc != 4);

        /*
        System.out.println("");
        lg.insertarElemento(4, 20);
        lg.imprimir();
        System.out.println("");
        System.out.println("Modifica el dato");
        lg.Modificar(4);
        System.out.println(lg.buscarValor(30) ? "Valor encontrado":"Valor no encontrado");
        System.out.println("");
        lg.imprimir();¨*/
    }
}
