import java.util.Scanner;

public class Assig2_Figures {

    // Method to print a box of given size
    public static void printBox(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    // Method to print a diamond of given size
    public static void printDiamond(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("X");
            }
            System.out.println();
        }
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    // Method to print an X of given size
    public static void printX(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || j == size - i - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the figure (must be odd)
        int size;
        do {
            System.out.print("Enter the size of the figure (odd number): ");
            size = scanner.nextInt();
        } while (size % 2 == 0);

        // Display the menu and wait for user input
        int option;
        do {
            System.out.println("MENU:");
            System.out.println("1. Print box");
            System.out.println("2. Print diamond");
            System.out.println("3. Print X");
            System.out.println("4. Quit program");
            System.out.print("Please select an option: ");
            option = scanner.nextInt();

            // Perform actions based on user input
            switch (option) {
                case 1:
                    System.out.println("Printing box:");
                    printBox(size);
                    break;
                case 2:
                    System.out.println("Printing diamond:");
                    printDiamond(size);
                    break;
                case 3:
                    System.out.println("Printing X:");
                    printX(size);
                    break;
                case 4:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Invalid option! Please select again.");
            }
        } while (option != 4);

        scanner.close();
    }
}
