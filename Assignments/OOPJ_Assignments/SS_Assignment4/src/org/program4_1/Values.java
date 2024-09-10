package org.program4_1;

public class Values {

	private double principal;
	private double annualInterestRate;
	private int loanTerm;
	
	public Values() {
		this(0.0, 0.0, 0);
	}

	public Values(double principal, double annualInterestRate, int loanTerm) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.loanTerm = loanTerm;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public String toString() {
		return "[ principal: " + principal +", annualInterestRate: " +annualInterestRate+", loanTerm " + loanTerm + "]";
	}

}
