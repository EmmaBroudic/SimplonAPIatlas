package co.simplon.atlas.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.Capital;


@Service
public class CapitalService {

    public UUID create(Capital capital) {
        return Database.addCapital(capital);
    }
    
    public Capital getByID( UUID capitalID) {
        return Database.getCapitalByID(capitalID);
    }
    
    public void update(UUID capitalID, Capital updatedCapital) {
    	Capital capital = Database.getCapitalByID(capitalID);
    	String name = updatedCapital.getName();
    	int population = updatedCapital.getPopulation();
    	int area = updatedCapital.getArea();
    	capital.setName(name);
    	capital.setArea(area);
    	capital.setPopulation(population);
    	Database.updateCapital(capital);
    }
    
    public void updatePartially(UUID capitalID, Capital updatedCapital) {
    	Capital capital = Database.getCapitalByID(capitalID);
    	int area = updatedCapital.getArea();
    	int population = updatedCapital.getPopulation();
    	capital.setArea(area);
    	capital.setPopulation(population);
    	Database.updateCapital(capital);
    }
    
    public void deleteByID(UUID capitalID) {
    	Database.deleteCapital(capitalID);
    	System.out.println("Capital deleted");
    }
}
