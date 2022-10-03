package lessons.chapter3;

public class PriorityDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Child's priority " + getPriority());
        setPriority(3);
        System.out.println("After Change, Child's Priority: " + getPriority()) ;
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Mains initial priority: " + t.getPriority());
        t.setPriority(7);
        System.out.println("After change, mains priority: " + t.getPriority());
        new PriorityDemo().start();
    }
}
