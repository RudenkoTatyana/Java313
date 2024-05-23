package lesson16.test2;

public class Main {
    public static void main(String[] args) {
    Thread thread1 = new Thread(new Concarrency(1));
    Thread thread2 = new Thread(new Concarrency(2));
    thread1.start();
    thread2.start();
    }
}
class Concarrency implements Runnable {
    private int num;

    public Concarrency(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println("Цикл" + num + ", итерация: " + i);
        }
    }
}