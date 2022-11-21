package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void WhenExist() {
        boolean result = Triangle.exist(3.0,3.0,5.0);
        assertThat(result).isTrue();
    }

    @Test
    public void WhenNotExist() {
        boolean result = Triangle.exist(3.0,2.0,5.0);
        assertThat(result).isFalse();
    }
}