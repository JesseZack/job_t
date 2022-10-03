package lessons.chapter2;

public class ExcessiveAmountException extends Exception{
    long amount;
    ExcessiveAmountException(long amount){
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return ("You can't withdraw that much sorry yout maximum amount is USD" + Bank.MaximumAmount);
    }
}
