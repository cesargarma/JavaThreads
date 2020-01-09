package Threads.Thread6;

public class Almacen {
    private int cantidadMaxima;
    private int cantidadActual;

    public Almacen(int cantidadMaxima, int cantidadActual){
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public synchronized void addComida(int cantidad, String nombre){
        int temp = cantidadActual + cantidad;

        if(temp <= cantidadMaxima){
            cantidadActual = temp;
            System.out.println("La granja " + nombre + " ha añadido " + cantidad + " unidades de comida. Ahora tiene: " + cantidadActual);
        }
        else{
            cantidadActual = cantidadMaxima;
            System.out.println("Almacen demasiado lleno, no se puede añadir más comida.");
        }
    }

    public synchronized void sacarComida(int cantidad){
        int temp = cantidadActual - cantidad;

        if(temp >= 0){
            cantidadActual = temp;
            System.out.println("Se han retirado " + cantidad + " unidades de comida. Ahora tiene: " + cantidadActual);
        }
        else{
            cantidadActual = 0;
            System.out.println("Almacen demasiado vacio, no se puede sacar más comida.");
        }
    }
}
