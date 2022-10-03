package lessons.chapter3;

public class MyThread3 extends Thread{
    int[] a;
    MyThread3(int[] arr){
        a = arr;
        start();
    }

    @Override
    public void run() {
        try {
            new MyThread4(a).join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
        }
        System.out.println("Done Adding 1 to each element");
    }
}
