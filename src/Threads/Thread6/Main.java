package Threads.Thread6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static ArrayList <Granja> listaGranjas = new ArrayList<>();
    static Almacen almacen;

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        crearAlmacen();

        menu();

    }

    private static void menu() {
        int opcion = -1;
        do{
            System.out.println("1. Añadir granja");
            System.out.println("2. Sacar comida del almacen");
            System.out.println("3. Salir del programa");

            try {
                opcion = teclado.nextInt();

                opciones(opcion);
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número por favor.");
            }

        }while(opcion != 3);
    }

    private static void opciones(int opcion) {
        switch (opcion){
            case 1:
                crearGranja();
                break;
            case 2:
                System.out.print("Cuanta comida quiere sacar: ");
                int cantidad = Integer.parseInt(teclado.next());
                almacen.sacarComida(cantidad);
                break;
            case 3:
                System.out.println("Chao");
                System.exit(0);
                break;
            default:
                System.out.println("Número introducido no válido.");
        }
    }

    private static void crearGranja() {
        System.out.print("Nombre de la granja: ");
        String nombre = teclado.next();

        System.out.print("Extensión de la granja: ");
        int extension = Integer.parseInt(teclado.next());

        Granja granja = new Granja(nombre, extension);

        listaGranjas.add(granja);

        granja.start();
    }

    private static void crearAlmacen() {
        boolean sw = true;

        System.out.println("Datos del almacen: ");
        do {
            try {
                //SOLICITAMOS LOS DATOS
                System.out.print("\t Alamcenaje máximo: ");
                int cantidadMaxima = Integer.parseInt(teclado.next());

                System.out.print("\t Almacenaje actual: ");
                int cantidadActual = Integer.parseInt(teclado.next());
                sw = true;

                //CREAMOS EL ALMACEN
                almacen = new Almacen(cantidadMaxima, cantidadActual);
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número por favor.");
                sw = false;
            }
        } while (!sw);

    }
}
