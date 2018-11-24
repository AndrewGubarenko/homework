package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

@Component
public class Division {

    private final int priority = 2;

    public int getPriority() {
        return priority;
    }

    public double division(double a, double b) {
        return a / b;
    }
}
