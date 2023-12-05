package co.simplon.atlas.api.entities;
import java.util.UUID;

public class Country {
    private UUID id;
    private String isoCodeTwo;
    private String isoCodeThree;
    private String name;
    private int population;
    private int area;
    private String language;

    public Country() {
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID countryID) {
        this.id = UUID.randomUUID();
    }

    public String getIsoCodeTwo() {
    	return this.isoCodeTwo;
    }

    public void setIsoCodeTwo(String isoCodeTwo) {
    	this.isoCodeTwo = isoCodeTwo;
    }

    public String getIsoCodeThree() {
    	return this.isoCodeThree;
    }

    public void setIsoCodeThree(String isoCodeThree) {
    	this.isoCodeThree = isoCodeThree;
    }

    public String getName() {
    	return this.name;
    }

    public void setName(String countryName) {
    	this.name = countryName;
    }

    public int getPopulation() {
    	return this.population;
    }

    public void setPopulation(int countryPopulation) {
    	this.population = countryPopulation;
    }

    public int getArea() {
    	return this.area;
    }

    public void setArea(int countryArea) {
    	this.area = countryArea;
    }

    public String getLanguage() {
    	return this.language;
    }

    public void setLanguage(String countryLanguage) {
    	this.language = countryLanguage;
    }
}