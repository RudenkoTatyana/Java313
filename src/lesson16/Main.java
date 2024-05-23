package lesson16;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            try {
                Thread.sleep(500);
            }catch (InterruptedException ex){
                System.out.println(ex);
            }
            System.out.println("Цикл 1, итерация: " + i);
        }
        for (int i = 1; i <= 5 ; i++) {
            try {
                Thread.sleep(500);
            }catch (InterruptedException ex){
                System.out.println(ex);
            }
            System.out.println("Цикл 2, итерация: " + i);
        }
    }
}
