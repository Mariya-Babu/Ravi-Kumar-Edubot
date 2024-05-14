public class Ex2_Account {
    private static int numAccounts = 0;

    // Constructor method increments numAccounts each time a new Account object is created
    public Ex2_Account() {
        numAccounts++;
    }

    // Static method to get the number of accounts
    public static int getNumAccounts() {
        return numAccounts;
    }

    public static void main(String[] args) {
        // Create a few Account objects
        Ex2_Account acc1 = new Ex2_Account();
        Ex2_Account acc2 = new Ex2_Account();
        Ex2_Account acc3 = new Ex2_Account();

        // Print out the number of accounts
        System.out.println("Number of accounts: " + Ex2_Account.getNumAccounts());
    }
}
