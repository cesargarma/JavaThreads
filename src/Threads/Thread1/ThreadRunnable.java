package Threads.Thread1;

import java.util.concurrent.TimeUnit;

public class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Esto se ejecuta en el runnable ^^ " + (i+1));

            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
