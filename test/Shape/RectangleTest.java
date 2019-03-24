package Shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle;
    Price length;
    Price breadth;

    @BeforeEach
    void setUp() throws Exception {
        length = new Price(10D);
        breadth = new Price(5D);
        rectangle = new Rectangle(length,breadth);

    }

    @Test
    void calculateArea() {
        assertEquals(rectangle.calculateArea(),50);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(rectangle.calculatePerimeter(),30);
    }
}