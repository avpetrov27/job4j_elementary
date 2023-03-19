package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To6To7Then7() {
        int first = 5;
        int second = 6;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To6To7Then10() {
        int first = 10;
        int second = 6;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To16To7Then16() {
        int first = 10;
        int second = 16;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 16;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To16To7to8Then16() {
        int first = 10;
        int second = 16;
        int third = 7;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 16;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax20To16To7to8Then20() {
        int first = 20;
        int second = 16;
        int third = 7;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To0To7to8Then8() {
        int first = 0;
        int second = 0;
        int third = 7;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxMinus5To1To17to8Then17() {
        int first = -5;
        int second = 1;
        int third = 17;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 17;
        assertThat(result).isEqualTo(expected);
    }
}
