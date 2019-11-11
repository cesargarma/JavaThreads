package Threads.Thread4;

public class Hilo extends Thread{
    private Contador contador;
    private int number;

    public Hilo(int number, Contador contador){
        this.number = number;
        this.contador = contador;

        System.out.println("Creando hilo "+this.number);
    }

    @Override
    public void run() {
        synchronized (this.contador){
            for (int i = 0; i < 300; i++) {
                if(number == 1) contador.incrementar();
                else   contador.decrementar();
                //System.out.println(contador.getNum());
            }
        }
        System.out.println("Hilo " + this.number + ": " + this.contador.getNum());
    }
}
