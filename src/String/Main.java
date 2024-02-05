package String;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Work";
//        String  message = str1 + " " + str2;
//        System.out.println(message);
//        char[] helloArray = {'П', 'р', 'и', 'в', 'е', 'т'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);
//        String str = "Hello";
//        int a = 5;
//        String newStr = str + a;
//        System.out.println(newStr);
//        int b = 3;
//        String st = b + "";
//        System.out.println(st);
//        String str = "2";
//        int a = Integer.parseInt(str);
//        System.out.println(a);
//
//        String name = "Hello";
//        int count = name.length();
//        System.out.println(count);

//        String name = "Никита";
//        String name2 = name.toLowerCase(); // преобразование строки в нижний регистр
//        System.out.println(name2);
//        String name3 = name.toUpperCase(); // преобразование строки в верхний регистр
//        System.out.println(name3);
//        char res = name.charAt(2); // возвращает символ по указанному индексу строки
//        System.out.println(res);

//        String text = "Частотный словарь букв русского алфавита. Создадим массив нужной длины, " +
//                "и будем хранить в соответствующих позициях количество вхождений символов.";
//        System.out.println(text);
//        text = text.toLowerCase();
//        int[] result = new int['я' - 'а' + 1];
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//            if (ch >= 'а' && ch <= 'я'){
//                result[ch - 'а']++;
//            }
//
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i+ 'а') + "=" + result[i]);
//
//        }

//        String s1 = "";
////        if (s1.length() == 0){
////            System.out.println("Пустая строка");
////        }
//        if (s1.isEmpty()){
//            System.out.println("Пустая строка");
//        }
//        String str = "ABC";
//        char[] res = str.toCharArray(); // Преобразование строки в массив символов
//        for (int i = 0; i < res.length; i++) {
//            System.out.println("Элемент [" + i + "]:" + res[i]);
//        }
//
        Scanner input = new Scanner(System.in);
//        System.out.print("Введите адрес сайта: ");
//        String path = input.nextLine();
//        char[] chars = path.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '/'){
//                chars[i] = '\\';
//            }
//        }
//        String res = new String(chars);
//        System.out.println(res);


//        String str = "Я изучаю JAVA";
//        System.out.println(str.indexOf('A'));// Ищет первое совпадение символа или строки
//        System.out.println("  Hello World".trim()); // Удаляет пробелы в начале и в конце строки
//        String str = "Я изучаю JAVA";
////        System.out.println(str.substring(2)); // Получение подстроки из строки
//        String[] words = str.split(" ");
//        for (String world: words) {
//            System.out.println(world);
//        }


//        System.out.print("Введите ФИО: ");
//        String name = input.nextLine();
//     String[] res = name.split(" ");
//        System.out.println(res[0] + " " + res[1].charAt(0) + "." + res[2].charAt(0) + ".");
//
//        String res = String.join(":", "00", "23", "30");
//        System.out.println(res);
//        String[] text = new String[]{"Hello", "World"};
//        String str = String.join(" ", text);
//        System.out.println(str);

//        String text = "Я изучаю С++. Мне нравится С++.";
//        System.out.println(text);
//        String[] array = text.split("С\\+\\+");
//        String res = String.join("Java", array);
//        System.out.println(res);

//        String text1 = text.replace("С++", "Java");
//        System.out.println(text1);


//        String s1 = "Hello";
//        String s2 = "Hello1";
//        String s3 = "HELLO";
//        System.out.println(s1.equals(s2)); // Сравнение строк
//        System.out.println(s1.equals(s3)); // Сравнение строк
//        System.out.println(s1.equalsIgnoreCase(s3)); // Сравнение строк без привязки к регистру

//        System.out.println("I learning Java".endsWith("Java")); // на что заканчивается строка
//        System.out.println("I learning Java".startsWith("I")); // на что начинается строка
//        System.out.println("I learning Java".contains("a")); // содержит ли строка заданную подстроку

//        System.out.print("Введите название документа: ");
//        String path = input.nextLine();
//        if (path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png")){
//            System.out.println("Изображение");
//        } else if (path.endsWith(".docx") || path.endsWith(".doc")){
//            System.out.println("Это документ Word");
//        } else {
//            System.out.println("Неизвестный формат");
//        }
//        String s = "I learning Java";
//        int n;
//        n = s.codePointAt(0); // код символа по его индексу в строке
//        System.out.println(n);
//        n = s.codePointBefore(1); // код предыдушего символа
//        System.out.println(n);
//
//        String s;
//        double d = 3.8567;
//        s = String.valueOf(d); // преобразование в строку
//        System.out.println(s);
//
//        String str = "1";
//        System.out.println("1 > 2 : " + str.compareTo("2"));
//        str = "2";
//        System.out.println("2 > 1 : " + str.compareTo("1"));
//
//        System.out.println("2 == 2 : " + str.compareTo("2"));
//        StringBuilder sb = new StringBuilder();
//        sb.append('a');
//        sb.append(" ");
//        sb.append("Hello").append(" ").append("World");
//        System.out.println(sb);
//        sb.insert(5, "!");
//        System.out.println(sb);
//        sb.delete(4, 6);
//        System.out.println(sb);
//        sb.replace(3, 6, "jav");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(sb.indexOf("l"));
//
//        StringBuilder sb1 = createStr(5, 3);
//        modifyStr(sb1, "=", " равно ");
//        modifyStr(sb1, "+", " плюс ");
//        modifyStr(sb1, "-", " минус ");
//        modifyStr(sb1, "*", " умножить ");
//        System.out.println(sb1);
//
//        StringBuilder modStr = getStringBuilder();
//        System.out.println("Измененная строка: \"" + modStr + "\"");

    }
//    public static StringBuilder getStringBuilder(){
//        System.out.print("Исходная строка: \"");
//        String str = "Текст с повторяющимися символами ";
//        System.out.println(str + "\"");
//        StringBuilder modify = new StringBuilder(str.replace(" ", ""));
//        for (int i = 0; i < modify.length(); i++) {
//            for (int j = modify.length()-1; j > i ; j--) {
//         if (modify.charAt(i) == modify.charAt(j)){
//          modify.deleteCharAt(j);
//         }
//            }
//        }
//        return modify;
//    }
//    public static StringBuilder createStr(int a, int b){
//        StringBuilder res = new StringBuilder();
//        res.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
//        res.append(a).append(" - ").append(b).append(" = ").append(a-b).append("\n");
//        res.append(a).append(" * ").append(b).append(" = ").append(a*b).append("\n");
//        return res;
//    }
//    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr){
//        int pos;
//        while ((pos = stBuild.indexOf(oldStr)) != -1){
//            stBuild.deleteCharAt(pos);
//            stBuild.replace(pos, pos + 1, newStr);
//        }
//        return stBuild;
//
//    }
}
