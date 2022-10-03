package lessons.chapter3;

import java.util.Arrays;

public class MyThread2 extends Thread{
    int[] a;
    MyThread2(int[] ar){
        a = ar;
        start();
    }

    @Override
    public void run() {
        Arrays.sort(a);
        System.out.println("Child completed sorting!");
    }
}
