package org.package3;

import java.util.Scanner;

class TollBoothRevenueManager {

    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int cars;
    private int trucks;
    private int motorcycles;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the toll rate for Car (₹): ");
        carRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Truck (₹): ");
        truckRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Motorcycle (₹): ");
        motorcycleRate = scanner.nextDouble();

        System.out.print("Enter the number of Cars: ");
        cars = scanner.nextInt();

        System.out.print("Enter the number of Trucks: ");
        trucks = scanner.nextInt();

        System.out.print("Enter the number of Motorcycles: ");
        motorcycles = scanner.nextInt();

        scanner.close();
    }

    public double calculateRevenue() {
        double totalRevenue = (cars * carRate) + (trucks * truckRate) + (motorcycles * motorcycleRate);
        return totalRevenue;
    }

    public void printRecord() {
        double totalRevenue = calculateRevenue();
        int totalVehicles = cars + trucks + motorcycles;

        System.out.printf("Total Number of Vehicles: %d%n", totalVehicles);
        System.out.printf("Total Revenue Collected: ₹%.2f%n", totalRevenue);
    }
}

public class TollBoothTest {
    public static void main(String[] args) {
        TollBoothRevenueManager manager = new TollBoothRevenueManager();
        manager.acceptRecord();
        manager.printRecord();
    }
}
