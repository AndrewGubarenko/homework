package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

/**
 * Class {@link Sum} is using for calculation the sum of two digits.
 * Implements the {@link Calculation} interface.
 */
@Component
public class Sum implements Calculation {

    public double calc(double a, double b) {
        return a + b;
    }
}
