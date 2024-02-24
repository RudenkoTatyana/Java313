package number;
// перегрузка методов
public class Calc {
    public static void main(String[] args) {
        Cslculator obj = new Cslculator();
        //1. по количеству параметров
        obj.calculator(1,2);
        obj.calculator(1,2,3);
        //2. по типам параметров
        obj.calculator(1.3, 4.5);
        //3. по порядку параметров
        obj.calculator(2, 2.5);

    }
}
class Cslculator{
    public void calculator(int a, int b){
        System.out.println("Сумма двух чисел: " + (a + b));
    }
    public void calculator(int a, int b, int c){
        System.out.println("Сумма трех чисел: " + (a + b + c));
    }
    public void calculator(double a, double b){
        System.out.println("Сумма двух вещественных чисел: " + (a + b));
    }

    public void calculator(double a, int b){
        System.out.println("В результате вещественное число: " + (a + b));
    }
}


