package HomeWork1008;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3 ; i++) {
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        System.out.println(ex);
                    }
                    System.out.println("RED");
                    try {
                        Thread.sleep(700);
                    } catch(InterruptedException ex){
                        System.out.println(ex);
                    }
                    System.out.println("YELLOW");
                    try {
                        Thread.sleep(500);
                    }catch(InterruptedException ex){
                        System.out.println(ex);
                    }
                    System.out.println("GREEN");
                }
            }
        });
        thread1.start();
    }
}