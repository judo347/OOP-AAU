package problem7;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdrawel(int amount){
        if(amount >= balance)
            throw new InsufficientFundsException(amount - balance);
        if(amount < 0)
            throw new IllegalArgumentException("You done fucked up!");
        this.balance -= amount;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void printBalance(){
        System.out.println("The current balance is: " + balance);
    }
}
