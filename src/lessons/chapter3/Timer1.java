package lessons.chapter3;

import java.util.Date;

public class Timer1 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Timer is running. Date and Time: " + new Date() + " Thread: " + Thread.currentThread().getName());
            if(Thread.interrupted()){
                System.out.println("Timer was interrupted!");
                return;
            }
        }
    }
}
