package lessons.chapter3;

public class Counter {
    int val = 0;
    final Object o = new Object();
    void inc() {
        synchronized (o){
            val++;
        }
    }
    void dcr() {
        synchronized (o){
            val--;
        }
    }
}
