package co.simplon.atlas.api.entities;
import java.util.UUID;

public class Continent {
	private UUID id;
    private String name;
    private int area;

    public Continent() {
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID continentID) {
        this.id = UUID.randomUUID();
    }

    public String getName() {
    	return this.name;
    }

    public void setName(String continentName) {
    	this.name = continentName;
    }

    public int getArea() {
    	return this.area;
    }

    public void setArea(int continentArea) {
    	this.area = continentArea;
    }
}
