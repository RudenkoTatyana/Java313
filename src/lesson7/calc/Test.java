package lesson7.calc;

public class Test {
    public static void main(String[] args) {
        int a = 20, b = 10;
        MyCalculator calc = new MyCalculator();
calc.multiplication(a,b);
calc.addition(a,b);
calc.subtraction(a,b);
        System.out.println(calc.z);
    }
}
