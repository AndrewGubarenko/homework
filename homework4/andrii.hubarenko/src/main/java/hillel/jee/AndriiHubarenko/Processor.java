package hillel.jee.AndriiHubarenko;

import hillel.jee.AndriiHubarenko.CalculationMethods.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Processor is using for calculating the whole expression
 */
@Service
public class Processor {

    @Autowired
    CalculationMethods methods;

    /**
     * The method is using for transformation all digits (int and double),
     * which are expressed in String format,
     * to a double format
     * @param str
     * @return double desired result as a result of all calculations
     */

    /**
     * The public class to connect {@link ShellInterface} and {@link Processor}
     * @param str
     * @return
     */
    public double perform (String str) {
        return calculate(stringProcessing(str));
    }

    /**
     * The method is using for creating of str`s elements list
     * @param str
     * @return list of str`s elements
     */
    private List stringProcessing(String str) {
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
        return result;
    }

    /**
     * The method provides all calculation manipulations
     * @param list
     * @return double result of all calculations
     */
    private double calculate(List list) {
        if(list.size() <= 2) {
            return (double) list.get(0);
        } else {
            list = ifBrackets(list);
            list = highPriority(list);
            list = middlePriority(list);
            return lowPriority(list);
        }
    }

    /**
     * The method used when the incoming expression has a brackets
     * @param list
     * @return the list with a double meaning instead expressions in brackets
     */
    private List ifBrackets(List list) {
        List result = new ArrayList();
        List temp;
        int first, last;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("(")) {
                first = i + 1;
                for(int j = list.size() - 1; j >= 0; j--) {
                    if(list.get(j).equals(")")) {
                        last = j;
                        temp = list.subList(first, last);
                        result.add(calculate(temp));
                        i = j;
                        break;
                    }
                }
            } else {
                result.add(list.get(i));
            }
        }
        return result;
    }

    /**
     * The method provides calculation of powers and roots
     * @param list
     * @return list with double meaning instead of power and root expressions
     */
    private List highPriority(List list) {
        List result = new ArrayList();
        for(int i = 0, j = 0; i < list.size(); i++) {
            if(list.get(i).equals("^")) {
                result.set(j-1, ((Exponentiation) methods.getMap().get("exponentiation")).calc((double) result.get(j-1), (double) list.get(i+1)));
                i++;
            } else if(list.get(i).equals("root")) {
                result.set(j-1, ((Root) methods.getMap().get("root")).calc((double) result.get(j-1), (double) list.get(i+1)));
                i++;
            } else {
                result.add(list.get(i));
                j++;
            }
        }
        return result;
    }

    /**
     * The method provides calculation of multiplying and dividing
     * @param list
     * @return list with double meaning instead of multiplying and root dividing
     */
    private List middlePriority(List list) {
        List result = new ArrayList();
        for(int i = 0, j = 0; i < list.size(); i++) {
            if(list.get(i).equals("*")) {
                result.set(j-1, ((Multiplication) methods.getMap().get("multiplication")).calc((double) result.get(j-1), (double) list.get(i+1)));
                i++;
            } else if(list.get(i).equals("/")) {
                result.set(j-1, ((Division) methods.getMap().get("division")).calc((double) result.get(j-1), (double) list.get(i+1)));
                i++;
            } else {
                result.add(list.get(i));
                j++;
            }
        }
        return result;
    }

    /**
     * The method provides the main calculations (sum and subtract)
     * after all previous calculations with higher mathematical priority
     * @param list
     * @return double desired result
     */
    private double lowPriority(List list) {
        double result = (double) list.get(0);
        if(list.size() > 2) {
            for(int i = 1; i < list.size(); i++) {
                if(list.get(i).equals("+")) {
                    result = ((Sum) methods.getMap().get("sum")).calc(result, (double) list.get(i+1));
                } else if(list.get(i).equals("-")) {
                    result = ((Subtraction) methods.getMap().get("subtraction")).calc(result, (double) list.get(i+1));
                }
            }
        }
        return result;
    }
}