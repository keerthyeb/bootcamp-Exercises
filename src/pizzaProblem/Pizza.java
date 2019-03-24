package pizzaProblem;

public class Pizza {
    private Toppings  toppings;
    private Price totalPrice;

    public Pizza() {
        this.toppings = new Toppings();
        totalPrice = Price.createPrice(50);
    }

    public Price getBasePrice() {
        totalPrice.add(toppings.getTotalToppingPrice());
        return totalPrice;
    }

    public void addTopping(Topping chicken) {
        toppings.addTopping(chicken);
    }
}
