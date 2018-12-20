package hillel.jee.pets;

import org.springframework.stereotype.Component;

@Component
public class Hamster extends Pet {

    @Override
    public void voice() {
        System.out.println(this.getClass().getSimpleName() + " is squeaking");
    }
}
