package AbstractClass.Account;

public class CurrentAccount implements Account{
    private double balance;
    private double overdraft;

    public CurrentAccount(double balance, double overdraft) {
        this.balance = balance;
        this.overdraft = overdraft;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
    if (this.balance + this.overdraft >= amount){
        this.balance -= amount;
    }else {
        System.out.println("Недостаточно средств");
    }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double getOverdraft() {
        return overdraft;
    }
}
