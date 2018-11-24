package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

@Component
public class Subtraction {

    private final int priority = 1;

    public int getPriority() {
        return priority;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }
}
