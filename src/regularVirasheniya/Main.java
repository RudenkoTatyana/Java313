package regularVirasheniya;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
//        String s = "Я ищу совпадения в 2024 году. И я их найду в два счёта.";
//        String pattern = "ищу"; // [...]- один символ из перечисленных [0-9]- диапазон заданных символов
//        // [а-я&&[^к-н]]- вычитание символов, все кроме к-н
        //[а-я&&[к-н]] - пересечение символов => [к-н]
        // [а-д[к-н]]- объединение символов => [а-дк-н]
        // [^...]- все кроме заданных символов
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
////        System.out.println(matcher.find());
//        while (matcher.find()){
////            System.out.println("Шаблон совпадения найден c " + matcher.start() + " до " + matcher.end() + " индекс");
////            System.out.println(s.substring(matcher.start(), matcher.end()));
//            System.out.println(matcher.group());
//        }
//        String str = "абяё";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + ": " + str.codePointAt(i));
//        }
//        try {
//            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15Т01:09";
//            String pattern = "[0-9][0-9]:[0-9][0-9";
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
//            }
//        } catch (PatternSyntaxException pse){
//            System.err.println("Неправильное регулярное выражение" + pse.getMessage());
//            System.err.println("Описание " + pse.getDescription());
//        }

//        String s = "Я ищу совпадения в 2024 году. И я их найду в два счёта. 198765 Ели[-ели]. Hello_World";
//        String s = "Цифры: 7, +14, -42, 0013, 0.3";
//        String pattern = "\\d+";
        // + - от одного повторения до бесконечности
        // * - от 0 повторений до бесконечности
        // ? - от 0 до 1 повторений
        // \\d == [0-9] одна любая цифра \\D-все за исключением цифр
        // \\s == [ ] один пробельный символ
        // \\w == [A-Za-z0-9_] буква символ и подчеркивание
        // \\A - поиск шаблона от начала строки
        // \\Z - поиск шаблона в конце строки
//        String s = "author=Пушкин А. С.; title = Евгений Онегин; price =200; year= 1831";
//        String pattern = "\\w+\\s*=\\s*[^;]+"; // [А-я0-9\s.]
//
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
//        String s = "12 сентября 2024 года";
//        String pattern = "\\d{2}";
//        // {n}- n число повторений
//        // {2, } - от заданного числа до бесконечности
//        // {2,4} - в заданном диапазоне приоритет максимальное значение
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
//        String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 74994564578";
//        String pattern ="\\+?7\\d{10}";
//        String s = "+I learning Java";
//        String pattern ="\\w+\\s\\w+";
//        // ^ - строка должна начинаться с заданной последовательностью
//        // $-строка должна  заканчиваться заданной последовательностью
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t");
//        }

//        String s = "Java_master";
//        String pattern = "[\\w-]{3,16}"; // буквы, цифры, подчеркивание, дефис. Имя пользователя от 3 до 16
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//            System.out.print(matcher.find());

//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите текст с цифрами: ");
//        String s = input.nextLine();
//        String pattern = "\\d #поиск цифр";
//        Pattern regex = Pattern.compile(pattern, Pattern.COMMENTS);
//        Matcher matcher = regex.matcher(s);
//        int count = 0;
//        while (matcher.find()){
//           count++;
//        }
//        System.out.println("Количество цифр в веденном тексте: " + count);

//        String s = "one\ntwo";
//        String pattern = "one$";
//        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t");
//        }
//        String s = "Java, \njava, \nJAVA";
//        String pattern = "(?i)^java";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t");
//        }
//        String s = "123456@i.ru, \n123_456@ru.name.ru, \nlogin@i.ru, \nлогин-1@i.ru, \nlogin.3@i.ru, \nlogin.3-67@i.ru, \n1login@ru.name.ru";
//        String pattern = "[а-я\\w+\\-.]+@[\\w.]+.ru";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t");
//        }
//        String s = "<body>Пример жадного соответствия регулярных выражений</body>";
//        String pattern = "<.+?>";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t");
//        }

//        String s = "Word2016, PS6, AI5";
//        String pattern = "([a-z]+)(\\d*)";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\n");
//        }
//        String s = "abc";
//        String pattern = "(.(.(.)))";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//       matcher.find();
//            System.out.println(matcher.groupCount());
//        for (int i = 0; i <= matcher.groupCount(); i++) {
//            System.out.println(i + ": " + matcher.group(i));
//
//        }
//                String s = "18-10-2024";
//        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
//        String s = "Я ищу совпадения в 2024 году. И я их найду в два счёта. ";
//        String[] arr = s.split("[.2]");
//        for (String temp : arr) {
//            System.out.println(temp);
//        }
//       Pattern p = Pattern.compile(",\\s");
//        String s = "Я ищу совпадения в 2024 году. И я их найду в два счёта. ";
//        String[] arr = p.split("Суворова Виктория, Россия, Сочи, +7 999 255-05-38");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        String s = "05-03-1987 // Дата рождения";
//        String s2 = s.replaceAll("\\s*//.*", "");
//        System.out.println("Дата рождения: " + s2);

//        //Побитовые операторы
//        //Побитовое и
//        System.out.println(0b111 & 0b000);
//        System.out.println(0b111 & 0b001);
//        System.out.println(0b111 & 0b010);
//
//        System.out.println(7 & 0);
//        System.out.println(7 & 1);
//        System.out.println(7 & 2);
//
//        //Побитовое или
//        System.out.println(0b101 | 0b010);
//        System.out.println(0b011 | 0b100);
//        System.out.println(0b010 | 0b100);
//
//        // Исключающее побитовое или
//        System.out.println(0b110 ^ 0b101);
//        System.out.println(0b101 ^ 0b010);
//        System.out.println(0b100 ^ 0b111);
//
//        //Побитовое не
//        System.out.println(~0b0);
//        System.out.println(~0b1);
//        System.out.println(~0);
//        System.out.println(~1);
//        System.out.println(0b11111111111111111111111111111110);


//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = input.nextInt();
//        if ((number & 1) == 0){
//            System.out.println(number + " - четное число");
//        }
//        if ((number & 1) == 1){
//            System.out.println(number + " - нечетное число");
//        }
//        int x = 1;
//        double y = 3.1515d;
//        x = x + (int)y;
//        System.out.println(x);

//        int x = 5, y = 7;
////        System.out.println("x = " + x + ", y = " + y);
////        x = x ^ y;
////        y = x ^ y;
////        x = x ^ y;
////        System.out.println("x = " + x + ", y = " + y);
//        y ^= (x ^= y);
//        x ^= y;
//        System.out.println("x = " + x + ", y = " + y);
//
//        System.out.println(0b101 >> 1);
//        System.out.println(5 >> 2);
//        System.out.println("Проверка изменений");

        System.out.println(0b101 >> 1);
//        System.out.println(Integer.toBinaryString(5 >> 1));
//        System.out.println(Integer.toBinaryString(0b101 >> 1));
        printBinaryString(5 >> 1);

    }
    public static void printBinaryString (int hexNumber){
        String bits = Integer.toBinaryString(hexNumber);
        String allBits = "00000000000000000000000000000000".substring(0,32 - bits.length()) + bits;
        System.out.printf("%11d : %s%n", hexNumber, allBits);
    }
}
