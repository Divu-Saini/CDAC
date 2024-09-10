package org.program8_1;

public class Values5 {

	private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int cars;
    private int trucks;
    private int motorcycles;
	
	public Values5() {
		this(0.0, 0.0, 0.0,  0, 0, 0);
	}

	public Values5(double carRate, double truckRate, double motorcycleRate, int cars, int trucks, int motorcycles) {
		this.carRate = carRate;
		this.truckRate = truckRate;
		this.motorcycleRate = motorcycleRate;
		this.cars = cars;
		this.trucks = trucks;
		this.motorcycles = motorcycles;
	}

	
	public double getCarRate() {
		return carRate;
	}

	public void setCarRate(double carRate) {
		this.carRate = carRate;
	}

	public double getTruckRate() {
		return truckRate;
	}

	public void setTruckRate(double truckRate) {
		this.truckRate = truckRate;
	}

	public double getMotorcycleRate() {
		return motorcycleRate;
	}

	public void setMotorcycleRate(double motorcycleRate) {
		this.motorcycleRate = motorcycleRate;
	}

	public int getCars() {
		return cars;
	}

	public void setCars(int cars) {
		this.cars = cars;
	}

	public int getTrucks() {
		return trucks;
	}

	public void setTrucks(int trucks) {
		this.trucks = trucks;
	}

	public int getMotorcycles() {
		return motorcycles;
	}

	public void setMotorcycles(int motorcycles) {
		this.motorcycles = motorcycles;
	}

	public String toString() {
		return "[ carRate: " + carRate +", truckRate: " +truckRate+", motorcycleRate " + motorcycleRate+ " cars " + cars +", trucks: " +trucks+", motorcycles " + motorcycles + "]";
	}

}
