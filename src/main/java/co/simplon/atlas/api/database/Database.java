package co.simplon.atlas.api.database;

import co.simplon.atlas.api.entities.Capital;
import co.simplon.atlas.api.entities.Country;
import co.simplon.atlas.api.entities.Continent;
import co.simplon.atlas.api.entities.River;

import java.util.HashMap;
import java.util.UUID;

public class Database {
	
    private static HashMap<UUID, Capital> mapCapital = new HashMap<>();
    private static HashMap<UUID, Country> mapCountry = new HashMap<>();
    private static HashMap<UUID, Continent> mapContinent = new HashMap<>();
    private static HashMap<UUID, River> mapRiver = new HashMap<>();

    public static UUID addCapital(Capital capital) {
        UUID newCapitalID = UUID.randomUUID();
        capital.setId(newCapitalID);
    	mapCapital.put(capital.getId(), capital);
    	return newCapitalID;
    }

    public static Capital getCapitalByID(UUID capitalID) {
        return mapCapital.get(capitalID);
    }
    
    public static void updateCapital(Capital updatedCapital) {
    	UUID updatedCapitalID = updatedCapital.getId();
    	mapCapital.put(updatedCapitalID, updatedCapital);
    }

    public static void deleteCapital(UUID capitalID) {
        mapCapital.remove(capitalID);
    }
    
    public static void patchCapital(Capital updatedCapital) {
    	UUID updatedCapitalID = updatedCapital.getId();
    	mapCapital.put(updatedCapitalID, updatedCapital);
    }
    
    public static UUID addCountry(Country country) {
        UUID newCountryID = UUID.randomUUID();
        country.setId(newCountryID);
    	mapCountry.put(country.getId(), country);
    	return newCountryID;
    }

    public static Country getCountryByID(UUID countryID) {
        return mapCountry.get(countryID);
    }
    
    public static void updateCountry(Country updatedCountry) {
    	UUID updatedCountryID = updatedCountry.getId();
    	mapCountry.put(updatedCountryID, updatedCountry);
    }
    
    public static void deleteCountry(UUID countryID) {
        mapCountry.remove(countryID);
    }
    
    public static void addContinent(Continent continent) {
        UUID newContinentID = UUID.randomUUID();
        continent.setId(newContinentID);
    	mapContinent.put(continent.getId(), continent);
    }

    public static Continent getContinentByID(UUID continentID) {
        return mapContinent.get(continentID);
    }
    
    public static void updateContinent(Continent updatedContinent) {
    	UUID updatedContinentID = updatedContinent.getId();
    	mapContinent.put(updatedContinentID, updatedContinent);
    }

    public static void deleteContinent(UUID continentID) {
        mapContinent.remove(continentID);
    }
    
    public static UUID addRiver(River river) {
        UUID newRiverID = UUID.randomUUID();
        river.setId(newRiverID);
    	mapRiver.put(river.getId(), river);
    	return newRiverID;
    }
    
    public static River getRiverByID(UUID riverID) {
        return mapRiver.get(riverID);
    }
    
    public static void updateRiver(River updatedRiver) {
    	UUID updatedRiverID = updatedRiver.getId();
    	mapRiver.put(updatedRiverID, updatedRiver);
    }
    
    public static void deleteRiver(UUID riverID) {
        mapRiver.remove(riverID);
    }
}