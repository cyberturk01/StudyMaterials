package school.Management.System;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher lizzy= new Teacher(1, "Lizzy", 500);
		Teacher mellisa= new Teacher(2, "Mellisa", 400);
		Teacher hale= new Teacher(3, "Hale", 600);
		List<Teacher> teacherList=new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(hale);
		Student nuran= new Student(1, "Nuran", 5);
		Student gokhan= new Student(2, "Gokhan", 4);
		Student zeynep= new Student(3, "Zeynep", 3);
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(nuran);
		studentList.add(gokhan);
		studentList.add(zeynep);
		
		Teacher megan= new Teacher(4, "Megan", 750);
		Student ali= new Student(4, "Ali", 4);
		School ghs= new School(teacherList, studentList);
		ghs.addTeacher(megan);
		
		nuran.payFees(5000);
		gokhan.payFees(4000);
		zeynep.payFees(7000);
		System.out.println("GHS earned $:"+ghs.getTotalMoneyEarned());
		
		
		System.out.println("----Making SCHOOL PAY SALARY-----");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("School has spent for salary to "+lizzy.getName()+
							" and now has "+ghs.getTotalMoneyEarned());
		hale.receiveSalary(hale.getSalary());
		System.out.println("School has spent for salary to "+hale.getName()+
				" and now has "+ghs.getTotalMoneyEarned());
		
		System.out.println(nuran);
		System.out.println(hale);
	}

}
