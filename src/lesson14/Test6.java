package lesson14;

import java.io.*;
import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Persons> people = new ArrayList<>();
        people.add(new Persons("Алексей", 37, 1.87, true));
        people.add(new Persons("Михаил", 30, 1.75, false));
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))){
//            Persons p = new Persons("Алексей", 37, 1.87, true);
            oos.writeObject(people);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        ArrayList<Persons> newPeople = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){
            newPeople = (ArrayList<Persons>) ois.readObject();
//            System.out.printf("Name: %s \t Age: %d%n", p1.getName(), p1.getAge());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        for (Persons p1 : newPeople) {
            System.out.printf("Name: %s \t Age: %d%n", p1.getName(), p1.getAge());
        }
    }
}
class Persons implements Serializable{
    private String name;
    private transient int age;
    private double height;
    private boolean maried;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMaried() {
        return maried;
    }

    public Persons(String name, int age, double height, boolean maried) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.maried = maried;
    }
}