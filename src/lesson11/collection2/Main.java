package lesson11.collection2;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collections;
import java.util.ListIterator;

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
        System.out.println(studentLinkedList.get(2).toString());
        Student st6 = new Student("Maria", 2);
        Student st7 = new Student("Sergey", 1);
//        studentLinkedList.add(st6);
//        studentLinkedList.add(1, st7);
        studentLinkedList.addFirst(st6);
        studentLinkedList.addLast(st7);
        System.out.println("LinkedList = " + studentLinkedList);
        Student st8 = new Student("Vlad", 3);
        studentLinkedList.set(1, st8);
//        studentLinkedList.remove(3);
//        studentLinkedList.removeFirst();
//        studentLinkedList.removeLast();
        System.out.println("LinkedList = " + studentLinkedList);
//        for (Student student: studentLinkedList) {
//            System.out.println(student);
//        }
//        for (int i = 0; i < studentLinkedList.size(); i++) {
//            System.out.println("Элемент по индексу " + i + ": " + studentLinkedList.get(i));
//        }
        Iterator it = studentLinkedList.listIterator();
//        Iterator it = studentLinkedList.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        ListIterator<Student> listIterator = studentLinkedList.listIterator();
        System.out.println("Итерация прямого направления: ");
        while (listIterator.hasNext()){
            System.out.println("index = " + listIterator.nextIndex() + ", Element = " + listIterator.next());
        }

        System.out.println("Итератор в обратном направлении: ");
        while (listIterator.hasPrevious()){
            System.out.println("index = " + listIterator.previousIndex() + ", Element = " + listIterator.previous());
        }
//        Object first_element = studentLinkedList.getFirst();
//        System.out.println("Первый элемент: " + first_element);
//        studentLinkedList.clear();
//        System.out.println(studentLinkedList);
//        System.out.println("Пустой ли список? " + studentLinkedList.isEmpty());
//        Collections.swap(studentLinkedList, 0, 2);
//        System.out.println(studentLinkedList);

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
