package org.program7_1;


public class Values4{

	private double originalPrice;
	private double discountRate;
	
	public Values4() {
		
	}
	

	public double getOriginalPrice() {
		return originalPrice;
	}


	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public String toString() {
		return "[ originalPrice: " + originalPrice + ", discountRate: " + discountRate + "]";
	}

}
