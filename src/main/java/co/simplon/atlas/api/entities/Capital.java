package co.simplon.atlas.api.entities;
import java.util.UUID;

public class Capital {
	private UUID id;
    private String name;
    private int population;
    private int area;

    public Capital() {
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID capitalID) {
        this.id = UUID.randomUUID();
    }

    public String getName() {
    	return this.name;
    }

    public void setCapitaltName(String capitalName) {
    	this.name = capitalName;
    }

    public int getPopulation() {
    	return this.population;
    }

    public void setPopulation(int capitalPopulation) {
    	this.population = capitalPopulation;
    }

    public int getArea() {
    	return this.area;
    }

    public void setArea(int capitalArea) {
    	this.area = capitalArea;
    }
}