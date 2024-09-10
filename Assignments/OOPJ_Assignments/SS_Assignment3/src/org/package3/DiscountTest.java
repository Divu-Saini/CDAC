package org.package3;

import java.util.Scanner;

class DiscountCalculator {

    private double originalPrice;
    private double discountRate;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price (₹): ");
        originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        discountRate = scanner.nextDouble();

        scanner.close();
    }

    public double calculateDiscount() {
        return originalPrice * (discountRate / 100);
    }

    public void printRecord() {
        double discountAmount = calculateDiscount();
        double finalPrice = originalPrice - discountAmount;

        System.out.printf("Discount Amount: ₹%.2f%n", discountAmount);
        System.out.printf("Final Price: ₹%.2f%n", finalPrice);
    }
}

public class DiscountTest {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        calculator.acceptRecord();
        calculator.printRecord();
    }
}