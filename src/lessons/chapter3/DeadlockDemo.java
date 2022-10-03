package lessons.chapter3;

public class DeadlockDemo {
    public static void main(String[] args) {
        int[] a = {2, 6, 4, 0, 1, 5, 3};
        String s1 = new String("S1"), s2 = new String("S2");
        DeadlockThread t1 = new DeadlockThread(1,s1,s2);
        DeadlockThread t2 = new DeadlockThread(2, s1, s2);
    }
}
