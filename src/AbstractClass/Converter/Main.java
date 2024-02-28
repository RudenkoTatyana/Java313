package AbstractClass.Converter;

public class Main {
    public static void main(String[] args) {
Converter converter[] = new Converter[3];
converter[0] = new CelsiusConverter();
converter[1] = new KelvinConverter();
converter[2] = new FahrenheitConrter();
        for (int i = 0; i < converter.length; i++) {
            System.out.printf("t = %.1f%n", converter[i].getConvertedValue(21.5));
        }
    }
}
interface Converter{
    double getConvertedValue(double baseValue);
}
class CelsiusConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}
class KelvinConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}
class FahrenheitConrter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue * 1.8 + 32;
    }
}
