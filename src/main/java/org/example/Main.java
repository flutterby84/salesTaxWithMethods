package org.example;
//Meghan Munford
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Setup any variables you need and call your methods
         * here in the main method */
        double inputPurchasePrice = inputPurchasePrice();
        double stateTaxRate = 0.04;
        double countyTaxRate = 0.02;
        double stateTax = calculateTax(inputPurchasePrice, stateTaxRate);
        double countyTax = calculateTax(inputPurchasePrice, countyTaxRate);
        double totalTax = stateTax + countyTax;
        double totalPrice = calculateTotal(inputPurchasePrice, totalTax);
        displayTotals(inputPurchasePrice, stateTax, countyTax, totalTax, totalPrice);
    }
    public static double inputPurchasePrice(){
        Scanner scanner = new Scanner(System.in);
        //create scanner obj first to allow proper capture of input
        System.out.print("Enter your purchase price:$ ");
        /* */
       return Double.parseDouble(scanner.nextLine());
    }

    /* Write a method called calculateTax that
     * accepts price and tax rate as parameters and
     * calculates and returns the tax
     * */
    public static double calculateTax(double price, double taxRate) {
        double tax = price * taxRate;
        return tax;
    }

    /* Write a method called calculateTotal that
     * accepts two double values nd calculates and
     * returns the total
     * */
    public static double calculateTotal(double price, double totalTax) {
        return price + totalTax;
    }
    /* Write a method called displayTotals that takes
     *  purchasePrice, stateTax, countyTax, totalTax and totalPrice
     *  as parameters. Output using decimal formatter amd printf */
    public static void displayTotals(double inputPurchasePrice, double stateTax, double countyTax, double totalTax, double totalPrice) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("Purchase Price:$%.2f\n", inputPurchasePrice);
        System.out.printf("State Tax:$%.2f\n", stateTax);
        System.out.printf("County Tax:$%.2f\n", countyTax);
        System.out.printf("Total Tax:$%.2f\n", totalTax);
        System.out.printf("Total Price:$%.2f\n", totalPrice);
    // no return here, so it goes to void
    }
}



