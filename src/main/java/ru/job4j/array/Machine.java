package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int diff = money < price ? money : money - price;
        for (int coin : coins) {
            for (int j = 0; j < diff / coin; j++) {
                rsl[size++] = coin;
            }
            diff %= coin;
        }
        return Arrays.copyOf(rsl, size);
    }
}
