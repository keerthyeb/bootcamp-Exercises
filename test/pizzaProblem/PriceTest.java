package pizzaProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PriceTest {

    @Test
    void getPrice() {
        Price price = Price.createPrice(10);
        assertEquals(price.getPrice(), 10);
    }

    @Test
    void add() {
        Price price = Price.createPrice(10);
        Price expected = Price.createPrice(20);
        price.add(price);
        assertEquals(expected,price);

    }
}