package lesson8.enamps;

public class Sample {
    public enum Lenght{
        KM("Километр", 1000), M("Метр", 1), DM("Дециметр", 0.1), CM("Сантиметр", 0.01), MM("Миллиметр", 0.001);
        String name;
        double d;

        Lenght(String name, double d) {
            this.name = name;
            this.d = d;
        }

        @Override
        public String toString() {
            return name;
        }

        double coefficient(Lenght inp){
            return this.d / inp.d;
        }
    }
    public static void main(String[] args) {
for(Lenght l1: Lenght.values()) {
    for (Lenght l2 : Lenght.values()) {
        if (l1 != l2){
        System.out.println("1 " + l1 + " = " + l1.coefficient(l2) + " " +l2);
    }
        System.out.println();
    }

}
    }
}
