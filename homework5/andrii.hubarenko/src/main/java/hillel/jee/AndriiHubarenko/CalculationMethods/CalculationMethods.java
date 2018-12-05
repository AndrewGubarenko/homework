package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CalculationMethods {

    @Autowired
    Calculation sum;
    @Autowired
    Calculation subtraction;
    @Autowired
    Calculation multiplication;
    @Autowired
    Calculation division;
    @Autowired
    Calculation exponentiation;
    @Autowired
    Calculation root;

    public Map getMap() {
        return Map.of("sum", sum,
                "subtraction", subtraction,
                "multiplication", multiplication,
                "division", division,
                "exponentiation", exponentiation,
                "root", root);
    }
}
