package Threads.Thread6;

import java.util.concurrent.TimeUnit;

import static Threads.Thread6.Main.almacen;

public class Granja extends Thread{
    private String nombre;
    private int extension;


    public Granja(String nombre, int extension){
        this.nombre = nombre;
        this.extension = extension;
    }

    public void Produccion(){
        almacen.addComida(extension, this.nombre);

    }

    @Override
    public void run() {
        while (true) {
            this.Produccion();
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.out.println("Producción de la granja " + this.nombre + " interrumpido.");
            }
        }
    }

}
