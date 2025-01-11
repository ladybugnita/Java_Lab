package Lab2;

public class Circle extends Shape{

    private double radius;

    public Circle(double value){
        this.radius =value;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI *radius;
    }
}
