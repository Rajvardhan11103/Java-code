/* PS7 :- Write a program in java which take input as Cost Price and Selling Price and calculate profit
and loss */ 

import java.util.Scanner;

class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        double profitOrLoss = calculateProfitOrLoss(costPrice, sellingPrice);
        if (profitOrLoss > 0) {
            System.out.println("Profit amount: " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss amount: " + (-profitOrLoss));
        } else {
            System.out.println("No profit, no loss.");
        }
 
    }

    // Helper function to calculate profit or loss
    static double calculateProfitOrLoss(double costPrice, double sellingPrice) {
        return sellingPrice - costPrice;
    }
}
