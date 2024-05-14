public class Ex3_DivisorCalc {
    // Method to find the greatest common divisor using Euclid's algorithm
    public static int gcd(int num1, int num2) {
        // Base case: if num2 is zero, return num1
        if (num2 == 0) {
            return num1;
        }
        
        // Recursive case
        return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) {
        // Test cases
        int num1 = 48;
        int num2 = 18;
        
        // Calculate and display the greatest common divisor
        int gcdResult = gcd(num1, num2);
        System.out.println("Greatest common divisor of " + num1 + " and " + num2 + " is: " + gcdResult);
    }
}
