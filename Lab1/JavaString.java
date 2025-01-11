//Explore java String methods.
import java.awt.*;

public class JavaString {
    public static void main(String[] args) {

        String greeting = "Good Morning!";

        // To find length
        System.out.println("Length of greeting: " + greeting.length());

        // To Upper and Lower case
        System.out.println("Greeting to Uppercase: " + greeting.toUpperCase());
        System.out.println("Greeting to Lowercase: " + greeting.toLowerCase());

        // Finding a Characters
        System.out.println("Find Good in greeting: " + greeting.indexOf("orn"));

        // Concatenation
        System.out.println(greeting.concat(" Sir"));

        // Special characters - use backslash (\) escape character turns special characters into string
        String text = "We are the students of \"NCIT-BCA\" ";
        System.out.println(text);
    }
}
