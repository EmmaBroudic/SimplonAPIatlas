package co.simplon.atlas.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.simplon.atlas.api.entities.Country;
import co.simplon.atlas.api.database.Database;

import java.util.UUID;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public void addCountry(@RequestBody Country country) {
        Database.addCountry(country);
        System.out.println(country);
    }

    @GetMapping("/{countryID}")
    public Country getCountryByID(@PathVariable UUID countryID) {
        return Database.getCountryByID(countryID);
    }
}
