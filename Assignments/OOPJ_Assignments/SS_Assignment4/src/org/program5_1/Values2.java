package org.program5_1;

public class Values2 {

	private double principal;
	private double annualInterestRate;
	private int numberOfCompounds;
	private int years;
	
	public Values2() {
		this(0.0, 0.0, 0, 0);
	}

	public Values2(double principal, double annualInterestRate, int years, int numberOfCompounds) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
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
	
	public int getNumberOfCompounds() {
		return numberOfCompounds;
	}

	public void setNumberOfCompounds(int numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	public String toString() {
		return "Values[ principal: " + principal +", annualInterestRate: " +annualInterestRate+", numberOfCompounds: " +numberOfCompounds+", years " + years + "]";
	}

}
