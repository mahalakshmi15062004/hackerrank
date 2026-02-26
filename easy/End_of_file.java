import java.util.Scanner;

public class End_of_file
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Counter for the line numbers
        int lineNumber = 1;
        
        // hasNext() returns true as long as there is more input to read
        while (sc.hasNext()) {
            // Read the entire next line
            String line = sc.nextLine();
            
            // Print the line number, a space, and the line content
            System.out.println(lineNumber + " " + line);
            
            // Increment the counter for the next iteration
            lineNumber++;
        }
        
        sc.close();
    }
}
