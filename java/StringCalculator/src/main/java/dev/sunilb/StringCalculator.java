package dev.sunilb;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty())
            return 0;
        else {

//            if(numbers.startsWith("//")) return 4;

            String delimiter = getDelimiter(numbers);

            String processedNumbers = numbers.trim().replaceAll(delimiter, ",");

            if (endsWithComma(processedNumbers)) {
                throw new RuntimeException("Error in the input format, please review last element");
            }

            String[] numAry = processedNumbers.split(",");

            int sum = calculateSum(numAry);

            return sum;
        }
    }

    private static String getDelimiter(String numbers) {

        if(numbers.startsWith("//")) return getCustomDelimiter(numbers);
        else return "\n";
    }

    private static String getCustomDelimiter(String numbers) {
        Pattern pattern = Pattern.compile("\\/\\/.*?\\n");
        Matcher matcher = pattern.matcher(numbers);
        if(matcher.find()) {
            return extractDelimiterFromString(matcher.group());
        }
        return "\n";
    }

    private static String extractDelimiterFromString(String delimiterPartString) {
        return delimiterPartString.replaceAll("//", "").replaceAll("\n", "").trim();
    }

    private static int calculateSum(String[] numAry) {
        int sum = Arrays.asList(numAry)
                .stream()
                .map(n -> {
                    n = n.equals("") ? "0" : n;
                    return Integer.parseInt(n.trim());
                })
                .reduce(0, Integer::sum);
        return sum;
    }

    private static boolean endsWithComma(String processedNumbers) {
        return processedNumbers.endsWith(",");
    }
}
