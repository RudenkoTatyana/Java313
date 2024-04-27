package lesson14;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test4 {
    public static void main(String[] args) {
        String text = "Привет мир!";
        try(FileOutputStream fos = new FileOutputStream("notes3.txt"); PrintStream printStream = new PrintStream(fos)){
           printStream.println();
            System.out.println("Запись в файл была произведена");
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
