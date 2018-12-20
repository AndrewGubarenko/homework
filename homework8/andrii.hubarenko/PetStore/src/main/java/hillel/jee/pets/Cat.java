package hillel.jee.pets;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Pet {

    @Override
    public void voice() {
        System.out.println("MEOW MEOW");
    }
}
