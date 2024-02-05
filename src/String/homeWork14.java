package String;

public class homeWork14 {
    public static void main(String[] args) {
        String a = "Java";
        System.out.println("Исходная строка - \"" + a + "\"");
        System.out.println("Измененная строка - \"" + a.replace("a", "a!") + "\"");

        String b = "Java";
        System.out.println("Исходная строка - \"" + b + "\"");
        StringBuilder c = new StringBuilder(b.replace("a", "a!"));
        System.out.println("Измененная строка - \"" + c + "\"");



    }
}
