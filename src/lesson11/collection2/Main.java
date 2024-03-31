package lesson11.collection2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Viktor", 2);
        Student st2 = new Student("Olga", 4);
        Student st3 = new Student("Ignat", 1);
        Student st4 = new Student("Lera", 3);
        Student st5 = new Student("Anna", 5);
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("LinkedList = " + studentLinkedList);
        System.out.println(studentLinkedList.get(2));
    }
}
class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student('name = " + this.name + ", course = " +this.course + "')";

    }
}
