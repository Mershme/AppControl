package AppControl;

import java.util.HashMap;


public class appController {

    // Creates a hash map that is used to store the names that the user inputs.
    public static HashMap<String, handler> commandsHashMap = new HashMap<String, handler>();

    // Default constructor
    public void appController() {

    }

    public static void fullName(String action, String firstName, String middleName, String lastName) {
        // saves the 'key' and value in the hashmap
        commandsHashMap.put("act", new combineName());

        // Stores the key and value received above to the method.
        handler myHandler = commandsHashMap.get(action);

        // Calls the method to combine the names and execute the action.
        myHandler.execute(firstName, middleName, lastName);
    }
}

