package pizzaProblem;

import java.util.Objects;

public class Price {
    private Integer price;

    private Price(Integer price) {
        this.price = price;
    }

    static Price createPrice(Integer price) {
        return new Price(price);
    }

    Integer getPrice() {
        return price;
    }

    public void add(Price currentPrice) {
        price = this.getPrice() + currentPrice.getPrice();
    }

    @Override
    public boolean equals(Object price) {
        if (this == price) return true;
        if (price == null || getClass() != price.getClass()) return false;
        Price price1 = (Price) price;
        return Objects.equals(this.price, price1.price);
    }

    @Override
    public String toString() {
        return "" + price ;
    }
}

