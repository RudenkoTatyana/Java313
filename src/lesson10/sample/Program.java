package lesson10.sample;

public class Program {
    public static void main(String[] args) {
        String text = "Лямбда выражение";
        System.out.println("Исходная строка: " + text);
        WordCounter wordCounter = (s) -> s.split("\\s+").length;
        int ctr = wordCounter.countWords(text);
        System.out.println("Количество слов: " + ctr);
        text = "Программа, которая подсчитывает количество слов в предложении";
        System.out.println("\nИсходная строка: " + text);
        ctr = wordCounter.countWords(text);
        System.out.println("Количество слов: " + ctr);
    }
}

interface WordCounter{
    int countWords(String tx);
}
