package co.simplon.atlas.api.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

public class CreateContinent {

	@NotNull
	@Size(min=0, max=100)
    private String name;
	@Min(value=1)
    private int area;
	private int population;
	
	public CreateContinent() {
	}

    public String getName() {
    	return this.name;
    }

    public void setName(String name) {
    	this.name = name;
    }
    
    public void setPopulation(int population) {
    	this.population = population;
    }
    
    public int getPopulation() {
    	return this.population;
    }

    public int getArea() {
    	return this.area;
    }

    public void setArea(int area) {
    	this.area = area;
    }
}
