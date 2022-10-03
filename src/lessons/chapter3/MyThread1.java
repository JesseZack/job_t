package lessons.chapter3;

public class MyThread1 extends Thread{
    int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true){
            count++;
        }
    }
}
