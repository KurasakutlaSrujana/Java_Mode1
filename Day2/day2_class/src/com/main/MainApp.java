package com.main;

import com.connector.General;
import com.student.Student;

public class MainApp {
	
	 
	
	public static void main(String[] args) {
		 General general = new General();
		 Student student1 = new Student();
		 Student student2 = new Student();
		 general.setDetails(student1,101,"srujana","kurasakutla",21,'F',85,90,"CS");
		 general.setDetails(student2,103,"sai","kumar",23,'M',85,90,"electrical");
		 System.out.println("Full name of student :" +general.fullName(student1) );
		 System.out.println("Age of the Student :" +student1.getAge());
		 System.out.println("Gender of the student :"+student1.getGender());
		 System.out.println("Total marks of the student :"+general.totalMarks(student1));
		 System.out.println("Average of the student :"+general.average(student1));
		 
		 
		 System.out.println("The complete details of the student:");
		 System.out.println("Student number"+student1.getStudentNumber());
		 System.out.println("First name "+student1.getFirstName());
		 System.out.println("Last name "+student1.getLastName());
		 System.out.println("Age "+student1.getAge());
		 System.out.println("Gender "+student1.getGender());
		 System.out.println(general.searchById(student2,103));
         System.out.println(general.searchByName(student1,"srujana"));
         System.out.println(general.searchMajor(student1, student2));
	}
	

}
