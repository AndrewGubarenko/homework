package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

@Component
public class SquareRoot {

    private final int priority = 3;

    public int getPriority() {
        return priority;
    }

    public double squareRoot(int a) {
        return Math.sqrt(a);
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

}
