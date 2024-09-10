package org.program4_2;


import org.program4_1.Values;

import java.util.Scanner;



public class LoanAmortizationCalculator {
	private Values loan;

	public LoanAmortizationCalculator() {
		this.loan = new Values();
	}

	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the principal amount (Rs): ");
		this.loan.setPrincipal(scanner.nextDouble());

		System.out.print("Enter the annual interest rate (in %): ");
		this.loan.setAnnualInterestRate(scanner.nextDouble());

		System.out.print("Enter the loan term (in years): ");
		this.loan.setLoanTerm(scanner.nextInt());

		scanner.close();
	}

	public double calculateMonthlyPayment() {
		
		double principal = loan.getPrincipal();
		double annualInterestRate = loan.getAnnualInterestRate();
		int loanTerm = loan.getLoanTerm();
		
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
		double totalAmountPaid = monthlyPayment * loan.getLoanTerm() * 12;

		System.out.printf("Monthly Payment: Rs%.2f%n", monthlyPayment);
		System.out.printf("Total Amount Paid Over the Life of the Loan: Rs%.2f%n", totalAmountPaid);
	}

}
