package calculator;

class StringCalculator {

    public int add(String input) {
        int finalSum = 0;
        String[] inputArray = input.split(",|n");
        for (String number : inputArray) {
            if (!number.trim().isEmpty()) {
                finalSum += Integer.parseInt(number.trim());
            }
        }
        return finalSum;
    }
}