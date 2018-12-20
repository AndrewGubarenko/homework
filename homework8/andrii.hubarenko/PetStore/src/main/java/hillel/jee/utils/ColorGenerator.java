package hillel.jee.utils;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class ColorGenerator {
    private static String[] color = {"white", "black", "gray", "brown", "milky", "smoky"};

    public static String getColor() {
        Random rand = new Random();

        return color[rand.nextInt(color.length)];
    }
}
