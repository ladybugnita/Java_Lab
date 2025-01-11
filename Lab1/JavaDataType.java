//Explore Java Datatypes and its use cases.
import java.awt.*;
public class JavaDataType {
    public static void main(String[] args) {

        int myNum = 5; 
        float myFloatNum = 5.99f; 
        char myLetter = 'A'; 
        boolean myBoolean = true; 
        String myText = "Hello";

        byte myByteNumber = 100; 
        short myShortNumber = 5000; 
        int myIntNumber = 100000; 
        long myLongNumber = 150000000L; 

        float myFloatNumber = 58.55f;
        double myDoubleNumber = 11.99d;

        // Scientific numbers - e to indicate the power of 10
        float myScientificFloatNumber = 35e3f;
        double myScientificDoubleNumber = 12e4d;

        System.out.println("Floating point : " + myScientificFloatNumber);

        boolean isJavaFun = true;
        boolean isFalseState = false;

        System.out.println(isJavaFun);

        char grade = 'A';
        System.out.println("Grade character: " + grade);
        
        char aChar = 65;
        System.out.println("ASCII A char: "+aChar);

        String greeting = "Good Morning!";
        System.out.println("String: "+ greeting);
    }
}

