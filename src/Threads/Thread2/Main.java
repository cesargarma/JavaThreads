package Threads.Thread2;

public class Main {
    public static void main(String[] args) {
        ThreadCreator thread1 = new ThreadCreator(1);
        thread1.setName("Thread-1");
        thread1.run();

        ThreadCreator thread2 = new ThreadCreator(2);
        thread2.setName("Thread-2");
        thread2.run();
    }
}
