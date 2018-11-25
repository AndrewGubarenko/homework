package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

/**
 * An interface {@link Calculation} is using as functional interace to give an expression
 * about most common calculation actions
 */

public interface Calculation {
    /**
     * The method calc in each calculation class must provides the main logic for its calculation actions.
     * @param a
     * @param b
     * @return double result
     */
    double calc(double a, double b);
}
