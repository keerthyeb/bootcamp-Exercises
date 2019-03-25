package pizzaProblem;

import java.util.ArrayList;
import java.util.List;

public class Toppings {
    private List<Topping> toppings;
    private Price totalToppingPrice;

    Toppings() {
        this.toppings = new ArrayList<>();
        totalToppingPrice = Price.createPrice(0);
    }

    void addTopping(Topping topping) {
        toppings.add(topping);
        updateToppingsPrice(topping);
    }

    private void updateToppingsPrice(Topping topping) {
        this.totalToppingPrice.add(topping.getPrice());
    }

    Price getTotalToppingPrice() {
        return totalToppingPrice;
    }

    @Override
    public String toString() {
        return "Toppings=" + toppings +
                ", totalToppingPrice=" + totalToppingPrice;
    }
}
