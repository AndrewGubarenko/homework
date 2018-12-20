package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

@Component
public class FishFood extends Food {
    public FishFood() {
        this.foodFor = Species.FISH;
    }
}
