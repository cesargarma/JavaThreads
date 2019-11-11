package Threads.Thread3;

public class ThreadGenerator3 extends Thread{

    private int number;
    public int contador = 0;

    public ThreadGenerator3(int number){
        this.number = number;
        System.out.println("Creando hilo "+this.number);
    }

    @Override
    public void run() {
        while (true){
            contador++;
        }
    }

    public int getContador(){
        return contador;
    }
}
