package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

/**
 * Class {@link Root} is using for calculation the root of digit "a" of a power "b".
 * Implements the {@link Calculation} interface.
 */
@Component
public class Root implements Calculation {

    public double calc(double a, double b) {
        return Math.pow(a, 1.0/b);
    }

}
