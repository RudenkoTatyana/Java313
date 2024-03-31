package lesson10.sample;

public class Programm {
    //    static int x = 10;
//    static int y = 20;
    public static void main(String[] args) {
//        Calc operation = () ->{
//            x = 30;
//        return x + y;
//    };
//        System.out.println(x);
//        System.out.println(operation.calculate());
//    }
//Calc operation = (x, y) ->{
//  if(y == 0){
//      return 0;
//  } else {
//      return x / y;
//  }
//};
//        System.out.println(operation.calculate(20, 10));
//        System.out.println(operation.calculate(20, 0));
//    }

Calc<Integer> operation1 = (x, y) -> x + y;
Calc<String> operation2 = (x, y) -> x + y;
        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate("20", "10"));
    }
}
//interface Calc{
//    int calculate();
//}
//interface Calc{
//    int calculate(int x, int y);
//}
interface Calc<T>{
    T calculate(T x, T y);
}

