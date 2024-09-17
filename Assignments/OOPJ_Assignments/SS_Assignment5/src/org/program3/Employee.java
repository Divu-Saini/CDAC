package org.program3;

import java.util.Scanner;

public class Employee {

	public int Empid;
	public String name;
	public float salary;

	public static int totalemployee;
	public static double salaryexpense;

	public Employee(int empid, String name, float salary) {

		this.Empid = empid;
		this.name = name;
		this.salary = salary;
		totalemployee += 1;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static int getTotalemployee() {
		return totalemployee;
	}

	public static void setTotalemployee(int totalemployee) {
		Employee.totalemployee = totalemployee;
	}

	public static double getSalaryexpense() {
		return salaryexpense;
	}

	public static void setSalaryexpense(double salaryexpense) {
		Employee.salaryexpense = salaryexpense;
	}

	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", name=" + name + ", salary=" + salary + "]";
	}

	public static int getTotalEmployees() {

		return totalemployee;

	}

	public static void applyRaise(double percentage) {

		salaryexpense += salaryexpense * (percentage / 100);

	}

	public static double calculateTotalSalaryExpense() {

		return salaryexpense;

	}

	public void updateSalary(double newSalary) {
		if (newSalary >= 0) {
			salaryexpense -= this.salary;
			this.salary = (float) newSalary;
			salaryexpense += newSalary;
		}
	}

	public void menulist() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nMenu:");
		System.out.println("1. Add Employee");
		System.out.println("2. Apply Raise to All Employees");
		System.out.println("3. Show Total Salary Expense");
		System.out.println("4. Update Employee Salary");
		System.out.println("5. Show Total Number of Employees");
		System.out.println("6. Display All Employees");
		System.out.println("7. Exit");
		System.out.print("Choose an option: ");
		int choice = scanner.nextInt();
		scanner.nextLine();
	}
         
}
