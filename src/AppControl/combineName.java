package AppControl;

public class combineName implements handler {

    // Combines the names received from the user and prints them out.
    public void execute(String firstName, String middleName, String lastName) {
        String fName = firstName + " " + middleName + " " + lastName;
        System.out.println("Full Name: " + fName);
    }
}
