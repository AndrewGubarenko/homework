package hillel.jee.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NamesGenerator {
    private static String[] names = {"Willy", "Polly", "Danny", "Tony", "Tracy", "Holly"};

    public static String getName() {
        Random rand = new Random();

        return names[rand.nextInt(names.length)];
    }
}
