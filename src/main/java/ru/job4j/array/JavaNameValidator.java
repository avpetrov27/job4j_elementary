package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        if (!isLowerLatinLetter(name.codePointAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            if (!(isSpecialSymbol(name.codePointAt(i)) || isLowerLatinLetter(name.codePointAt(i))
                    || isUpperLatinLetter(name.codePointAt(i)) || isDigit(name.codePointAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == '$' || code == '_';
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 'A' && code <= 'Z';
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 'a' && code <= 'z';
    }
}
