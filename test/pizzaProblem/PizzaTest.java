package pizzaProblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {
    @Test
    void ReturnBasePriceOfThePizza() {
        Pizza pizza = new Pizza();
        Price expectedPrice = Price.createPrice(50);
        assertEquals(expectedPrice,pizza.getBasePrice());

    }

    @Test
    void ReturnTotalPriceOfThePizzaAfterAddingChicken() {
        Pizza pizza = new Pizza();
        pizza.addTopping(Topping.CHICKEN);
        Price expectedPrice = Price.createPrice(80);
        assertEquals(expectedPrice,pizza.getBasePrice());

    }
}