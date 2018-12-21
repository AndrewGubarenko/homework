package hillel.jee.dao;

import hillel.jee.pets.Pet;
import hillel.jee.utils.PetCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Scope("singleton")
public class PetStorage {

    private Map<String, Set<Pet>> storage = new HashMap<>();
    @Autowired
    private PetCreator creator;

    private void storageFiller() {
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            switch (random.nextInt(8)) {
                case 0:
                    addPetToStore(creator.getHamster());
                    break;
                case 1:
                    addPetToStore(creator.getCat());
                    break;
                case 2:
                    addPetToStore(creator.getDog());
                    break;
                case 3:
                    addPetToStore(creator.getGoldFish());
                    break;
                case 4:
                    addPetToStore(creator.getParrot());
                    break;
                case 5:
                    addPetToStore(creator.getTarantula());
                    break;
                case 6:
                    addPetToStore(creator.getWorm());
                    break;
                case 7:
                    addPetToStore(creator.getRabbit());
                    break;
            }
        }
    }

    public void addPetToStore(Pet pet) {
        Set<Pet> value = storage.get(pet.getClass().getSimpleName());
        if(value != null) {
            value.add(pet);
        } else {
            Set<Pet> result = new HashSet<>();
            result.add(pet);
            storage.put(pet.getClass().getSimpleName(), result);
        }
    }

    public Map<String, Set<Pet>> getStorage() {
        this.storageFiller();
        return storage;
    }

    public Pet getPet(String type, String name) {
        String comparableType = type.toLowerCase();
        switch (comparableType) {
            case "cat": return creator.getCat(name);
            case "dog": return creator.getDog(name);
            case "goldfish":return creator.getGoldFish(name);
            case "hamster":return creator.getHamster(name);
            case "parrot":return creator.getParrot(name);
            case "rabbit":return creator.getRabbit(name);
            case "tarantula":return creator.getTarantula(name);
            case "worm":return creator.getWorm(name);
        }
        return null;
    }

    public Pet findPetByTypeAndName(String type, String name) {
        Set<Pet> petSet = storage.get(type);
        for(Pet pet: petSet) {
            if(pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
    }
}
