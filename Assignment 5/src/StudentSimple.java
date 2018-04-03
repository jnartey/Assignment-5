/**
 * @author Jacob Nartey
 * 1.Student simple
 */

public class StudentSimple {
	public static void main(String[] args) {
		
		//3 instances of Student class
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		//Instantiating class InputOutput
		InputOutput inputOutput = new InputOutput();
		
		//Taking student input
		student1.setName(inputOutput.inputStr("Student 1's name"));
		student1.setGrade(inputOutput.inputStr("Student 1's grade").charAt(0));
		student1.setGpa(inputOutput.inputDouble("Student 1's GPA"));
		inputOutput.printSpace();
		student2.setName(inputOutput.inputStr("Student 2's name"));
		student2.setGrade(inputOutput.inputStr("Student 2's grade").charAt(0));
		student2.setGpa(inputOutput.inputDouble("Student 2's GPA"));
		inputOutput.printSpace();
		student3.setName(inputOutput.inputStr("Student 3's name"));
		student3.setGrade(inputOutput.inputStr("Student 3's grade").charAt(0));
		student3.setGpa(inputOutput.inputDouble("Student 3's GPA"));
		inputOutput.printSpace();
		
		//Storing student objects into student array
		Student[] studentArray = {student1, student2, student3};
		
		//Calling prStrArrStudents method from InputOutput class to print student array
		inputOutput.prStrArrStudents(studentArray);
		inputOutput.printSpace();
		
		//Calculate students GPA average and print results
		System.out.println("Average GPA of all 3 students");
		System.out.println("-----------------------------");
		System.out.println((student1.getGpa() + student2.getGpa() + student3.getGpa())/3);
		
	}
}
