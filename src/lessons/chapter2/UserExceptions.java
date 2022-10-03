package lessons.chapter2;

public class UserExceptions {
    public static void main(String[] args) {
        Bank b = new Bank();
        try{
            b.withdraw(0,20000);
        }        catch (ExcessiveAmountException | InsufficientAmountException e){
            System.out.println("There was an error");
            System.out.println(e.getMessage());
        }

    }
}
