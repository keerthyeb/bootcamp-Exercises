package Shape;

public class Square implements Shape{
    private Price side;

    public Square(Price side) {
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return side.getSide() * side.getSide();
    }

    @Override
    public double calculatePerimeter(){
        return 4*(side.getSide());

    }
}

