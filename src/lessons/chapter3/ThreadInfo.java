package lessons.chapter3;

public class ThreadInfo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current Thread: " + t);
        System.out.println("Name: " + t.getName());
        System.out.println("Id: " + t.getId());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("State: " + t.getState());

        //Setting states
        System.out.println("Setting Name and Priority");
        t.setName("Primary");
        t.setPriority(8);

        //Printing out the values
        System.out.println("\nPrinting new Values for thread: ");
        System.out.println("Current Thread: " + t);
        System.out.println("Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
    }
}
