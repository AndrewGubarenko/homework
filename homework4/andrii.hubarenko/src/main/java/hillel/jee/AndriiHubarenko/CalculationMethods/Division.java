package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

/**
 * Class {@link Division} is using for calculation the dividing of digit "a" to digit "b".
 * Implements the {@link Calculation} interface.
 */
@Component
public class Division implements Calculation {

    public double calc(double a, double b) {
        return a / b;
    }
}
