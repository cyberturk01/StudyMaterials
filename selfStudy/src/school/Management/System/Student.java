package school.Management.System;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	public Student(int id, String name, int grade) {
		
		feesPaid=0;
		feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
						
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void payFees(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	public int getRemainingFees() {
		return feesTotal-=feesPaid;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getGrade() {
		return this.grade;
	}
	public int getFeesPaid() {
		return this.feesPaid;
	}
	public int getFeesTotal() {
		return this.feesTotal;
	}

	@Override
	public String toString() {
		return "Student's name is: "+this.name+" Total fees paid so far "+ feesPaid;
	}
	


	
}
