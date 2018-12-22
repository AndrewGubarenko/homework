package hillel.jee.utils;

import hillel.jee.pets.Pet;
import hillel.jee.pets.Species;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The class contains getters with and without arguments(name of pet) to get an exact pet
 */
@Component
public class PetCreator {

    @Autowired
    Generators generators;
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
        hamster.setName(generators.getName());
        hamster.setColor(generators.getColor());
        hamster.setType("Hamster");
        return hamster;
    }

    public Pet getHamster(String name) {
        hamster.setSpecies(Species.RODENT);
        hamster.setName(name);
        hamster.setColor(generators.getColor());
        hamster.setType("Hamster");
        return hamster;
    }

    public Pet getCat() {
        cat.setSpecies(Species.PREDATOR);
        cat.setName(generators.getName());
        cat.setColor(generators.getColor());
        cat.setType("Cat");
        return cat;
    }

    public Pet getCat(String name) {
        cat.setSpecies(Species.PREDATOR);
        cat.setName(name);
        cat.setColor(generators.getColor());
        cat.setType("Cat");
        return cat;
    }

    public Pet getDog() {
        dog.setSpecies(Species.PREDATOR);
        dog.setName(generators.getName());
        dog.setColor(generators.getColor());
        dog.setType("Dog");
        return dog;
    }

    public Pet getDog(String name) {
        dog.setSpecies(Species.PREDATOR);
        dog.setName(name);
        dog.setColor(generators.getColor());
        dog.setType("Dog");
        return dog;
    }

    public Pet getTarantula() {
        tarantula.setSpecies(Species.SPIDER);
        tarantula.setName(generators.getName());
        tarantula.setColor(generators.getColor());
        tarantula.setType("Tarantula");
        return tarantula;
    }

    public Pet getTarantula(String name) {
        tarantula.setSpecies(Species.SPIDER);
        tarantula.setName(name);
        tarantula.setColor(generators.getColor());
        tarantula.setType("Tarantula");
        return tarantula;
    }

    public Pet getWorm() {
        worm.setSpecies(Species.WORM);
        worm.setName(generators.getName());
        worm.setColor(generators.getColor());
        worm.setType("Worm");
        return worm;
    }

    public Pet getWorm(String name) {
        worm.setSpecies(Species.WORM);
        worm.setName(name);
        worm.setColor(generators.getColor());
        worm.setType("Worm");
        return worm;
    }

    public Pet getGoldFish() {
        goldFish.setSpecies(Species.FISH);
        goldFish.setName(generators.getName());
        goldFish.setColor(generators.getColor());
        goldFish.setType("GoldFish");
        return goldFish;
    }

    public Pet getGoldFish(String name) {
        goldFish.setSpecies(Species.FISH);
        goldFish.setName(name);
        goldFish.setColor(generators.getColor());
        goldFish.setType("GoldFish");
        return goldFish;
    }

    public Pet getParrot() {
        parrot.setSpecies(Species.BIRD);
        parrot.setName(generators.getName());
        parrot.setColor(generators.getColor());
        parrot.setType("Parrot");
        return parrot;
    }

    public Pet getParrot(String name) {
        parrot.setSpecies(Species.BIRD);
        parrot.setName(name);
        parrot.setColor(generators.getColor());
        parrot.setType("Parrot");
        return parrot;
    }

    public Pet getRabbit() {
        rabbit.setSpecies(Species.HERBIVORE);
        rabbit.setName(generators.getName());
        rabbit.setColor(generators.getColor());
        rabbit.setType("Rabbit");
        return rabbit;
    }

    public Pet getRabbit(String name) {
        rabbit.setSpecies(Species.HERBIVORE);
        rabbit.setName(name);
        rabbit.setColor(generators.getColor());
        rabbit.setType("Rabbit");
        return rabbit;
    }
}
