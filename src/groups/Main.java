package groups;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Student student[] = new Student[n];
        student[0] = new Student("Петров", "А.В.", 1);
        student[1] = new Student("Петров", "Р.С.", 1);
        student[2] = new Student("Иванов", "А.В.", 1);
        student[3] = new Student("Вербова", "А.В.", 2);
        student[4] = new Student("Долгих", "А.В.", 2);
        student[5] = new Student("Шишкин", "А.В.", 3);
        student[6] = new Student("Репкин", "А.В.", 3);
        student[7] = new Student("Матрешкина", "А.В.", 3);
        student[8] = new Student("Волков", "А.В.", 3);
        student[9] = new Student("Колганов", "А.В.", 3);

        Random rd = new Random();
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student.length; j++) {
                student[i].addGrade(rd.nextInt(12) + 1);
            }
        }

        System.out.println("Все студенты: ");
        for (int i = 0; i < student.length; i++) {
            student[i].print();
        }

        System.out.println("\nСтуденты с хорошей успеваемостью: ");
        for (int i = 0; i < student.length; i++) {
            if(student[i].isGood()){
                student[i].print();
            }
        }

    }
}
