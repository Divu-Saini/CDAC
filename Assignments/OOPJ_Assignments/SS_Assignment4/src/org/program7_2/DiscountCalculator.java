package org.program7_2;

import org.program7_1.Values4;

import java.util.Scanner;


public class DiscountCalculator{

    private Values4 dis;
    
    public DiscountCalculator() {
    	this.dis = new Values4();
    }  
    
    public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the originalPrize ");
		this.dis.setOriginalPrice(scanner.nextDouble());

		System.out.print("Enter the discountPrize ");
		this.dis.setDiscountRate(scanner.nextDouble());

        scanner.close();
    }

    public double calculateDiscount() {
        return dis.getDiscountRate() * (dis.getDiscountRate() / 100);
    }

    public void printRecord() {
        double discountAmount = calculateDiscount();
        double finalPrice = dis.getOriginalPrice() - dis.getDiscountRate();

        System.out.printf("Discount Amount: ₹%.2f%n", discountAmount);
        System.out.printf("Final Price: ₹%.2f%n", finalPrice);
    }

}

