package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

/**
 * Class {@link Multiplication} is using for calculation the multiplying of two digits.
 * Implements the {@link Calculation} interface.
 */
@Component
public class Multiplication implements Calculation {

    public double calc(double a, double b) {
        return a * b;
    }
}
