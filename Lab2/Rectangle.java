package Lab2;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}