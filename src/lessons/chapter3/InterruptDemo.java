package lessons.chapter3;

public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Timer t  = new Timer();
        t.setName("Banga");
        t.start();
        Thread.sleep(4000);
        t.interrupt();

        Timer1 t1 = new Timer1();
        t1.setName("Wrangler");
        t1.start();
        Thread.sleep(20);
        t1.interrupt();
    }
}
