package lessons.chapter3;

import java.util.Date;

public class SleepDemo {
    public static void main(String[] args) {
        for(;;){
            System.out.println("Local Date and Time: " + new java.util.Date());

            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                System.out.println("Quitting!");
                continue;
            }

        }
    }
}
