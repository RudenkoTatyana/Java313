package lesson10;

public class Main {
    public static void main(String[] args) {
//Convert<String, Integer> converter = (from) -> Integer.valueOf(from);
//Convert<String, Integer> converter = Integer::valueOf;
//Integer converted = converter.convert("123");
//        System.out.println(converted);
//HumanFactory<Human> humanFactory = Human::new;
//        Human human = humanFactory.create("Olga", "Pavlova");
//        System.out.println(human);
Operation func = action(1);
int a = func.execute(6, 5);
        System.out.println(a);
        int b = action(2).execute(6, 5);
        System.out.println(b);
        int c = action(3).execute(6, 5);
        System.out.println(c);

    }

private static Operation action(int number){
        switch (number){
            case 1: return (x, y) -> x+y;
            case 2: return (x, y) -> x-y;
            case 3: return (x, y) -> x*y;
            default: return (x, y) -> 0;
        }
}
}
@FunctionalInterface
interface Operation{
    int execute(int x, int y);
}
//interface HumanFactory <P extends Human>{
//    P create(String firstName, String lastName);
//}
//class Human {
//    String firstName;
//    String lastName;
//
//    public Human(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    @Override
//    public String toString() {
//        return "Human(firstName = "+ firstName + ", lastName = " + lastName + ")";
//    }
//}
//interface Convert<F, T>{
//    T convert(F from);
//
//}
