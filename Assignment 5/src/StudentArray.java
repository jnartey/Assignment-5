/**
 * @author Jacob Nartey
 * 2. Getting more advanced
 *
 */

public class StudentArray {
	
	public static void main(String[] args) {
		
		//Creating an array of student class of size 3
		Student[] studentArray = new Student[3];
		
		//Custom input class
		InputOutput inputOutput = new InputOutput();
		
		//Take input and print students and GPA Average
		inputOutput.prStrArrStudentsGpaAvg(inputOutput.inputStudentArray(studentArray));
	}
}
