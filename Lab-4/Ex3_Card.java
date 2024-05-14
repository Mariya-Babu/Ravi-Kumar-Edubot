import java.util.Random;

public class Ex3_Card {
    // Constants for the number of suits and face values
    private static final int NUM_SUITS = 4;
    private static final int NUM_VALUES = 13;

    // Array of suit names
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};

    // Array of face value names
    private static final String[] VALUES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    private int suit; // Suit of the card (0 to 3)
    private int value; // Face value of the card (0 to 12)

    // Constructor
    public Ex3_Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    // Getters for suit and value
    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    // toString method to represent the card as a String
    @Override
    public String toString() {
        return VALUES[value] + " of " + SUITS[suit];
    }

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Deal five random cards with replacement
        System.out.println("Dealing five random cards with replacement:");
        for (int i = 0; i < 5; i++) {
            // Generate random suit and value
            int randomSuit = random.nextInt(NUM_SUITS);
            int randomValue = random.nextInt(NUM_VALUES);

            // Create a CardEx3 object with the random suit and value
            Ex3_Card card = new Ex3_Card(randomSuit, randomValue);

            // Print the dealt card
            System.out.println("Card " + (i + 1) + ": " + card);
        }
    }
}
