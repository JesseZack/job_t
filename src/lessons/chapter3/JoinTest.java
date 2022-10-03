package lessons.chapter3;

public class JoinTest {
    public static void main(String[] args) throws Exception {
        int a[] = {2,3,4,0,1};
        int[] b = {6,9,8,7,5};
        MyThread5 t1 = new MyThread5(a);
        MyThread5 t2 = new MyThread5(b);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.join();
        t2.join();
        int[] result = merge(a,b);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
    static int[] merge(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) result[k++] = a[i++];
            else result[k++] = b[j++];
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }
}
