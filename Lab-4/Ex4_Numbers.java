public class Ex4_Numbers {
    public static void nextLargest(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int nextLargest = Integer.MAX_VALUE; // Initialize nextLargest to maximum value
            
            // Iterate through the array to find the next largest number
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    nextLargest = numbers[j];
                    break;
                }
            }
            
            // Print the number and its next largest value
            System.out.println(numbers[i] + ": " + (nextLargest == Integer.MAX_VALUE ? "2147483647" : nextLargest));
        }
    }

    public static void main(String[] args) {
        // Test the nextLargest method with an array
        int[] array = {78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19};
        System.out.println("Output:");
        nextLargest(array);
    }
}
