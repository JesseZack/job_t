package lessons.chapter2;

public class Bank {
    static long MaximumAmount = 15000;
    public void withdraw(long accNo, long amount)throws InsufficientAmountException, ExcessiveAmountException{
        long balance = getBalance(accNo);

        if (amount>MaximumAmount){
            throw new ExcessiveAmountException(amount);
        }

        if (balance<amount){
            throw new InsufficientAmountException(amount);
        }

    }
    private long getBalance(long accNo){
        return 0;
    }
}
