package number;

public class Source {
    public static void main(String[] args) {
        Outer out = new Outer("внешний");
        System.out.println(out.name);
        System.out.println(Outer.Inner.age);
        Outer.Inner.info();
        System.out.println(out.inner.innername);
        out.inner.func();
    }
}
class Outer {
    String name;
    Inner inner;

    public Outer(String name) {
        this.name = name;
        inner = new Inner("внутренний");
    }

    class Inner {
        static int age;
        String innername;

        static {
            age = 18;
        }

        public Inner(String innername) {
            this.innername = innername;
        }

        public static void info() {
            System.out.println("Статический метод");
        }

        public void func() {
            System.out.println("Метод во вложенном классе");
        }


    }
}