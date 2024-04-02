package lesson11.collection4;

public class Main {
    public static void main(String[] args) {
            System.out.println("main start");
            method3();
            System.out.println("main eng");

    }
    static  void method1(){
        System.out.println("method_1 start");
        System.out.println("method_1 eng");
    }
    static  void method2(){
        System.out.println("method_2 start");
        method1();
        System.out.println("method_2 eng");
    }
    static  void method3(){
        System.out.println("method_3 start");
        method2();
        System.out.println("method_3 eng");
    }
}
