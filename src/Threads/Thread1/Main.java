package Threads.Thread1;

public class Main {
    public static void main(String[] args) {
        ThreadCreator miHijo = new ThreadCreator(1);
        ThreadCreator miHijo2 = new ThreadCreator(2);
        ThreadCreator miHijo3 = new ThreadCreator(3);

        miHijo.start();
        miHijo2.start();
        miHijo3.start();

        for (int i = 0; i < 3; i++) {
            ThreadRunnable miHilo = new ThreadRunnable();
            Thread thread = new Thread(miHilo);
            thread.start();
        }
    }
}
