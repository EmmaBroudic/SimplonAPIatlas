package co.simplon.atlas.api.services;

import org.springframework.stereotype.Service;
import co.simplon.atlas.api.dto.CreateContinent;
import co.simplon.atlas.api.entities.Continent;
import co.simplon.atlas.api.database.Database;

import java.util.UUID;

@Service
public class ContinentService {
    
    public UUID create(CreateContinent inputs) {
    	Continent continent = new Continent();
    	continent.setName(inputs.getName());
    	continent.setArea(inputs.getArea());
    	continent.setPopulation(inputs.getPopulation());
    	Database.addContinent(continent);
    	return continent.getId();
    }
    
    public Continent getById(UUID id) {
    	return Database.getContinentByID(id);
    }
    
    public void update(UUID continentID, CreateContinent inputs) {
        Continent continent = Database.getContinentByID(continentID);
        String name = inputs.getName();
        int population = inputs.getPopulation();
        int area = inputs.getArea();
        continent.setName(name);
        continent.setArea(area);
        continent.setPopulation(population);
        Database.updateContinent(continent);
    }
    
    public void updatePartially(UUID continentID, CreateContinent inputs) {
    	Continent continent = Database.getContinentByID(continentID);
    	int area = inputs.getArea();
    	continent.setArea(area);
    	Database.updateContinent(continent);
    }
    
    public void delete(UUID id) {
    	Database.deleteContinent(id);
    }
}
