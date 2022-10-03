package lessons.chapter3;

import java.util.Objects;

public class SuspendResume {
    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread();
        mt.start();
        while (true){
            Thread.sleep(1000);
            mt.Suspend();
            Thread.sleep(1000);
            mt.Resume();
        }
    }
}
