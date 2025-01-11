package Lab2;

public class MainClass {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Shape circle =  new Circle(5);
        canvas.addCanvas(circle);
        Shape rectangle = new Rectangle(5,8);
        canvas.addCanvas(rectangle);

        canvas.draw();

    }
}
