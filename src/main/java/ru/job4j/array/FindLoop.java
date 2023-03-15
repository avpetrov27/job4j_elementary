package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                return index;
            }
        }
        return -1;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        if (start > finish) {
            return -1;
        }
        if (start < 0) {
            return -1;
        }
        if (finish >= data.length) {
            return -1;
        }
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                return index;
            }
        }
        return -1;
    }
}
