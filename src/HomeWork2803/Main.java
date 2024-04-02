package HomeWork2803;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
Colors cl1 = new Colors("Красный");
Colors cl2 = new Colors("Оранжевый");
Colors cl3 = new Colors("Желтый");
Colors cl4 = new Colors("Зеленый");
Colors cl5 = new Colors("Голубой");
Colors cl6 = new Colors("Синий");
Colors cl7 = new Colors("Фиолетовый");
        LinkedList<Colors> colorsLinkedList = new LinkedList<>();
        colorsLinkedList.add(cl1);
        colorsLinkedList.add(cl2);
        colorsLinkedList.add(cl3);
        colorsLinkedList.add(cl4);
        colorsLinkedList.add(cl5);
        colorsLinkedList.add(cl6);
        colorsLinkedList.add(cl7);
        System.out.println("Список: " + colorsLinkedList);
        System.out.println();
        ListIterator<Colors> listIterator = colorsLinkedList.listIterator();
        System.out.println("Список итераторов в прямом направлении: ");
        while (listIterator.hasNext()){
            System.out.println("Индекс = " + listIterator.nextIndex() + ", Элемент = " + listIterator.next());
        }
        System.out.println();
        System.out.println("Список итераторов в обратном направлении: ");
        while (listIterator.hasPrevious()){
            System.out.println("Индекс = " + listIterator.previousIndex() + ", Элемент = " + listIterator.previous());
        }

    }
}
class Colors{
    private String color;

    public String getColor() {
        return color;
    }

    public Colors(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
