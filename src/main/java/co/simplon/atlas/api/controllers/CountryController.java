package co.simplon.atlas.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.simplon.atlas.api.entities.Country;
import co.simplon.atlas.api.dto.CreateCountry;
import co.simplon.atlas.api.services.CountryService;

import java.util.UUID;

import javax.validation.Valid;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
private final CountryService service;
	
	public CountryController(CountryService service) {
        this.service = service;
    }
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public UUID create(@RequestBody @Valid CreateCountry inputs) {
        return service.create(inputs);
    }

    @GetMapping("/{countryID}")
    public Country getCountryByID(@PathVariable UUID countryID) {
        return service.getByID(countryID);
    }
    
    @PutMapping("/{countryID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable UUID countryID, @RequestBody @Valid CreateCountry inputs) {
        service.update(countryID, inputs);
    }
    
    @PatchMapping("/{countryID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePartially(@PathVariable("countryID") UUID countryID, @RequestBody @Valid CreateCountry inputs) {
    	service.updatePartially(countryID, inputs);
    }

    @DeleteMapping("/{countryID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCountryByID(@PathVariable UUID countryID) {
       service.deleteByID(countryID);
    }
}