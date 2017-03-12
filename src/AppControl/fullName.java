package AppControl;

import java.util.Scanner;

/* App that will ask the user for his/her first name, middle name and last name.  It will then
 * combine the input received into one string to create their full name.
 */
public class fullName {

    public static void main(String[] args) {
        // Instance of controller
        appController myController = new appController();

        // variables to store input from user.
        String firstName;
        String middleName;
        String lastName;
        String action;

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Prompts the user for their first name.
        System.out.println("Enter your first name: ");
        firstName = input.next();
        // Prompts the user for their middle name.
        System.out.println("Enter your middle name: ");
        middleName = input.next();
        // Prompts the user for their last name.
        System.out.println("Enter your last name: ");
        lastName = input.next();
        // Prompts the user to enter an action to take.
        System.out.println("Enter 'act' to make your full name: ");
        System.out.println("Enter command: ");
        action = input.next();

        // Calls the fullName method in appController which will pass the values and combine them.
        myController.fullName(action, firstName, middleName, lastName);
    }
}

