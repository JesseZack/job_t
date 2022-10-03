package lessons.chapter3;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        int a[] = {2, 6, 4, 0, 1, 5, 3};
        MyThread2 t1 = new MyThread2(a);
        t1.join();
        System.out.println("Main printing array elements are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
