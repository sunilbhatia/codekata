package dev.sunilb;

import java.util.Arrays;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.equals(""))
            return 0;
        else {

            String processedNumbers = numbers.trim().replaceAll("\n", ",");

            if (endsWithComma(processedNumbers)) {
                throw new RuntimeException("Error in the input format, please review last element");
            }

            String[] numAry = processedNumbers.split(",");

            int sum = Arrays.asList(numAry)
                    .stream()
                    .map(n -> {
                        n = n.equals("") ? "0" : n;
                        return Integer.parseInt(n.trim());
                    })
                    .reduce(0, Integer::sum);

            return sum;
        }
    }

    private static boolean endsWithComma(String processedNumbers) {
        return processedNumbers.endsWith(",");
    }
}
