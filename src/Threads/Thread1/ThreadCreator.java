package Threads.Thread1;

public class ThreadCreator extends Thread{

    private int number;

    public ThreadCreator(int number){
        this.number = number;
        System.out.println("Creando hilo "+this.number);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecución del hilo número " + this.number + ". Iteracción: " + (i+1));
        }
    }
}
