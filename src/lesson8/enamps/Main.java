package lesson8.enamps;

public class Main {
    public static void main(String[] args) {
        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }
        int summersIndex = Seasons.SUMMER.ordinal();
        System.out.println(summersIndex);
    }
}
enum Seasons{
    WINTER("Зима"),
    SUMMER("Лето"),
    SPRING("Весна"),
    AUTUMN("Осень");
    private String title;

    Seasons(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Seasons{title='" + this.title + "'}";
    }
}
