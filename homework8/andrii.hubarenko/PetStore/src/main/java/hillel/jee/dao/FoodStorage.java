package hillel.jee.dao;

import hillel.jee.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple implementing of Data Base for storing Food for Pets
 */
@Component
@Scope("singleton")
public class FoodStorage {
    @Autowired
    Food dung;
    @Autowired
    Food fishFood;
    @Autowired
    Food freshGrass;
    @Autowired
    Food grain;
    @Autowired
    Food hay;
    @Autowired
    Food insects;
    @Autowired
    Food meat;
    @Autowired
    Food seeds;

    private Map<String, Food> foodStorage = new HashMap<>();

    public Map<String, Food> getFoodStorage() {
        foodStorage.put("dung", dung);
        foodStorage.put("fishfood", fishFood);
        foodStorage.put("freshgrass", freshGrass);
        foodStorage.put("grain", grain);
        foodStorage.put("hay", hay);
        foodStorage.put("insects", insects);
        foodStorage.put("meat", meat);
        foodStorage.put("seeds", seeds);
        return  foodStorage;
    }

}
