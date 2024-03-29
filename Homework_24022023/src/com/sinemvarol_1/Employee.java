package com.sinemvarol_1;

public class Employee {

	private String name;
	private double salary;
	private double workHours;
	private int hireYear;
	private double tax;
	private double bonus;
	private double salaryRaise;

	public Employee(String name, double salary, double workHours, int hireYear) {
		super();
		this.name = setName(name);
		this.salary = setSalary(salary);
		this.workHours = setWorkHours(workHours);
		this.hireYear = setHireYear(hireYear);
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		if (name.length() >= 2) {
			this.name = name;
		} else {
			System.err.println("Employee name cannot be less than two characters.");
		}
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public double setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
		} else {
			System.err.println("Employee salary cannot be less than zero.");
		}
		return salary;
	}

	public double getWorkHours() {
		return workHours;
	}

	public double setWorkHours(double workHours) {
		if (workHours >= 0) {
			this.workHours = workHours;
		} else {
			System.out.println("Work hours cannot be less than zero.");
		}
		return workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public int setHireYear(int hireYear) {
		if (hireYear >= 1923) {
			this.hireYear = hireYear;
		} else {
			System.err.println("Hire year cannot set before 1923.");
		}
		return hireYear;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalaryRaise() {
		return salaryRaise;
	}

	public void setSalaryRaise(double salaryRaise) {
		this.salaryRaise = salaryRaise;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear
				+ ", tax=" + tax + ", bonus=" + bonus + ", salaryRaise=" + salaryRaise + "]";
	}

}
