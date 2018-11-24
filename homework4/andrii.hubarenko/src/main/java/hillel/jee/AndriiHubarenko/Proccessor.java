package hillel.jee.AndriiHubarenko;

import hillel.jee.AndriiHubarenko.CalculationMethods.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Proccessor {

    @Autowired
    Sum sum;
    @Autowired
    Subtraction subtraction;
    @Autowired
    Multiplication multiplication;
    @Autowired
    Division division;
    @Autowired
    Exponentiation exponentiation;
    @Autowired
    SquareRoot squareRoot;

    public double stringProcessing(String str) {
        List result = new ArrayList();
        String[] input = str.split(" ");

        for (int i = 0; i < input.length; i++) {
            if (input[i].matches("[-+]?\\d+")) {
                result.add(Double.parseDouble(input[i] + ".0"));
            } else if (input[i].matches("-?\\d+(\\.\\d+)?")) {
                result.add(Double.parseDouble(input[i]));
            } else {
                result.add(input[i]);
            }
        }

        return calculate(result);
    }

    public double calculate(List list) {
        if(list.size() <= 2) {
            return (double) list.get(0);
        } else {
            System.out.println(Arrays.asList(list));
            list = highPriority(list);
            System.out.println(Arrays.asList(list));
            list = middlePriority(list);
            System.out.println(Arrays.asList(list));

            return lowPriority(list);
        }
    }

    private List highPriority(List list) {
            List result = new ArrayList();
            for(int i = 0, j = 0; i < list.size(); i++) {
                if(list.get(i).equals("^")) {
                    result.set(j-1, exponentiation.exponentiation((double) result.get(j-1), (double) list.get(i+1)));
                    i++;
                } else if(list.get(i).equals("sqrt")) {
                    result.add(squareRoot.squareRoot(((double) list.get(i+1))));
                    i++;
                } else {
                    result.add(list.get(i));
                    j++;
                }
            }

            return result;
    }

    private List middlePriority(List list) {
        List result = new ArrayList();
        for(int i = 0, j = 0; i < list.size(); i++) {
            if(list.get(i).equals("*")) {
                result.set(j-1, multiplication.multiplication((double) result.get(j-1), (double) list.get(i+1)));
                i++;
            } else if(list.get(i).equals("/")) {
                result.set(j-1, division.division((double) result.get(j-1), (double) list.get(i+1)));
                i++;
            } else {
                result.add(list.get(i));
                j++;
            }
        }

        return result;
    }

    private double lowPriority(List list) {

        double result = (double) list.get(0);

        if(list.size() > 2) {

            for(int i = 1; i < list.size(); i++) {
                if(list.get(i).equals("+")) {
                    result = sum.sum(result, (double) list.get(i+1));
                } else if(list.get(i).equals("-")) {
                    result = subtraction.subtraction(result, (double) list.get(i+1));
                }
            }
        }
        return result;
    }
}