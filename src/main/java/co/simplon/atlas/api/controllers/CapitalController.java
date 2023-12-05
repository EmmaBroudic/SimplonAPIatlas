package co.simplon.atlas.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.simplon.atlas.api.entities.Capital;
import co.simplon.atlas.api.database.Database;

import java.util.UUID;

@RestController
@RequestMapping("/capitals")
public class CapitalController {
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public void addCapital(@RequestBody Capital capital) {
        Database.addCapital(capital);
        System.out.println(capital);
    }

    @GetMapping("/{capitalID}")
    public Capital getCapitalByID(@PathVariable UUID capitalID) {
        return Database.getCapitalByID(capitalID);
    }
}