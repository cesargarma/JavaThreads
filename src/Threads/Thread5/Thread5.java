package Threads.Thread5;

public class Thread5 extends Thread {

    private int cantidad;
    private Cuenta cuenta;

    public Thread5(int cantidad, Cuenta cuenta){
        this.cantidad = cantidad;
        this.cuenta = cuenta;

        System.out.println("Creando hilo...");
    }

    @Override
    public void run() {
        cuenta.retirarDinero(cantidad, "Cesar");
    }
}
