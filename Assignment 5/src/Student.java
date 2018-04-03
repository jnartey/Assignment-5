/**
 * @author Jacob Nartey
 * Student Class
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
}
