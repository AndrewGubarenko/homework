package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

/**
 * Parent class for creating different types of Food for Pets
 */
@Component
public class Food {
    Species foodFor;

    /**
     * Method returns the Species of Pet for it's food accepts
     * @return Species foodFor
     */
    public Species getFoodFor() {
        return foodFor;
    }
}
