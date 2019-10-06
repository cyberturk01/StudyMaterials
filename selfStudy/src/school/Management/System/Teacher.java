package school.Management.System;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
	}
	public void receiveSalary(int salary) {
		salaryEarned = getSalaryEarned() + salary;
		School.updateTotalMoneySpend(salary);
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salaryEarned=salary;
	}
	public int getSalaryEarned() {
		return salaryEarned;
	}
	@Override
	public String toString() {
		return "Teacher's name is: "+this.name+" Total salary earned so far "+ salaryEarned;
	}
}
