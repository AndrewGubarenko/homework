package hillel.jee.rest;

import hillel.jee.dao.PetStorage;

import hillel.jee.pets.Pet;
import hillel.jee.utils.PetCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetRestController {
    @Autowired
    private PetStorage storage;
    @Autowired
    private PetCreator creator;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public PetStorage getListOfPets() {
        return storage;
    }

    @PostMapping(path = "/newWorm/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Pet createWorm(@RequestParam String name) {
        Pet worm = creator.getWorm(name);
        storage.addPetToStore(worm);
        return worm;

    }
}
