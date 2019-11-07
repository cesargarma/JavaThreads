package Threads.Thread2;

public class Main {
    public static void main(String[] args) {
        ThreadCreator thread1 = new ThreadCreator(1);
        thread1.setPriority(1);
        thread1.setName("Thread-1");
        thread1.run();

        ThreadCreator thread2 = new ThreadCreator(2);
        thread2.setPriority(2);
        thread2.setName("Thread-2");
        thread2.run();

        ThreadCreator thread3 = new ThreadCreator(3);
        thread3.setPriority(3);
        thread3.setName("Thread-3");
        thread3.run();
    }
}
