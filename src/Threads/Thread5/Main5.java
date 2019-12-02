package Threads.Thread5;

public class Main5 {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(150);

        Thread5 thread1 = new Thread5(100, cuenta);
        Thread5 thread2 = new Thread5(100, cuenta);

        thread1.start();
        thread2.start();
    }
}
