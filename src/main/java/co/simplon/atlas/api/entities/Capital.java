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

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
    	return this.name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public int getPopulation() {
    	return this.population;
    }

    public void setPopulation(int population) {
    	this.population = population;
    }

    public int getArea() {
    	return this.area;
    }

    public void setArea(int area) {
    	this.area = area;
    }
}