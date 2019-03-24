package pizzaProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToppingsTest {

    @Test
    void getTotalToppingPrice() {
        Toppings toppings = new Toppings();
        toppings.addTopping(Topping.CHICKEN);
        Price expectedPrice = Price.createPrice(30);
        assertEquals(expectedPrice, toppings.getTotalToppingPrice());

    }
}