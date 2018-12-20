package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

@Component
public class Insects extends Food {
    public Insects() {
        this.foodFor = Species.SPIDER;
    }
}
