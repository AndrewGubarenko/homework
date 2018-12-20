package hillel.jee.pets;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Pet {

    @Override
    public void voice() {
        System.out.println("WOOF WOOF");
    }
}
