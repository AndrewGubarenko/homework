package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

@Component
public class Seeds extends Food {
    public Seeds() {
        this.foodFor = Species.BIRD;
    }
}
