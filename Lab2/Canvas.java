
package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

    private List<Shape> shapes;
    public Canvas(){
        shapes = new ArrayList<>();
    }

    public void addCanvas(Shape shape){
        shapes.add(shape);
    }

    public void draw(){
        for(Shape shape: shapes){
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area : " + shape.area());
            System.out.println("Perimeter : " + shape.perimeter());

        }
    }

}
