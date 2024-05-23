package lesson16.test7;

public class Main {
    public static void main(String[] args) {
Customer customer = new Customer();
new Thread(()-> customer.withdraw(1500)).start();
new Thread(()-> customer.deposit(1000)).start();
    }
}
class Customer{
    int amount = 1000;

    public synchronized void withdraw(int amount){
        System.out.println("Попытка снятия($" + amount + ") денежных средств...");
        if (this.amount < amount){
            System.out.println("На вашем счету: $ " + this.amount + ". Баланс слишком мал. Ожидание депозита или вклада");
            try {
                wait();
            }catch (InterruptedException ex){
                System.out.println(ex);
            }
        }
        this.amount -= amount;
        System.out.println("Деньги сняты, на счету осталось: $" + this.amount);
    }
    public synchronized void deposit(int amount){
        System.out.println("Попытка внести деньги ($ " + amount + ") на депозит...");
        this.amount += amount;
        System.out.println("Деньги поступили на депозит. Всего на счету: $" + this.amount);
        notifyAll();
    }
}