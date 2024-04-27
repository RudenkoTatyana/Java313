package lesson14;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        Person per = new Person("Сергей", 35, 1.86, false);
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))){
            dos.writeUTF(per.name);
            dos.writeInt(per.age);
            dos.writeDouble(per.height);
            dos.writeBoolean(per.married);
            System.out.println("Файл был записан");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))){
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.printf("Имя: %s, возраст: %d, рост: %.2f, семейное положение: %b", name, age, height, married);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
class Person{
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }
}
