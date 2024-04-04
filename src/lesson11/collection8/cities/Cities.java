package lesson11.collection8.cities;

public class Cities {
    public static void main(String[] args) {
        SetCity cities = new SetCity();
        cities.addCity("Москва", 495);
        cities.addCity("Санкт-Петербург", 812);
        cities.addCity("Омск", 183);
        cities.addCity("Томск", 712);
        cities.addCity("Пенза", 312);
        cities.addCity("Новосибирск", 955);
        cities.addCity("Новгород", 554);
        System.out.println("Количество городов: " + cities.size()+ "\n");
        System.out.println(cities);
        System.out.println("#########################################");
        System.out.println("Удаляем города с кол-вом больше 5: ");
        cities.removeCityFilter(0, 5);
        System.out.println(cities);
        System.out.println("Печать городов в порядке убывания: ");
        cities.printReverseSort();
    }
}
