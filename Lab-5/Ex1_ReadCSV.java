import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_ReadCSV {
    public static void main(String[] args) {
        String fileName = "input.csv"; // File name
        String line; // To store each line of the file
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int rowNumber = 1; // Counter for row number
            
            // Read each line from the file
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split(","); // Split the line by comma
                
                int max = Integer.MIN_VALUE; // Initialize max to smallest possible value
                
                // Iterate through each number in the line
                for (String number : numbers) {
                    int num = Integer.parseInt(number.trim()); // Convert string to integer
                    if (num > max) {
                        max = num; // Update max if the current number is greater
                    }
                }
                
                // Output the maximum value for the current row
                System.out.println("ROW " + rowNumber + ": " + max);
                rowNumber++; // Increment row number
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
