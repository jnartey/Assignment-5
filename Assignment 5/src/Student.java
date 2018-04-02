/**
 * @author Jacob Nartey
 * 1. Students
 *
 */

public class Student {
	private String name;
	char grade;
	private double gpa;
	
	public Student(String name, char grade, double gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	public Student() {
		this.name = null;
		this.grade = ' ';
		this.gpa = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		//My input class
		InputOutput read = new InputOutput();
		InputOutput print = new InputOutput();
		
		student1.setName(read.inputStr("Student 1's name"));
		student1.setGrade(read.inputStr("Student 1's grade").charAt(0));
		student1.setGpa(read.inputDouble("Student 1's GPA"));
		System.out.println("");
		student2.setName(read.inputStr("Student 2's name"));
		student2.setGrade(read.inputStr("Student 2's grade").charAt(0));
		student2.setGpa(read.inputDouble("Student 2's GPA"));
		System.out.println("");
		student3.setName(read.inputStr("Student 3's name"));
		student3.setGrade(read.inputStr("Student 3's grade").charAt(0));
		student3.setGpa(read.inputDouble("Student 3's GPA"));
		
		Student[] studentArray = {student1, student2, student3};
		print.prStrArrStudents(studentArray);
		System.out.println("");
		System.out.println("Average GPA of all three students");
		System.out.println((student1.getGpa() + student1.getGpa() + student1.getGpa())/3);
		
	}
}
