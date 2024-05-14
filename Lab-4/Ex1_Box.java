public class Ex1Box {
    private int width;
    private int height;
    
    public Ex1Box(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void printBox() {
        printBox('*');
    }
    
    public void printBox(char c) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Ex1Box box = new Ex1Box(5, 3);
        System.out.println("Printing box with *:");
        box.printBox(); // Invoke the first version of printBox
        System.out.println("\nPrinting box with #:");
        box.printBox('#'); // Invoke the second version of printBox
    }
}
