package org.program8_2;


import org.program8_1.Values5;

import java.util.Scanner;



public class TollBoothRevenueManager {
	private Values5 toll;

	public TollBoothRevenueManager() {
		this.toll = new Values5();
	}

	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the toll rate for Car(Rs): ");
		this.toll.setCarRate(scanner.nextDouble());

		System.out.print("Enter the toll rate for Truck(Rs): ");
		this.toll.setTruckRate(scanner.nextDouble());

		System.out.print("Enter the toll rate for Motorcycles(Rs): ");
		this.toll.setMotorcycleRate(scanner.nextDouble());
		
		System.out.print("Enter the number of Cars: ");
		this.toll.setCars(scanner.nextInt());

		System.out.print("Enter the number of Trucks: ");
		this.toll.setTrucks(scanner.nextInt());

		System.out.print("Enter the number of Motorcycles: ");
		this.toll.setMotorcycles(scanner.nextInt());


		scanner.close();
	}

	 public double calculateRevenue() {
	        double totalRevenue = (toll.getCars() * toll.getCarRate()) + (toll.getTrucks() * toll.getTruckRate()) + (toll.getMotorcycles() * toll.getMotorcycleRate());
	        return totalRevenue;
	    }
	
	 public void printRecord() {
	        double totalRevenue = calculateRevenue();
	        int totalVehicles = toll.getCars() + toll.getTrucks() + toll.getMotorcycles();

	        System.out.printf("Total Number of Vehicles: %d%n", totalVehicles);
	        System.out.printf("Total Revenue Collected: ₹%.2f%n", totalRevenue);
	    }

}
