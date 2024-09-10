package org.program6_1;


public class Values3{

	private double weight;
	private double height;
	
	public Values3() {
		this(0.0, 0.0);
	}

	public Values3(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
			

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	public String toString() {
		return "[ weight: " + weight + ", height: " + height + "]";
	}

}
