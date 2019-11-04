package Threads.Thread1;

public class Main {
    public static void main(String[] args) {
        ThreadCreator miHijo = new ThreadCreator(1);
        miHijo.run();
        ThreadCreator miHijo2 = new ThreadCreator(2);
        miHijo2.run();
        ThreadCreator miHijo3 = new ThreadCreator(3);
        miHijo3.run();
    }
}
