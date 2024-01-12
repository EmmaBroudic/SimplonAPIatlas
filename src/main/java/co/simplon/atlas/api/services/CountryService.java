
package co.simplon.atlas.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.Country;
import co.simplon.atlas.api.dto.CreateCountry;


@Service
public class CountryService {

    public UUID create(CreateCountry inputs) {
    	Country country = new Country();
    	country.setIsoCodeTwo(inputs.getIsoCodeTwo());
    	country.setIsoCodeThree(inputs.getIsoCodeThree());
    	country.setName(inputs.getName());
    	country.setArea(inputs.getArea());
    	country.setPopulation(inputs.getPopulation());
    	country.setLanguage(inputs.getLanguage());
    	Database.addCountry(country);
        return country.getId();
    }

    public Country getByID( UUID countryID) {
        return Database.getCountryByID(countryID);
    }
    
    public void update(UUID countryID, CreateCountry inputs) {
    	Country country = Database.getCountryByID(countryID);
        String isoCodeTwo = inputs.getIsoCodeTwo();
        String isoCodeThree = inputs.getIsoCodeThree();
        String name = inputs.getName();
        int population = inputs.getPopulation();
        int area = inputs.getArea();
        String language = inputs.getLanguage();
        country.setIsoCodeTwo(isoCodeTwo);
        country.setIsoCodeThree(isoCodeThree);
        country.setName(name);
        country.setArea(area);
        country.setPopulation(population);
        country.setLanguage(language);
        Database.updateCountry(country);
    }
        
    public void updatePartially(UUID countryID, CreateCountry inputs) {
    	Country country = Database.getCountryByID(countryID);
        int area = inputs.getArea();
        int population = inputs.getPopulation();
        String officialLanguage = inputs.getLanguage();
        country.setArea(area);
        country.setPopulation(population);
        country.setLanguage(officialLanguage);
        Database.updateCountry(country);
    }

    public void deleteByID(UUID countryID) {
    	Database.deleteCountry(countryID);
    	System.out.println("Country deleted");
    }
}

