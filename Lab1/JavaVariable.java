//Explore Java variables declaration and value assign.

import java.awt.*;
public class JavaVariable {
    public static void main(String[] args) {
        // Variable declarations consist of datatype and variable name
        int myAge; 
        String myName; 
        boolean isTired; 
        
        // Variable with initial value
        int mySize, numShoes = 50;

        // declare multiple variable name with same type
        String firstName, lastName;

        // Assign value to the variable
        firstName = "Nita";
        lastName = "Dangol";

        // String concatenation
        String fullName = firstName.concat(lastName);

        System.out.println("Firstname : " + fullName);

        int x = 4, y =6;
        // Addition of int variable type
        System.out.println("Addition of x and y : " + (x+y));

        // Assign one variable value to another
        y = x;
        System.out.println("After assing x value to y: " + (y+x));

        // Descriptive variable name
        int minutesPerHour = 60;

        // Short variable name
        int m = 60;

        //Real Example
        String studentName = "Nita Dangol";
        int studentId = 46;
        int studentAge = 20;
        String studentAddress = "Kathmandu";

        //Area of rectangle
        double length= 4.5;
        double width = 10.2;
        JavaVariable javaVariable = new JavaVariable();
        double area = javaVariable.areaOfRectangle(length, width);
        System.out.println("Area of the rectangle: " + area);

    }
    double areaOfRectangle(double length, double width){
        return length*width;
    }
}

