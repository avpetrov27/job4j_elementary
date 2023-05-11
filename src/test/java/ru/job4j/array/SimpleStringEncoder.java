package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result = concat(result, symbol, counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return concat(result, symbol, counter);
    }

    private static String concat(String result, char symbol, int counter) {
        result += symbol;
        if (counter != 1) {
            result += counter;
        }
        return result;
    }
}

