package co.simplon.atlas.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.simplon.atlas.api.entities.Capital;

import co.simplon.atlas.api.services.CapitalService;

import java.util.UUID;

@RestController
@RequestMapping("/capitals")
public class CapitalController {


	private final CapitalService service;
	
	public CapitalController(CapitalService service) {
        this.service = service;
    }
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UUID create(@RequestBody Capital capital) {
	    return service.create(capital); // Déléguer suite des traitements (logique métier)      
	}

    @GetMapping("/{capitalID}")
    public Capital getCapitalBy(@PathVariable UUID capitalID) {
        return service.getByID(capitalID);
    }

    @PutMapping("/{capitalID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCapital(@PathVariable UUID capitalID, @RequestBody Capital updatedCapital) {
        service.update(capitalID, updatedCapital);
    }
    
    @PatchMapping("/{capitalID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePartiallyCapital(@PathVariable("capitalID") UUID capitalID, @RequestBody Capital updatedCapital) {
    	service.updatePartially(capitalID, updatedCapital);
    }

    @DeleteMapping("/{capitalID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCapitalByID(@PathVariable UUID capitalID) {
        service.deleteByID(capitalID);
    }
}

