package lessons.chapter2;

public class RethrowTest {
    void f(){
        try{
            int a = 0;
            int b = 100 / a;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getMessage() + " Partially handled by f");
            throw e;
        }finally {
            System.out.println("In finally of f");
        }
    }

    void g(){
        try{
            f();
        }catch (Exception e){
            System.out.println(e.getMessage() + " Fully handled by g");
        }
    }
    
    public static void main(String[] args) {
        new RethrowTest().g();
    }

}
