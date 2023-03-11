package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LogicNotTest {

    @Test
    void isEven() {
        int in = 6;
        boolean result = LogicNot.isEven(in);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void isPositive() {
        int in = 6;
        boolean result = LogicNot.isPositive(in);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void notEven() {
        int in = 7;
        boolean result = LogicNot.notEven(in);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void notPositive() {
        int in = -7;
        boolean result = LogicNot.notPositive(in);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void notEvenAndPositive() {
        int in = 1;
        boolean result = LogicNot.notEvenAndPositive(in);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void evenOrNotPositive() {
        int in = -5;
        boolean result = LogicNot.evenOrNotPositive(in);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }
}