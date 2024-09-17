package org.program;

public class InstanceCounter {
	private static int count = 0;

	public InstanceCounter() {
		count++;

	}

	public static int getInsCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return "InstanceCounter: Total Instance = " + count;
		}
		
	

	public static void main(String[] args) {

		InstanceCounter c = new InstanceCounter();
		InstanceCounter c1 = new InstanceCounter();
		InstanceCounter c2 = new InstanceCounter();
		InstanceCounter c3 = new InstanceCounter();

        System.out.println("Total instances created: " + InstanceCounter.getInsCount());

	}

}
