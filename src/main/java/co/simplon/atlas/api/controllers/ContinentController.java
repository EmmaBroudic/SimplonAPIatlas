package co.simplon.atlas.api.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import co.simplon.atlas.api.entities.Continent;
import co.simplon.atlas.api.database.Database;

import java.util.UUID;

@RestController
@RequestMapping("/continents")
public class ContinentController {
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public void addContinent(@RequestBody Continent continent) {
        Database.addContinent(continent);
        System.out.println(continent);
    }

    @GetMapping("/{continentID}")
    public Continent getContinentByID(@PathVariable UUID continentID) {
        return Database.getContinentByID(continentID);
    }
}
