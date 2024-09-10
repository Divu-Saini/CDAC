package org.package3;

import java.util.Scanner;

class CompoundInterestCalculator {

	private double principal;
	private double annualInterestRate;
	private int numberOfCompounds;
	private int years;

	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the initial investment amount (₹): ");
		principal = scanner.nextDouble();

		System.out.print("Enter the annual interest rate (in %): ");
		annualInterestRate = scanner.nextDouble();

		System.out.print("Enter the number of times the interest is compounded per year: ");
		numberOfCompounds = scanner.nextInt();

		System.out.print("Enter the investment duration (in years): ");
		years = scanner.nextInt();
		scanner.close();
	}

	public double calculateFutureValue() {
		double ratePerPeriod = annualInterestRate / 100 / numberOfCompounds;
		double totalPeriods = numberOfCompounds * years;

		return principal * Math.pow(1 + ratePerPeriod, totalPeriods);
	}

	public void printRecord() {
		double futureValue = calculateFutureValue();
		double totalInterest = futureValue - principal;

		System.out.printf("Future Value of the Investment: ₹%.2f%n", futureValue);
		System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterest);
	}
}

public class CompoundInterestTest {
	public static void main(String[] args) {
		CompoundInterestCalculator calculator = new CompoundInterestCalculator();
		calculator.acceptRecord();
		calculator.printRecord();
	}
}