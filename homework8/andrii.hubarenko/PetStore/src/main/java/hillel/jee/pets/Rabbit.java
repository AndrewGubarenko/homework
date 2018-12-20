package hillel.jee.pets;

import org.springframework.stereotype.Component;

@Component
public class Rabbit extends Pet {

    @Override
    public void voice() {
        System.out.println(this.getClass().getSimpleName() + " has no voice, he is a drummer");
    }
}
