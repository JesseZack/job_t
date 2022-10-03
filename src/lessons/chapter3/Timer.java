package lessons.chapter3;

import java.util.Date;

public class Timer extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Timer is running. Date and Time: " + new Date() + " Thread: " + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Timer was interrupted!");
                return;
            }
        }
    }
}
