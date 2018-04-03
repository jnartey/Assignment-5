/**
 * @author Jacob Nartey
 * Class to read input and print arrays
 *
 */

import java.util.Scanner;

public class InputOutput {
	
	Scanner reader;
	
	String message = "";
	
	public int inputInt(String message) {
		reader = new Scanner(System.in);
		System.out.print(message + "\n" + "> ");
		return reader.nextInt();
	}
	
	public double inputDouble(String message) {
		reader = new Scanner(System.in);
		System.out.print(message + "\n" + "> ");
		return reader.nextDouble();
	}
	
	public String inputStr(String message) {
		reader = new Scanner(System.in);
		System.out.print(message + "\n" + "> ");
		return reader.nextLine();
	}
	
	public String input(String message) {
		reader = new Scanner(System.in);
		System.out.print(message + "\n" + "> ");
		return reader.next();
	}
	
	public void inputClose() {
		reader = new Scanner(System.in);
		reader.close();
	}
	
	public void printSpace() {
		System.out.println("");
	}
	
	public Student[] inputStudentArray(Student[] studentArrayObj) {
		
		Student student = new Student();
				
		for(int index = 0; index < studentArrayObj.length; index++) {
			String name = inputStr("Student "+ (index + 1) +"'s name");
			student.setName(name);
			
			char grade = inputStr("Student "+ (index + 1) +"'s grade").charAt(0);
			student.setGrade(grade);
			
			double gpa = inputDouble("Student "+ (index + 1) +"'s GPA");
			student.setGpa(gpa);
			
			studentArrayObj[index] = student;
			studentArrayObj[index] = new Student(name, grade, gpa);
			printSpace();
		}
				
		return studentArrayObj;
	}
	
	public void prStrArrStudents (Student[] arrayObj) {
		int maxStrLength = 0;
		
		for(Student obj : arrayObj) {//Row
			if(obj.getName().length() > maxStrLength) {
				maxStrLength = obj.getName().length();
			}
		}
		
		System.out.printf("%-" + (maxStrLength+10) + "s" + "%-10s" + "%-10s", "Name", "Grade", "GPA");
		printSpace();
		
		for(Student obj : arrayObj) {
			System.out.printf("%-" + (maxStrLength + 10) + "s", obj.getName());
			System.out.printf("%-10s", obj.getGrade());
			System.out.printf("%-10s", obj.getGpa());
			
			System.out.println("");
		}
	}

	public void prStrArrStudentsGpaAvg (Student[] arrayObj) {
		int maxStrLength = 0;
		double sumGpa = 0;
		
		for(Student obj : arrayObj) {//Row
			if(obj.getName().length() > maxStrLength) {
				maxStrLength = obj.getName().length();
			}
		}
		
		System.out.printf("%-" + (maxStrLength+10) + "s" + "%-10s" + "%-10s", "Name", "Grade", "GPA");
		printSpace();
		
		for(Student obj : arrayObj) {
			//Getting sum of GPA;
			sumGpa += obj.getGpa();
			
			
			System.out.printf("%-" + (maxStrLength+10) + "s", obj.getName());
			System.out.printf("%-10s", obj.getGrade());
			System.out.printf("%-10s", obj.getGpa());
			
			printSpace();
		}
		
		printSpace();
		System.out.println("Average GPA of all "+ arrayObj.length +" students");
		System.out.println("-----------------------------");
		System.out.println(sumGpa/arrayObj.length);
	}
}
