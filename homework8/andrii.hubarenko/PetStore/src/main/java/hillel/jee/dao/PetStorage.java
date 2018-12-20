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

    private Map<String, List<Pet>> storage = new HashMap<>();
    @Autowired
    private PetCreator creator;

    private void storageFiller() {
        for (int i = 0; i < 20; i++) {
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
        List<Pet> value = storage.get(pet.getClass().getSimpleName());
        if(value != null) {
            value.add(pet);
        } else {
            List<Pet> result = new ArrayList<>();
            result.add(pet);
            storage.put(pet.getClass().getSimpleName(), result);
        }
    }

    public Map<String, List<Pet>> getStorage() {
        this.storageFiller();
        return storage;
    }

}
