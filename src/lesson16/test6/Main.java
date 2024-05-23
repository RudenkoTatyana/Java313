package lesson16.test6;

public class Main {
    public static void main(String[] args) {
        Messenger sender = new Messenger();
        ThredMessanger thread1 = new ThredMessanger("Hello", sender);
        thread1.setName("Поток 1");
        ThredMessanger thread2 = new ThredMessanger("Bye", sender);
        thread2.setName("Поток 2");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException ex){
            System.out.println(ex);
        }
    }
}
class Messenger{
    public synchronized void sendMessage(String msg){
        System.out.println(Thread.currentThread().getName() + ", отправка сообщения: " + msg);
        try {
            Thread.sleep(500);
        }catch (InterruptedException ex){
            System.out.println("Поток прерван: " + ex);
        }
        System.out.println(Thread.currentThread().getName() + ", Сообщение отправлено" + msg);
    }
}
class ThredMessanger extends Thread{
    private String msg;
    Messenger sender;

    public ThredMessanger(String msg, Messenger sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender) {
            this.sender.sendMessage(this.msg);
        }
    }
}