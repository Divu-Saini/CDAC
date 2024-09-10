package org.package3;

import java.util.Scanner;

class BMITracker {

    private double weight;
    private double height;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (in kg): ");
        weight = scanner.nextDouble();

        System.out.print("Enter height (in meters): ");
        height = scanner.nextDouble();

        scanner.close();
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public void printRecord() {
        double bmi = calculateBMI();
        String classification = classifyBMI(bmi);

        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Classification: " + classification);
    }
}

public class BMITest {
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.printRecord();
    }
}
