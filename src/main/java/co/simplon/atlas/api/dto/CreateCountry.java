package co.simplon.atlas.api.dto;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.validation.constraints.Min;

public class CreateCountry {

    private String isoCodeTwo;
    private String isoCodeThree;
    private String name;
    private int population;
    private int area;
    private String language;
	
	public CreateCountry() {
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

    public String getLanguage() {
    	return this.language;
    }

    public void setLanguage(String language) {
    	this.language = language;
    }
}
