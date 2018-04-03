/**
 * @author Jacob Nartey
 * 3.Student Advanced
 *
 */

public class StudentArrayAdvanced {
	
	public static void main(String[] args) {
		
		//Instantiating class InputOutput
		InputOutput inputOutput = new InputOutput();
		int numStudents = inputOutput.inputInt("Input the number of students you would like to enter");
		
		//Creating an array of student class of size numStudents
		Student[] studentArray = new Student[numStudents];
		
		//Take input and print students and GPA Average
		inputOutput.prStrArrStudentsGpaAvg(inputOutput.inputStudentArray(studentArray));
	}
}
