package calculator;

class StringCalculator {

    public int add(String input) {
        int finalSum = 0;
        String[] inputArray = input.split(",");
        if (inputArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers are allowed only.");
        }
        for (String number : inputArray) {
            if (!number.trim().isEmpty()) {
                finalSum += Integer.parseInt(number);
            }
        }
        return finalSum;
    }
}