package manager;

public class Employee {
	private String name;
	private double salary;
	private int hours;
	
	public Employee(String name, double salary, int hours) {
		super();
		this.name = name;
		this.salary = salary;
		this.hours = hours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
}
