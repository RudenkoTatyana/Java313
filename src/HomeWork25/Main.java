package HomeWork25;


public class Main {
    public static void main(String[] args) {

        System.out.println("Скорости транспортных средств: ");
        System.out.println(Transport.CAR);
        System.out.println(Transport.TRUCK);
        System.out.println(Transport.AIRPLANE);
        System.out.println(Transport.TRAIN);
        System.out.println(Transport.BOAT);
    }

}
enum Transport{
    CAR("CAR", 65),
    TRUCK("TRUCK", 55),
    AIRPLANE("AIRPLANE", 600),
    TRAIN("TRAIN", 70),
    BOAT("BOAT", 22);
    private String title;
    private int speed;

    Transport(String title, int speed) {
        this.title = title;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return this.title + " типичная скорость составляет " + this.speed + " миль в час.";
    }
}

