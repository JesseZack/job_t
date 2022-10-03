package lessons.chapter3;

public class PriorityTest {
    public static void main(String[] args) throws Exception{
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        Thread.sleep(100);
        System.out.println("Thread 1 count: " + t1.getCount());
        System.out.println("Thread 2 count: " + t2.getCount());

    }
}
