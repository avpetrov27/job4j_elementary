package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void nameOfDay1() {
        String in = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void nameOfDay2() {
        String in = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void nameOfDay3() {
        String in = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void nameOfDay4() {
        String in = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void nameOfDay5() {
        String in = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void nameOfDay6() {
        String in = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void nameOfDay7() {
        String in = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void nameOfDayError() {
        String in = "Дене недели";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}