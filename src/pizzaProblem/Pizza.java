package pizzaProblem;

class Pizza {
    private Toppings toppings;
    private Price totalPrice;

    Pizza() {
        this.toppings = new Toppings();
        totalPrice = Price.createPrice(50);
    }

    Price getBasePrice() {
        return totalPrice;
    }

    private void updatePrice() {
        totalPrice.add(toppings.getTotalToppingPrice());
    }

    void addTopping(Topping chicken) {
        toppings.addTopping(chicken);
        updatePrice();
    }

    @Override
    public String toString() {
        return "Pizza=" + toppings +
                ", totalPrice=" + totalPrice;
    }

    static class pizzaBuilder {
        Pizza pizza = new Pizza();

        pizzaBuilder() {
            this.pizza = new Pizza();
        }

        pizzaBuilder buildPizza(Topping topping) {
            pizza.addTopping(topping);
            return this;
        }

        Pizza build() {
            return this.pizza;
        }

        @Override
        public String toString() {
            return " " + pizza;
        }
    }
}
