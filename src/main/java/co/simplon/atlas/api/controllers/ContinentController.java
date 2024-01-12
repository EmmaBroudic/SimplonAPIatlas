package co.simplon.atlas.api.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import co.simplon.atlas.api.entities.Continent;
import co.simplon.atlas.api.services.ContinentService;
import co.simplon.atlas.api.dto.CreateContinent;



import java.util.UUID;

import javax.validation.Valid;

@RestController
@RequestMapping("/continents")
public class ContinentController {
	
	private final ContinentService continentService;

    public ContinentController(ContinentService continentService) {
        this.continentService = continentService;
    }
    
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public UUID create(@RequestBody @Valid CreateContinent inputs) {
    	return continentService.create(inputs);
    }

	@GetMapping("/{continentID}")
	public Continent getById(@PathVariable("continentID") UUID continentID) {
	    return continentService.getById(continentID);
	}

    @PutMapping("/{continentID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable UUID continentID, @RequestBody @Valid CreateContinent inputs) {
    	continentService.update(continentID, inputs);
    }
    
    @PatchMapping("/{continentID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePartially(@PathVariable("continentID") UUID continentID, @RequestBody @Valid CreateContinent inputs) {
    	continentService.updatePartially(continentID, inputs);
    }
  
    @DeleteMapping("/{continentID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteContinentByID(@PathVariable("continentID") UUID continentID) {
        continentService.delete(continentID);
    }
}