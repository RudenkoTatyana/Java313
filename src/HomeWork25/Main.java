package HomeWork25;

public class Main {
    public static void main(String[] args) {
        System.out.println("Скорости транспортных средств: ");
        Transport transport = Transport.CAR;
        System.out.println(transport.TransportSpeed());
        Transport transport1 = Transport.TRUCK;
        System.out.println(transport1.TransportSpeed());
        Transport transport2 = Transport.AIRPLANE;
        System.out.println(transport2.TransportSpeed());
        Transport transport3 = Transport.TRAIN;
        System.out.println(transport3.TransportSpeed());
        Transport transport4 = Transport.BOAT;
        System.out.println(transport4.TransportSpeed());
    }
}
enum Transport{
    CAR( 65),
    TRUCK (55),
    AIRPLANE( 600),
    TRAIN(70),
    BOAT( 22);

private int speed;
Transport( int speed){
    this.speed = speed;
}
public String TransportSpeed(){
    return  " типичная скорость составляет " + this.speed + " миль в час.";
}

}
