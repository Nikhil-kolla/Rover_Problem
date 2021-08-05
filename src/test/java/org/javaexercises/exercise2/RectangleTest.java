package org.javaexercises.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void area_Of_Rectangle_Should_Be_20_For_Width_5_Height_4() {
        Rectangle rectangle = new Rectangle(5, 4);
        assertEquals(20, rectangle.area());
    }

    @Test
    public void perimeter_Of_Rectangle_Should_Be_18_For_Width_5_Height_4() {
        Rectangle rectangle = new Rectangle(5, 4);
        assertEquals(18, rectangle.perimeter());
    }

    @Test
    public void area_Of_Square_Should_Be_16_For_Side_4() {
        Rectangle rectangle = new Rectangle(4);
        assertEquals(16, rectangle.area());
    }

    @Test
    public void perimeter_Of_Square_Should_Be_16_For_Side_4() {
        Rectangle rectangle = new Rectangle(4);
        assertEquals(16, rectangle.perimeter());
    }


}
