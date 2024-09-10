package org.program6_2;

import org.program6_1.*;

import java.util.Scanner;


public class BMITracker {

    private Values3 bmi;
    
    public BMITracker() {
    	this.bmi = new Values3();
    }  
    
    public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the weight: ");
		this.bmi.setWeight(scanner.nextDouble());

		System.out.print("Enter the height: ");
		this.bmi.setHeight(scanner.nextDouble());

        scanner.close();
    }

    public double calculateBMI() {
        return bmi.getWeight() / (bmi.getHeight() * bmi.getHeight());
    }

    public String classifyBMI(double bmindex) {
        if (bmindex < 18.5) {
            return "Underweight";
        } else if (bmindex < 24.9) {
            return "Normal weight";
        } else if (bmindex < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public void printRecord() {
        double bmindex = calculateBMI();
        String classification = classifyBMI(bmindex);

        System.out.printf("BMI: %.2f%n", bmindex);
        System.out.println("Classification: " + classification);
    }
}

