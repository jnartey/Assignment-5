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
	
	public void printStrArray (String[][] arrayObj) {
		int maxStrLength = 0;
		int count = 1;
		
		for(String[] row : arrayObj) {//Row
			for(String column : row) {//Columns
				if(count == 1) {
					if(column.length() > maxStrLength) {
						maxStrLength = column.length();
					}
					
					System.out.printf("%" + maxStrLength + "s", column);
				}else {
					System.out.printf("%5s", column);
				}				
			}
			System.out.println("\n");
			
			count++;
		}
	}
	
	public void prStrArr2DStudents (Student[][] arrayObj) {
		int maxStrLength = 0;
		int count = 1;
		
		for(Student[] row : arrayObj) {//Row
			for(Student column : row) {//Columns
				if(count == 1) {
					if(column.getName().length() > maxStrLength) {
						maxStrLength = column.getName().length();
					}
					
					System.out.printf("%" + maxStrLength + "s", column);
				}else {
					System.out.printf("%5s", column);
				}				
			}
			System.out.println("\n");
			
			count++;
		}
	}
	
	public void prStrArrStudents (Student[] arrayObj) {
		int maxStrLength = 0;
		int count = 1;
		
		for(Student obj : arrayObj) {//Row
			if(count == 1) {
				if(obj.getName().length() > maxStrLength) {
					maxStrLength = obj.getName().length();
				}
				
				System.out.printf("%" + maxStrLength + "s", obj.getName());
				System.out.printf("%6s", obj.getGrade());
				System.out.printf("%6s", obj.getGpa());
			}else {
				System.out.printf("%" + maxStrLength + "s", obj.getName());
				System.out.printf("%6s", obj.getGrade());
				System.out.printf("%6s", obj.getGpa());
			}
			
			System.out.println("");
			
			count++;
		}
	}
}
