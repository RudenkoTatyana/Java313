package lesson8;

public class Main {
    public static void main(String[] args) {
        System.out.println(Seasons.WINTER);
        System.out.println(Seasons.SUMMER);
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.AUTUMN);
        System.out.println();
        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }
        Seasons arg = Seasons.SPRING;
        switch (arg){
            case WINTER:
                System.out.println("Сейчас зима!"); break;
            case SPRING:
                System.out.println("Сейчас весна!"); break;
            case SUMMER:
                System.out.println("Сейчас лето!"); break;
            case AUTUMN:
                System.out.println("Сейчас осень!"); break;
        }
    }
}
enum Seasons{
    WINTER,
    SUMMER,
    SPRING,
    AUTUMN;
}
