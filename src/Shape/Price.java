package Shape;

class Price {
    private double side;

    Price(double side) throws Exception {
        if (side < 0) throw new Exception("invalid side");
        this.side = side;
    }

    double getSide() {
        return side;
    }
}
