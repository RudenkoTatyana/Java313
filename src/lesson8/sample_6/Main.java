package lesson8.sample_6;

public class Main {
    public static void main(String[] args) {
       Digit d1 = new Digit(10);
       Digit d2 = new Digit(10.7);
       Digit d3 = new Digit(10.7f);
        System.out.println(d1.value + " " + d2.value + " " + d3.value);
    }
}

class Digit{
    public double value;

    public <T extends Number> Digit(T value){
        this.value = value.doubleValue();
    }
}
