package Threads.Thread3;

public class Main3 {
    public static void main(String[] args) {
        ThreadGenerator3 thread1 = new ThreadGenerator3(1);
        thread1.setPriority(1);
        thread1.setName("Thread-1");

        ThreadGenerator3 thread2 = new ThreadGenerator3(2);
        thread2.setPriority(5);
        thread2.setName("Thread-2");

        ThreadGenerator3 thread3 = new ThreadGenerator3(3);
        thread3.setPriority(10);
        thread3.setName("Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(10000);
            /*thread1.sleep(10000);*/
            System.out.println("Parando los hilos.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Atributo 1: " + thread1.getContador());
        System.out.println("Atributo 2: " + thread2.getContador());
        System.out.println("Atributo 3: " + thread3.getContador());
    }
}
