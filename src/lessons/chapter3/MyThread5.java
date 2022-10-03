package lessons.chapter3;

import java.util.Arrays;

public class MyThread5 extends Thread{
    int[] a;
    MyThread5(int[] arr){
        a= arr;
        start();
    }

    @Override
    public void run() {
        Arrays.sort(a);
    }
}
