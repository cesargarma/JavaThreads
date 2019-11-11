package Threads.Thread4;

public class Main4 {
    public static void main(String[] args) {
        Contador contador = new Contador();

        Hilo thread1 = new Hilo(1, contador);
        Hilo thread2 = new Hilo(2, contador);

        thread1.start();
        thread2.start();

    }
}
