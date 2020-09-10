package com.connector;

import com.student.Student;

public class General {
	public Student[] students = new Student[2];
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void setDetails(Student student,int studentNumber,String firstName,String lastName,int age,char gender,float engMarks,float mathMarks,String major) {
	
		student.setStudentNumber(studentNumber);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setAge(age);
		student.setGender(gender);
		student.setEngMarks(engMarks);
		student.setMathMarks(mathMarks);
		student.setMajor(major);
	}
	
	public String fullName(Student s) {
		return s.getFirstName() + " "+s.getLastName();
	}
	public float totalMarks(Student s) {
		return s.getEngMarks()+s.getMathMarks();
	}
	public float average(Student s) {
		return totalMarks(s)/2;
	}
	
	 public String searchById(Student student ,int number) {
			if(number ==student.getStudentNumber() ) {
				return student.getFirstName()+ " is found";
			}
			else
				return "no data";
		}
	 public String searchByName(Student student, String search) {
			if(student.getFirstName().equals(search)) {
				return search+ " is found";
			}
			else
				return "no data";
		}
	 public String searchMajor(Student s1, Student s2) {
		 if(s1.getMajor().equals("CS")) {
			 return s1.getFirstName()+" is CS";
		 }
		 if(s2.getMajor().equals("CS")){
             return s2.getFirstName()+" is CS";
	     }
		 return null;
		 
	
}
}
