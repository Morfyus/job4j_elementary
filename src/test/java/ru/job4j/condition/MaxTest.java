package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax32To30Then32() {
        int left = 32;
        int right = 30;
        int result = Max.max(left, right);
        int expected = 32;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void whenMax32To34Then34() {
        int left = 32;
        int right = 34;
        int result = Max.max(left, right);
        int expected = 34;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void whenMax32To32Then32() {
        int left = 32;
        int right = 32;
        int result = Max.max(left, right);
        int expected = 32;
        assertThat(result).isEqualTo(expected);
    }
}