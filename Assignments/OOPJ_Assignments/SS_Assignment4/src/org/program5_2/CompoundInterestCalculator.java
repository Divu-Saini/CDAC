package org.program5_2;

import org.program5_1.Values2;

import java.util.Scanner;



public class CompoundInterestCalculator {
	private Values2 interest;

	public CompoundInterestCalculator() {
		this.interest = new Values2();
	}

	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the principal amount (Rs): ");
		this.interest.setPrincipal(scanner.nextDouble());

		System.out.print("Enter the annual interest rate (in %): ");
		this.interest.setAnnualInterestRate(scanner.nextDouble());
		

		System.out.print("\"Enter the number of times the interest is compounded per year: ");
		this.interest.setNumberOfCompounds(scanner.nextInt());

		System.out.print("Enter the years: ");
		this.interest.setYears(scanner.nextInt());

		scanner.close();
	}

	public double calculateFutureValue() {
		double principal = interest.getPrincipal();
		double annualInterestRate = interest.getAnnualInterestRate();
		int numberOfCompounds = interest.getNumberOfCompounds();
		int years = interest.getYears();
		
		double ratePerPeriod = annualInterestRate / 100 / numberOfCompounds;
		double totalPeriods = numberOfCompounds * years;

		return principal * Math.pow(1 + ratePerPeriod, totalPeriods);
	}

	public void printRecord() {
		double futureValue = calculateFutureValue();
		double totalInterest = futureValue - interest.getPrincipal();

		System.out.printf("Future Value of the Investment: ₹%.2f%n", futureValue);
		System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterest);
	}

}
