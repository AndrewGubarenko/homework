package hillel.jee.AndriiHubarenko.CalculationMethods;

import org.springframework.stereotype.Component;

@Component
public class SquareRoot {

    public double squareRoot(int a) {
        return Math.sqrt(a);
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

}
