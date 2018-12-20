package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

@Component
public class FreshGrass extends Food{
    public FreshGrass() {
        this.foodFor = Species.HERBIVORE;
    }
}
