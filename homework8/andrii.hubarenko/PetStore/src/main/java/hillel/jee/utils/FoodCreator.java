package hillel.jee.utils;

import hillel.jee.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoodCreator {
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

    public Food getDung() {
        return dung;
    }

    public Food getFishFood() {
        return fishFood;
    }

    public Food getFreshGrass() {
        return freshGrass;
    }

    public Food getGrain() {
        return grain;
    }

    public Food getHay() {
        return hay;
    }

    public Food getInsects() {
        return insects;
    }

    public Food getMeat() {
        return meat;
    }

    public Food getSeeds() {
        return seeds;
    }
}
