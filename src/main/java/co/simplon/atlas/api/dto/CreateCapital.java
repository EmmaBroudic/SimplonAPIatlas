package co.simplon.atlas.api.dto;

import java.util.UUID;
import javax.validation.constraints.NotNull;

public class CreateCapital {
	@NotNull
    private UUID capitalID;
    private String name;
    private int population;
    private int area;
    @Past
    @NotNull
    private LocalDate birthdate;

    public CreateCapital() {
    }

    public CreateCapital(UUID capitalID, String name, int population, int area) {
        this.capitalID = capitalID;
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public UUID getCapitalID() {
        return capitalID;
    }

    public void setCapitalID(UUID capitalID) {
        this.capitalID = capitalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    
}