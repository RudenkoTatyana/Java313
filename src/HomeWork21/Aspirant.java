package HomeWork21;

public class Aspirant extends Student{
    private String topic;

    public Aspirant() {
        this.topic = topic;
    }

    public void info(String name, String group, String topic, int grade) {
        super.info(name, group, grade);
        double grants;
        if (grade < 5){
            grants = 1800;
        } else {
            grants = 2000;
        }
        System.out.println(name + " группа " + group + ", тема работы: " + topic + " , сумма стипендии: " + grants);
    }
}
