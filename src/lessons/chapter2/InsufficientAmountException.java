package lessons.chapter2;

public class InsufficientAmountException extends Exception{
    long amount;
    InsufficientAmountException(long amount){
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return ("You got no money in the bank!");
    }
}
