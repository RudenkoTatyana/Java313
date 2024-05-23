package lesson16.test1;

public class Main {
    public static void main(String[] args) {
        Concarrency thread1 = new Concarrency(1);
        Concarrency thread2 = new Concarrency(2);
        thread1.start();
        thread2.start();

    }
}
class Concarrency extends Thread{
    private int num;

    public Concarrency(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            try {
                Thread.sleep(500);
            }catch (InterruptedException ex){
                System.out.println(ex);
            }
            System.out.println("Цикл" + num + ", итерация: " + i);
        }
    }
}
