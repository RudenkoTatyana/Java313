package lesson7.sample;

public class Base {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.print("Зарплата менеджера: ");
        printSalery(obj1);
        Secretary obj2 = new Secretary();
        System.out.print("Зарплата секретаря: ");
        printSalery(obj2);
    }

    static void printSalery(Employee e){
        System.out.println(e.salery());
    }
}
class Employee{
    public static int base = 10000;
    int salery(){
        return base;
    }
}

class Manager extends Employee{
    @Override
    int salery(){
        return base + 20000;
    }
}
class Secretary extends Employee {
    @Override
    int salery(){
        return base + 10000;
    }
}