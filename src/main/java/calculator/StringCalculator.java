package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

    public int add(String input) {
    	int finalSum = 0;
        String[] inputArray = input.split(",");
        List negativeNumbers = new ArrayList();
        for (String number : inputArray) {
            if (!number.trim().isEmpty()) {
                int intNum = Integer.parseInt(number.trim());
                if (intNum < 0) {
                    negativeNumbers.add(intNum);
                }
                finalSum += intNum;
            }
        }
        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
        }
        return finalSum;     
    }
}