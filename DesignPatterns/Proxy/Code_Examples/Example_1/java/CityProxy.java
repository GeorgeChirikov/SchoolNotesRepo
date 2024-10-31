public class CityProxy implements City {
    private String name;
    private String country;
    private int population;
    private String weather;
    private RealCity realCity;

    public CityProxy(String name, String country, int population) {
        this.name = name;
    }

    public String getName() {
        if (realCity == null) {
            realCity = new RealCity(name, country, population, weather);
        }
        return realCity.getName();
    }

    public String getCountry() {
        if (realCity == null) {
            realCity = new RealCity(name, country, population, weather);
        }
        return realCity.getCountry();
    }

    public int getPopulation() {
        if (realCity == null) {
            realCity = new RealCity(name, country, population, weather);
        }
        return realCity.getPopulation();
    }

    public String getWeather() {
        if (realCity == null) {
            realCity = new RealCity(name, country, population, weather);
        }
        return realCity.getWeather();
    }
}
