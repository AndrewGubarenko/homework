package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

/**
 * Class {@link Exponentiation} is using for calculation the exponent of digit "a" to a power "b".
 * Implements the {@link Calculation} interface.
 */
@Component
public class Exponentiation implements Calculation {

    public double calc(double a, double b) {
        return Math.pow(a, b);
    }
}
