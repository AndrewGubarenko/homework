package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

@Component
public class Meat extends Food {
    public Meat() {
        this.foodFor = Species.PREDATOR;
    }
}
