package lesson7.peoples;

public class Teather extends Human{
    private String lesson;
    private int reating;

    public Teather(String lastName, String firstName, int age, String lesson, int reating) {
        super(lastName, firstName, age);
        this.lesson = lesson;
        this.reating = reating;
    }
    @Override
    public void info(){
        System.out.print( this.lesson + " " + this.reating);
    }
}
