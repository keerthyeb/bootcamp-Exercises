package pizzaProblem;

enum Topping {
    CHICKEN(Price.createPrice(30)),
    JALAPENO(Price.createPrice(40)),
    MOZZARILLA(Price.createPrice(10)),
    VEGETABLE(Price.createPrice(20));

    private Price price;

    Topping(Price p) {
        price = p;
    }

    Price getPrice() {
        return price;
    }
}

