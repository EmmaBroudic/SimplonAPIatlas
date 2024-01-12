DELETE readme for REST API

In the database file at co.simplon.atlas.api.database, add a method in such way : 

public static void deleteC* (Capital, Continent, Country, whatever your flavor) (UUID ContinentID) {

// here is a methoc that won't return anything after with UUID ContinentID as parameeters

mapC*.remove(C*ID) here for instance mapContinent.remove(ContinentID)
}

// Actually instead of destroying the data, it destroy the path to the data just like a can of a bridge leading to the data

Now in the controller where the method will be called : 

@DeleteMapping("/continentID)")
@ResponseStatus(HttpStatus.NO_CONTENT)

// Those are annotations to map HTTP DELETE request and response status actually

public void deleteContinentByID(@PathVariable UUID continentID) { 

// Here is a method that will delete for instance a continent thanks to its ID using the mapping to its own UUID between all the continent ID

Database.deleteContinent(continentID);

// Now we call the database method to actually do the deletion 

System.out.println("Continent deleted");

} 

// print the result but be sure to check it as well with a get, first do a post then a get and check if it's all get, then the delete and after try another get to see if it's all good