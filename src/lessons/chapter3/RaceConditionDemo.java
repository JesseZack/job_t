package lessons.chapter3;

public class RaceConditionDemo extends Thread{
    Counter c;
    RaceConditionDemo(Counter c){
        this.c = c;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            c.dcr();
        }
    }

    public static void main(String[] args) throws Exception{
        Counter c = new Counter();
        RaceConditionDemo rc = new RaceConditionDemo(c);
        for (int i = 0; i < 10000; i++) {
            c.inc();
        }
        rc.join();
        System.out.println("Final Value of c.val " + c.val);
    }

}
