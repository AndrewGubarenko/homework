package hillel.jee.utils;

import hillel.jee.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Class for generating Pet's names, colors and for getting exect type of Food
 */
@Component
public class Generators {
    @Autowired
    private Food dung;
    @Autowired
    private Food fishFood;
    @Autowired
    private Food freshGrass;
    @Autowired
    private Food grain;
    @Autowired
    private Food hay;
    @Autowired
    private Food insects;
    @Autowired
    private Food meat;
    @Autowired
    private Food seeds;
    private String[] color = {"white", "black", "gray", "brown", "milky", "smoky"};
    private static String[] names = {"Willy", "Polly", "Danny", "Tony", "Tracy", "Holly"};

    /**
     * The simpe color generator
     * @return String color
     */
    public String getColor() {
        Random rand = new Random();
        return color[rand.nextInt(color.length)];
    }

    /**
     * The simple name's generator
     * @return String name
     */
    public static String getName() {
        Random rand = new Random();

        return names[rand.nextInt(names.length)];
    }

    /**
     * Method allows to get an exact type of Food by it's name
     * @param foodName
     * @return Food food
     */
    public Food getFood(String foodName) {
        String comparableFoodName = foodName.toLowerCase();
        switch (comparableFoodName) {
            case "dung": return dung;
            case "fishFood": return fishFood;
            case "freshGrass": return freshGrass;
            case "grain": return grain;
            case "hay": return hay;
            case "insects": return insects;
            case "meat": return meat;
            case "seeds": return seeds;
        }
        return null;
    }
}
