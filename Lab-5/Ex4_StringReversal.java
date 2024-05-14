public class Ex4_StringReversal {
    // Method to reverse a string using recursion
    public static String reverseString(String s) {
        // Base case: if the string is empty or has only one character, return the string
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }
        
        // Recursive case: reverse the substring starting from the second character and concatenate it with the first character
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        // Test case
        String originalString = "Hello, World!";
        
        // Reverse the string and display the result
        String reversedString = reverseString(originalString);
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}
