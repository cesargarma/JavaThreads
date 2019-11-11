package Threads.Thread2;

public class ThreadCreator extends Thread {
    private int number;

    public ThreadCreator(int number){
        this.number = number;
        System.out.println("Creando hilo "+this.number);
    }

    @Override
    public void run() {
        System.out.println("Nombre: " + getName() + "\n" +
                            "ID: " + getId() + "\n" +
                            "Prioridad: " + getPriority() + "\n");
    }
}