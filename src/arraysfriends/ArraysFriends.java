/*
 * Peter Horne-Deus 
 * Allows a user to enter 5 friends and displays some
 * ArraysFriedns.java
 * October 25,2018
 */

package arraysfriends;

//Imports the scanner
import java.util.Scanner;

public class ArraysFriends {

    
    public static void main(String[] args) {
        //Creating scanner
        Scanner keyedInput = new Scanner (System.in);
        
        //Creating array
        String [ ] friends = new String [5];
        
        //Outputing a prompt for user
        System.out.println("Enter the names of five friends:");
        
        //Allowing user to enter multiple names
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        //Outputing 3 of the 5 names listed
        System.out.println("The second, third and fourth names listed were:");
        System.out.println("Second: " + friends[2]);
        System.out.println("Third: " + friends[3]);
        System.out.println("Fourth:: " + friends[4]);
    }
    
}
