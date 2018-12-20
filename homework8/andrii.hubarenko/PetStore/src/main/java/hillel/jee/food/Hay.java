package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

@Component
public class Hay extends Food {
    public Hay() {
        this.foodFor = Species.HERBIVORE;
    }
}
