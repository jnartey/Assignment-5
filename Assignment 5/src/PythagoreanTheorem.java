/**
 * @author Jacob Nartey
 * 4. Pythagorean Theorum
 */

import static java.lang.Math.sqrt;

public class PythagoreanTheorem {
	
	//Constructor
	public PythagoreanTheorem() {
		
	}
	
	//Pythagorean Theorem calculation
	public double hypotenuse(double a, double b) {
		return sqrt((a*a) + (b*b));
	}
	
	public static void main(String[] args) {
		
		//Creating instance of PythagoreanTheorem class
		PythagoreanTheorem pythagoras = new PythagoreanTheorem();
		
		//3 sample calculation
		double value1 = pythagoras.hypotenuse(4, 3);
		double value2 = pythagoras.hypotenuse(16, 3);
		double value3 = pythagoras.hypotenuse(18, 13);
		
		//Printing results
		System.out.println("Pythagorean Theorem");
		System.out.println("-------------------");
		System.out.println("Pythagorean Theorem of sides 4 & 3 is " + value1);
		System.out.println("Pythagorean Theorem of sides 16 & 3 is " + value2);
		System.out.println("Pythagorean Theorem of sides 18 & 13 is " + value3);
	}
	
	

}
