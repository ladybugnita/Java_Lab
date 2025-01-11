//Explore Java Typecasting
import java.awt.*;
public class JavaTypeCasting {
    public static void main(String[] args) {

        // Widening casting
        /*converting a smaller type to larger type size*/
        int myInt = 9;
        System.out.println("Integer value: "+ myInt);
        double myDouble = myInt; // Automatic casting int to double
        System.out.println("Casting int to double : " + myDouble);

        // Narrowing casting
        /* converting a larger type to smaller type.*/
        double mySecondDouble = 9.78f;
        System.out.println("Double value: " + mySecondDouble);
        int mySecondInt = (int) mySecondDouble; // manual casting : double to int
        System.out.println("Casting double to int: " + mySecondInt);

        // Another example
        int maxScore =500;
        int userScore =423;

        float percentage = ((float) userScore /maxScore)*100.0f;
        System.out.println("User percentage is : " + percentage);
    }
}
 
