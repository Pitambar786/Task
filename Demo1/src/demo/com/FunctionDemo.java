package demo.com;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Student student = new Student("Ram",65,1);
		// TODO Auto-generated method stub
		Function<Student,Student> studentFunc = s->{
			if(s.getMarks()>60) {
				student.setDivision("first division");
			}
			else if(s.getMarks()>=50 && student.getMarks()<60) {
				student.setDivision("second div");
			}
			return s;
		};
	Student s = checkDivision(studentFunc,student);
	System.out.println(s.getDivision());

	}
	
	public static Student checkDivision(Function<Student,Student>s,Student student){
		
		return s.apply(student);
	}

}
class Student {
	private String name;
	private int marks;
	private int rollNo;
	private String division;
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public Student(String name,int marks,int rollNo){
		this.name=name;
		this.marks=marks;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
