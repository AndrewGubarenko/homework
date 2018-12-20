package hillel.jee;

import hillel.jee.dao.PetStorage;
import hillel.jee.pets.Pet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class Application {
    static ApplicationContext context = new AnnotationConfigApplicationContext("hillel.jee");
    final static PetStorage storage = context.getBean(PetStorage.class);

    public static void main(String[] args) {
        System.out.println("This is the best PetStore!");

        for(Map.Entry<String, List<Pet>> entry: storage.getStorage().entrySet()) {
            System.out.println(entry.getKey() + ": " + Arrays.asList(entry.getValue()));
        }

    }
}
