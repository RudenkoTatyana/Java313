package HomeWork1103;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> primeNumber = num -> {
            if (num <= 1){
                return false;
            }
            for (int i = 2; i*i <= num; i ++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        };
        int n1 = 7;
        boolean res = primeNumber.test(n1);
        System.out.println(res);
        int n2 = 12;
        boolean res2 = primeNumber.test(n2);
        System.out.println(res2);

    }
}
