import java.util.Scanner;

class StarPatternHourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the hourglass (odd number): ");
        int height = scanner.nextInt();

        if (height % 2 == 0) {
            System.out.println("Please enter an odd number for the height.");
        } else {
            printHourglass(height);
        }
 
    }

    static void printHourglass(int height) {
        int halfHeight = height / 2;

        // Print top half
        for (int i = 1; i <= halfHeight + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print bottom half
        for (int i = halfHeight; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


