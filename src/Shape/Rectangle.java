package Shape;

public class Rectangle implements Shape{
    private Price length;
    private Price breadth;

    public Rectangle(Price length, Price breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea(){
        return length.getSide() * breadth.getSide();
    }

    @Override
    public double calculatePerimeter(){
        return 2*(length.getSide() + breadth.getSide());

    }
}
