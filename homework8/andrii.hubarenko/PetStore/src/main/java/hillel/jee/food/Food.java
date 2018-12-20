package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

@Component
public abstract class Food {
    Species foodFor;

    public Species getFoodFor() {
        return foodFor;
    }
}
