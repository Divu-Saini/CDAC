package org.package3;

import java.util.Scanner;

 class LoanAmortizationCalculator {

	private double principal;
	private double annualInterestRate;
	private int loanTerm;

	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the principal amount (Rs): ");
		principal = scanner.nextDouble();

		System.out.print("Enter the annual interest rate (in %): ");
		annualInterestRate = scanner.nextDouble();

		System.out.print("Enter the loan term (in years): ");
		loanTerm = scanner.nextInt();
		
		 scanner.close();
	}

	public double calculateMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 12 / 100;
		System.out.println(monthlyInterestRate);

		int numberOfMonths = loanTerm * 12;

		double numerator = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfMonths);
		double denominator = Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1;
		System.out.println(numerator);
		System.out.println(denominator);

		double monthlyPayment = principal * (numerator / denominator);

		return monthlyPayment;
	}

	public void printRecord() {
		double monthlyPayment = calculateMonthlyPayment();
		double totalAmountPaid = monthlyPayment * loanTerm * 12;

		System.out.printf("Monthly Payment: Rs%.2f%n", monthlyPayment);
		System.out.printf("Total Amount Paid Over the Life of the Loan: Rs%.2f%n", totalAmountPaid);
	}

}

public class LoanAmortizationTest {
	public static void main(String[] args) {

		LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();

		calculator.acceptRecord();

		calculator.printRecord();
	}
}
