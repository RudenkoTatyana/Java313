package HomeWork19;

public class Auto {
    private String model;
    private int year;
    private String manufacturer;
    private String power;
    private String color;
    private int price;

    public Auto(String model, int year, String manufacturer, String power, String color, int price) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.power = power;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void print(){
        System.out.printf("Название модели: %s%n", this.model);
        System.out.printf("Год выпуска: %d%n", this.year);
        System.out.printf("Производитель: %s%n", this.manufacturer);
        System.out.printf("Мощность двигателя: %s%n", this.power);
        System.out.printf("Цвет машины: %s%n", this.color);
        System.out.printf("Цена: %d%n", this.price);
    }
}
