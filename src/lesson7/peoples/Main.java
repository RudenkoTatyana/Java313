package lesson7.peoples;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Батодалаев", "Даши", 16, "ГК", "Web_011", 5);
        student1.info();
        Student student2 = new Student("Загидуллин", "Линар", 15, "РПО", "PD_011", 5);
        student2.info();
        Graduate student3 = new Graduate("Шугани", "Сергей", 15, "РПО", "PD_011", 5, "Защита персональных данных");
        student3.info();
        Teather student4 = new Teather("Даньшин", "Андрей", 38, "Астрофизика", 110);
        student4.info();
        Teather student5 = new Teather("Башкиров", "Алексей", 45, "Разработка приложений", 20);
        student5.info();

    }
}
