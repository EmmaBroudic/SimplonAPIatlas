package co.simplon.atlas.api.database;

import co.simplon.atlas.api.entities.Capital;
import co.simplon.atlas.api.entities.Country;
import co.simplon.atlas.api.entities.Continent;

import java.util.HashMap;
import java.util.UUID;

public class Database {
	
    private static HashMap<UUID, Capital> mapCapital = new HashMap<>();
    private static HashMap<UUID, Country> mapCountry = new HashMap<>();
    private static HashMap<UUID, Continent> mapContinent = new HashMap<>();

    public static void addCapital(Capital capital) {
        UUID newCapitalID = UUID.randomUUID();
        capital.setId(newCapitalID);
    	mapCapital.put(capital.getId(), capital);
    }

    public static HashMap<UUID, Capital> getAllCapitals() {
        return mapCapital;
    }

    public static Capital getCapitalByID(UUID capitalID) {
        return mapCapital.get(capitalID);
    }
    
    public static void addCountry(Country country) {
        UUID newCountryID = UUID.randomUUID();
        country.setId(newCountryID);
    	mapCountry.put(country.getId(), country);
    }
    
    public static HashMap<UUID, Country> getAllCountries() {
        return mapCountry;
    }

    public static Country getCountryByID(UUID countryID) {
        return mapCountry.get(countryID);
    }
    
    public static void addContinent(Continent continent) {
        UUID newContinentID = UUID.randomUUID();
        continent.setId(newContinentID);
    	mapContinent.put(continent.getId(), continent);
    }
    
    public static HashMap<UUID, Continent> getAllContinents() {
        return mapContinent;
    }

    public static Continent getContinentByID(UUID continentID) {
        return mapContinent.get(continentID);
    }
}
