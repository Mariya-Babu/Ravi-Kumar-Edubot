import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2_UserStringsToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("userStrings.txt"))) {
            System.out.println("Enter strings (type 'DONE' to finish):");
            
            String userInput;
            while (!(userInput = scanner.nextLine()).equals("DONE")) {
                writer.write(userInput);
                writer.newLine(); // Write a newline after each string
            }
            
            System.out.println("Strings written to file 'userStrings.txt'.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
