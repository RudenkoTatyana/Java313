package lesson10.Test;

public class Program {
    public static void main(String[] args) {
        int x = 5, y = 3;
//        CalcInterface sum = new CalcInterface() {
//            public void calculate(int a, int b) {
//                System.out.println(a + b);
//            }
//        };
//        sum.calculate(x, y);
//    }

             CalcInterface sum = (a,b)-> a + b;
             CalcInterface sub = (a,b)-> a - b;
             CalcInterface mul = (a,b)-> a * b;
        int res = sum.calculate(x, y);
        int res1 = sub.calculate(x, y);
        int res2 = mul.calculate(x, y);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
}
    interface CalcInterface {
        int calculate(int a, int b);
    }
}

//class Calc1 implements CalcInterface{
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}

