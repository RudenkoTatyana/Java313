package lesson11.collection8.cities;

public class City implements Comparable<City>{
    private String name;
    private int codeCity;

    public City(String name, int codeCity) {
        this.name = name;
        this.codeCity = codeCity;
    }

    public String getName() {
        return name;
    }

    public int getCodeCity() {
        return codeCity;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "; code: " + this.codeCity + ";";
    }

    @Override
    public int compareTo(City o) {
        return o != null ? name.compareTo(o.name) : 0;
    }
}
