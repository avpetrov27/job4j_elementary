package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean etalonValue = data[0];
        for (int i = 1; i < data.length; i++) {
            if (etalonValue ^ data[i]) {
                return false;
            }
        }
        return true;
    }
}
