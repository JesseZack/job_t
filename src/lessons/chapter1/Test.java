package lessons.chapter1;

/**
 * Test for chapter 1
 */
public class Test {
    int v = 4;

    public static void main(String[] args) {
        int x =2, y=3;
        int z = add(x, y );
        Test t = new Test();
        t.set(6);
        System.out.println(x + "+" + y + "+" + "=" + z);
    }

    /**
     * A function that returns the sum of two numbers
     * @param x One of the integers to be added
     * @param y One of the integers to be added
     * @return returns the sum of x and y.
     */
    public static int add(int x, int y){
        return x + y;
    }

    /**
     * Assign a new value to v
     * @param x the new value to for v
     */
    public void set(int x){v=x;}
}
