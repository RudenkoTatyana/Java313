package getHub.Person_data;

public class Main {
    public static void main(String[] args) {
    Human h1 = new Human("Юля", "23.05.1986", "45-46-98", "Россия", "Москва", "Чистопрудный бульвар, 1А");
        h1.printInfo();
        h1.setName("Юлия");
        h1.setBirthday("26.05.1986");
        System.out.println(h1.getName());
        h1.printInfo();
//        Human h2 = new Human("Юрий", "56-78-19");
//        h2.setData("24.12.1999", "Россия");
//        h2.printInfo();

    }
}
