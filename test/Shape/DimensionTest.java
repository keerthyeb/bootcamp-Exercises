package Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DimensionTest {

    @Test
    void getSide() throws Exception {
        Price side = new Price(10);
        assertEquals(side.getSide(),10);
    }

    @Test
    void shouldThrowExceptionIfTheValueIsLessThanZero() {
        assertThrows(Exception.class, ()-> {
            new Price(-1);
        });
    }
}