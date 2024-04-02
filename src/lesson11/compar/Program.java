package lesson11.compar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
University un1 = new University(300, "Университет");
University un2 = new University(150, "Начальная школа");
SortUniversity sortUniversity = new SortUniversity();
int res = sortUniversity.compare(un1, un2);
switch (res){
    case -1: {
        System.out.println(un2.getName() + " больше");
        break;
    }
    case 1: {
        System.out.println(un1.getName() + " больше");
        break;
    }
    default:
        System.out.println("Два учебных заведения одинаковые");
}
SortNameUniversity nameUniversity = new SortNameUniversity();
        ArrayList<University> list = new ArrayList<>();
        list.add(un1);
        list.add(un2);
        Collections.sort(list, nameUniversity);
        for (University name:list) {
            System.out.println(name.getName() + " " + name.getNum_of_students());
        }
    }
}
class University{
    private int num_of_students;
    private String name;

    public University(int num_of_students, String name) {
        this.num_of_students = num_of_students;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum_of_students() {
        return num_of_students;
    }
}
class SortUniversity implements Comparator<University>{
    @Override
    public int compare(University o1, University o2) {
        if (o1.getNum_of_students() == o2.getNum_of_students()){
            return 0;
        } else
            return o1.getNum_of_students() > o2.getNum_of_students() ? 1 : -1;

    }
}
class SortNameUniversity implements Comparator<University>{
    @Override
    public int compare(University o1, University o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
