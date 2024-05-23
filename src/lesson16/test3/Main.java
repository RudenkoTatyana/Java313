package lesson16.test3;

public class Main {
    public static void main(String[] args) {
     Concarrency thread1 = new Concarrency(1);
     Concarrency thread2 = new Concarrency(2);
     thread1.start();
     thread2.start();
    }
}

class Concarrency implements Runnable {
    private int num;
    private Thread t;


    public Concarrency(int num) {
        this.num = num;
    }
    public void start(){
        if (t == null){
            t = new Thread(this);
            t.start();
        }
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