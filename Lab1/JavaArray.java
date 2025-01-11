//Explore Java arrays.
import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {

        String[] Animals;

        // To insert value
        String[]animalname = {"Bear", "Deer", "Panda", "Lion"};
        System.out.println("Animal name: " + Arrays.toString(animalname));
        // To Access element
        System.out.println("Access first animal name: " + animalname[0]);
        // To change an Array element
        animalname[0] = "Tiger";
        System.out.println("Access first animalname: " + animalname[0]);

        // Loop through an Array
        // using for loop
        for (int i = 0; i < animalname.length; i++) {
            System.out.println(animalname[i]);
        }
        System.out.println("Using for each: ");
        // using for-each
        for(String brand: animalname){
            System.out.println(brand);
        }

    


    }
}

