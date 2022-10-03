package lessons.chapter3;

public class DeadlockThread extends Thread{
    String s1, s2;
    int id;
    DeadlockThread(int i, String r1, String r2){
        s1 = r1;
        s2 = r2;
        id = i;
        start();
    }

    @Override
    public void run() {
        synchronized (s1){
            System.out.println("Thread " + id + " Obtained a lock on " + s1);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {}
            System.out.println("Thread" + id + "is waiting to obtain a lock on " + s2);
            synchronized (s2){
                System.out.println("Thread" + id + "is waiting to obtain a lock on " + s2);
            }
        }
    }
}
