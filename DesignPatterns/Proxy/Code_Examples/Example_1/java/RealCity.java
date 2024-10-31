public class RealCity implements City {
    private String name;
    private String country;
    private int population;
    private String weather;

    public RealCity(String name, String country, int population, String weather) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return "USA";
    }

    public int getPopulation() {
        return 1000000;
    }

    public String getWeather() {
        return "Sunny";
    }
}
