package springinaction.juggler;

import java.util.List;

public class City {
    private String name;
    private String state;
    private int population;

    private List<String> citiesNames;

    public City() {
    }

    public City(List<String> citiesNames) {
        this.citiesNames = citiesNames;
    }

    public void displayCities(){
        citiesNames.forEach(x-> System.out.println("City: " + x));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
