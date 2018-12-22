package hillel.jee.rest;

import hillel.jee.dao.FoodStorage;
import hillel.jee.dao.PetStorage;

import hillel.jee.food.Food;
import hillel.jee.pets.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class PetRestController {
    @Autowired
    private PetStorage storage;
    @Autowired
    private FoodStorage foodStorage;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public PetStorage getListOfPets() {
        return storage;
    }

    @PostMapping(path = "/newPet/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Pet createPet(@RequestParam String type, @RequestParam String name) {
        Pet pet = storage.createPet(type, name);
        storage.addPetToStore(pet);
        return pet;
    }

    @GetMapping(path = "/feedPet/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String feedPet(@RequestParam String type, @RequestParam String name, @RequestParam String foodName) {
        Pet pet = storage.findPetByTypeAndName(type, name);
        Food food = foodStorage.getFoodStorage().get(foodName.toLowerCase());
        return pet.feed(food);
    }

    @DeleteMapping(path = "/removePet/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Pet removePet(@RequestParam String type, @RequestParam String name) {
        Pet pet = storage.findPetByTypeAndName(type, name);
        storage.getStorage().get(type).remove(pet);
        return pet;
    }
}
