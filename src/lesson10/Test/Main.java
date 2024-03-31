package lesson10.Test;

public class Main {
    public static void main(String[] args) {
        int x = 5, y = 3;
        Calc sum = new Calc();
        sum.calculate(x, y);
        Calc mul = new Calc() {
            @Override
            public void calculate(int a, int b) {
            a = 25;
                    System.out.println(a * b);
                }

            }

            ;
        mul.calculate(x,y);
        }
    }

    class Calc {
        public void calculate(int a, int b) {
            System.out.println(a + b);

        }
    }

    class CaicElse extends Calc {
        @Override
        public void calculate(int a, int b) {
            System.out.println(a * b);
        }
    }