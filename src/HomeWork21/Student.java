package HomeWork21;

public class Student {

     private String name;
     private String group;
     private int grade;

    public Student() {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }


    public void info(String name, String group, int grade){
        double grants;
        if (grade < 5){
            grants = 800;
        } else {
            grants = 1000;
        }
        System.out.println(name + " группа " + group + " , сумма стипендии: " + grants);
    }
}
