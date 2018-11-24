package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

@Component
public class Sum {

    private final int priority = 1;

    public int getPriority() {
        return priority;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}
