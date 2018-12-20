package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

@Component
public class Dung extends Food{
    public Dung() {
        this.foodFor = Species.WORM;
    }
}
