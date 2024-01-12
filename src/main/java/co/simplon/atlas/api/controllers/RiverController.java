package co.simplon.atlas.api.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.simplon.atlas.api.entities.River;
import co.simplon.atlas.api.services.RiverService;

@RestController
@RequestMapping("rivers")
public class RiverController {
	
	private final RiverService riverService;
	
	public RiverController(RiverService riverService) {
		this.riverService = riverService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public UUID create(@RequestBody River river) {
    	return riverService.create(river);
    }
	
	@GetMapping("/{riverID}")
	public River getById(@PathVariable("riverID") UUID riverID) {
	    return riverService.getById(riverID);
	}
	
    @PutMapping("/{riverID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateRiver(@PathVariable UUID riverID, @RequestBody River updatedRiver) {
    	riverService.update(riverID, updatedRiver);
    }
    
    @PatchMapping("/{riverID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePartiallyRiver(@PathVariable("riverID") UUID riverID, @RequestBody River updatedRiver) {
    	riverService.updatePartially(riverID, updatedRiver);
    }
    
    @DeleteMapping("/{riverID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRiverByID(@PathVariable("riverID") UUID riverID) {
        riverService.delete(riverID);
    }
}
