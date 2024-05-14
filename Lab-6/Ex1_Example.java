import java.util.Scanner;
public class Ex1_Example {
    public static void methodWithON3TimeComplexity(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    // Do some constant-time operation here
                    System.out.println("Operation "+ ++count);
                }
            }
        }
    }

    public static void main(String[] args) {
        // int inputParameter = 5; // Example value for N
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int inputParameter = sc.nextInt();

        methodWithON3TimeComplexity(inputParameter);
    }
}
