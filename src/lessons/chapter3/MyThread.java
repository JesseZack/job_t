package lessons.chapter3;

public class MyThread extends Thread{
    boolean active = true;
    public void Suspend(){
        active = false;
    }
    public synchronized void Resume(){
        active = true;
        notify();
    }
    public synchronized void run(){
        try{
            while (true){
                if(active){
                    System.out.println("Running...");
                    Thread.sleep(500);
                }else{
                    System.out.println("Suspended...");
                    wait();
                }
            }
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }
}
