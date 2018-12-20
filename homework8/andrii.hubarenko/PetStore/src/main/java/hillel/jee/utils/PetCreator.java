package hillel.jee.utils;

import hillel.jee.pets.Pet;
import hillel.jee.pets.Species;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetCreator {

    @Autowired
    private Pet hamster;
    @Autowired
    private Pet cat;
    @Autowired
    private Pet dog;
    @Autowired
    private Pet tarantula;
    @Autowired
    private Pet worm;
    @Autowired
    private Pet goldFish;
    @Autowired
    private Pet parrot;
    @Autowired
    private Pet rabbit;

    public Pet getHamster() {
        hamster.setSpecies(Species.RODENT);
        hamster.setName(NamesGenerator.getName());
        hamster.setColor(ColorGenerator.getColor());
        hamster.setType("Hamster");
        return hamster;
    }

    public Pet getCat() {
        cat.setSpecies(Species.PREDATOR);
        cat.setName(NamesGenerator.getName());
        cat.setColor(ColorGenerator.getColor());
        cat.setType("Cat");
        return cat;
    }

    public Pet getDog() {
        dog.setSpecies(Species.PREDATOR);
        dog.setName(NamesGenerator.getName());
        dog.setColor(ColorGenerator.getColor());
        dog.setType("Dog");
        return dog;
    }

    public Pet getTarantula() {
        tarantula.setSpecies(Species.SPIDER);
        tarantula.setName(NamesGenerator.getName());
        tarantula.setColor(ColorGenerator.getColor());
        tarantula.setType("Tarantula");
        return tarantula;
    }

    public Pet getWorm() {
        worm.setSpecies(Species.WORM);
        worm.setName(NamesGenerator.getName());
        worm.setColor(ColorGenerator.getColor());
        worm.setType("Worm");
        return worm;
    }

    public Pet getWorm(String name) {
        worm.setSpecies(Species.WORM);
        worm.setName(name);
        worm.setColor(ColorGenerator.getColor());
        worm.setType("Worm");
        return worm;
    }

    public Pet getGoldFish() {
        goldFish.setSpecies(Species.FISH);
        goldFish.setName(NamesGenerator.getName());
        goldFish.setColor(ColorGenerator.getColor());
        goldFish.setType("GoldFish");
        return goldFish;
    }

    public Pet getParrot() {
        parrot.setSpecies(Species.BIRD);
        parrot.setName(NamesGenerator.getName());
        parrot.setColor(ColorGenerator.getColor());
        parrot.setType("Parrot");
        return parrot;
    }

    public Pet getRabbit() {
        rabbit.setSpecies(Species.HERBIVORE);
        rabbit.setName(NamesGenerator.getName());
        rabbit.setColor(ColorGenerator.getColor());
        rabbit.setType("Rabbit");
        return rabbit;
    }
}
