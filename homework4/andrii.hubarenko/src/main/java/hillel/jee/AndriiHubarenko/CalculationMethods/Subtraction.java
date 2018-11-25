package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

/**
 * Class {@link Subtraction} is using for calculation the subtraction of two digits.
 * Implements the {@link Calculation} interface.
 */
@Component
public class Subtraction implements Calculation {

    public double calc(double a, double b) {
        return a - b;
    }
}
