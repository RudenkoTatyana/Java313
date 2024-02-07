package getHub;

public class Program {
    public static void main(String[] args) {
//Person p1 = new Person();
//p1.displayInfo();
//p1.name = "Виктор";
//p1.age = 28;
//p1.displayInfo();
//Person p2 = new Person("Игорь");
//p2.displayInfo();
        Person p3 = new Person("Валинтин", 23);
        p3.setName("Николай");
        p3.getName();
        p3.setAge(26);
        p3.getAge();
        p3.displayInfo();
    }
}
class Person {
   private String name;
   private int age;

   public String getName(){
       return name;
   }
   public void  setName(String name){
       this.name = name;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age = age;
   }
    // Инициализаторы

    public Person(){              // Конструкторы
        this.name = "неизвестно";
        this.age = 18;
    }
    public Person(String n){
        this.name = n;
    }
    public Person(String n, int a){
//        this.name = n;
//        this.age = a;
        setName(name);
        setAge(age);
    }

    void displayInfo(){
        System.out.printf("Name: %s%nAge: %d%n", this.name, this.age);
    }
}