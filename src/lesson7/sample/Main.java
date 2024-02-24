package lesson7.sample;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.voice();
        animal2.voice();


    }
}
class Animal{
    public void voice(){
        System.out.println("Голос");
    }
}
class Cat extends Animal{
    @Override
    public void voice(){
        System.out.println("Мяу");
    }
}
class Dog extends Animal{
    @Override
    public void voice(){
        System.out.println("Гав");
    }
}
