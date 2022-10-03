package lessons.chapter2;

public class ExceptionTest {
    public static void main(String[] args) {
        int d= 0, result;
        try {
            result = 100/d;
        } catch (Exception e) {
            System.out.println("There was an eror: " + e.getMessage());;
        }
        //     System.out.println(result);

    }
}
