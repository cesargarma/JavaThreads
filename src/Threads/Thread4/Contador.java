package Threads.Thread4;

public class Contador {
    private long num = 100;

    public Contador(){    }

    public void incrementar(){
        this.num++;
    }
    public void decrementar(){
        this.num--;
    }

    public long getNum(){
        return this.num;
    }
}
