package lessons.chapter3;

import java.util.Arrays;

public class MyThread4 extends Thread{
    int[] a;
    MyThread4(int[] arr){
        a = arr;
        start();
    }

    public int[] getA() {
        return a;
    }

    @Override
    public void run() {
        System.out.println("Array Before Sort....");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        System.out.println("Array After Sort...");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Sorting done.....");
    }
}
