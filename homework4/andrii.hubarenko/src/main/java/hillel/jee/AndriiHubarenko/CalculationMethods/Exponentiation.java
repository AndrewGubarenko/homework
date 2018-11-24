package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

@Component
public class Exponentiation {

    private final int priority = 3;

    public int getPriority() {
        return priority;
    }

    public double exponentiation(double a, double b) {
        return Math.pow(a, b);
    }
}
