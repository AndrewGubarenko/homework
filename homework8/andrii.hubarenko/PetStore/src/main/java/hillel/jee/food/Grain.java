package hillel.jee.food;

import hillel.jee.pets.Species;
import org.springframework.stereotype.Component;

@Component
public class Grain  extends Food{
    public Grain() {
        this.foodFor = Species.RODENT;
    }
}
