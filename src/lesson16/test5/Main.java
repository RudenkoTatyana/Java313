package lesson16.test5;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Concarrency());

        Thread thread2 = new Thread(() -> {
            try {
                thread1.join();
            }catch (InterruptedException ex){
                System.out.println("Я не мог дождаться, меня прервали" + ex);
            }
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                System.out.println("Поток 2, итерация: " + i);

            }
        });
        thread1.start();
        thread2.start();



    }
}
class Concarrency implements Runnable {


    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println("Поток 1, итерация: " + i);
        }
    }
}