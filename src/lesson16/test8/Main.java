package lesson16.test8;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        Thread producer = new Thread(new Producer(store));
        Thread comsumer = new Thread(new Consumer(store));
        producer.start();
        comsumer.start();
    }
}
class Store{
    private int product = 0;
    public synchronized void get(){
        while (product < 1){
            try {
             wait();
            }catch (InterruptedException ex){
                System.out.println("Поток прерван " + ex);
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе осталось: " + product);
        notify();
    }

    public synchronized void put(){
        while (product >= 3){
            try {
                wait();
            }catch (InterruptedException ex){
                System.out.println("Поток прерван " + ex);
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе осталось: " + product);
        notify();
    }
}
class Producer implements Runnable{
    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
class Consumer implements Runnable{
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}