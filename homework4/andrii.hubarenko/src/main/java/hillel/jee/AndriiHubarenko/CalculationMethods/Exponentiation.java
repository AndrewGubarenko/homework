package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

@Component
public class Exponentiation {

    public double exponentiation(double a, double b) {
        return Math.pow(a, b);
    }
}
