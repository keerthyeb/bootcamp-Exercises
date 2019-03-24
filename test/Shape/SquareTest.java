package Shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square;
    Price side;

    @BeforeEach
    void setUp() throws Exception {
        side = new Price(10D);
        square = new Square(side);

    }

    @Test
    void calculateArea() {
        assertEquals(square.calculateArea(),100);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(square.calculatePerimeter(),40);
    }
}