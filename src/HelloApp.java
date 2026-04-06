/**
 * HelloApp.java - A simple Java application that greets multiple users by name.
 * If multiple command-line arguments are given, it accepts multiple names.
 * - If names are provided, it displays "Hello, [name1], [name2], ..." to console.
 * If no names are provided, it will display "Hello, World!"
 * 
 * Author: MUDUNURI.MAHASVINVARMA
 * Version: 4.0
 * Since: UC1
 */

/**
 * Key Concepts for HelloApp UC4:
 * 1. Default Values: Providing fallback value when no input is given
 * 2. Boolean Logic: Using conditions to control program flow
 * 3. Array Length: Checking the number of command-line arguments
 * 4. String Concatenation with delimiter (comma + space)
 * 
 * For loop: for(int i=0; i<args.length; i++) {
 *   name += args[i] + ", ";
 * }
 * name = name.trim(); // use the provided names
 */
public class HelloApp {
    public static void main(String[] args) {
        String greeting = "World";  // Default greeting
        
        // Check if any names are provided as command-line arguments
        if (args.length > 0) {
            greeting = String.join(", ", args);  // Join all args with ", "
        }
        
        System.out.println("Hello, " + greeting + "!");
    }
}
