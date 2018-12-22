package hillel.jee;

import hillel.jee.dao.PetStorage;
import hillel.jee.pets.Pet;
import hillel.jee.utils.Generators;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application {
    static ApplicationContext context = new AnnotationConfigApplicationContext("hillel.jee");
    final static PetStorage storage = context.getBean(PetStorage.class);
    final static Generators generators = context.getBean(Generators.class);

    public static void main(String[] args) {
        System.out.println("This is the best PetStore!");
        //storage.getStorage().get("Cat").get(0).feed(generators.getFood("hay"));
        Pet pet = storage.createPet("Cat", "Tom");
        System.out.println(pet);
        storage.addPetToStore(pet);
        /*for(Map.Entry<String, List<Pet>> entry: storage.getStorage().entrySet()) {
            System.out.println(entry.getKey() + ": " + Arrays.asList(entry.getValue()));

        }*/

    }
}
