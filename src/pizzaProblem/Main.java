package pizzaProblem;

public class Main {
    public static void main(String[] args) {
        Pizza.pizzaBuilder pizzaBuilder = new Pizza.pizzaBuilder();

        pizzaBuilder.buildPizza(Topping.CHICKEN)
                .buildPizza(Topping.JALAPENO)
                .buildPizza(Topping.MOZZARILLA)
                .buildPizza(Topping.VEGETABLE)
                .build();

        System.out.println(pizzaBuilder.toString());
    }
}
