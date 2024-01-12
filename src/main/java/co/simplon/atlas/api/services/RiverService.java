package co.simplon.atlas.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.atlas.api.entities.River;
import co.simplon.atlas.api.database.Database;

@Service
public class RiverService {

    public UUID create(River river) {
    	Database.addRiver(river);
    	return river.getId();
    }
    
    public River getById(UUID id) {
    	return Database.getRiverByID(id);
    }
    
    public void update(UUID riverID, River updatedRiver) {
        River river = Database.getRiverByID(riverID);
        String name = updatedRiver.getName();
        int length = updatedRiver.getLength();
       	String source = updatedRiver.getSource();
       	String mouth = updatedRiver.getMouth();
        river.setName(name);
        river.setLength(length);
        river.setSource(source);
        river.setMouth(mouth);
        Database.updateRiver(river);
    }
    
    public void updatePartially(UUID riverID, River updatedRiver) {
    	River river = Database.getRiverByID(riverID);
        int length = updatedRiver.getLength();
       	String source = updatedRiver.getSource();
       	String mouth = updatedRiver.getMouth();
        river.setLength(length);
        river.setSource(source);
        river.setMouth(mouth);
        Database.updateRiver(river);
    }
    
    public void delete(UUID id) {
    	Database.deleteRiver(id);
    }
}
