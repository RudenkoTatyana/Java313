package HomeWork1603;

public class Main {
    public static void main(String[] args) {
       String a = "Собака";
       String b = "Кот";
        System.out.println("Первое слово: " + a);
        System.out.println("Второе слово: " + b);
       WordInterface result = new WordInterface() {
           @Override
           public String words(String a, String b) {
               String res;
               if (a.length() > b.length()){
                   res = b;
               } else {
                   res = a;
               } return res;
           }
       };
        System.out.println("Самое короткое слово: " + result.words(a, b));

    }
    interface WordInterface{
        String words(String a, String b);
    }
}

