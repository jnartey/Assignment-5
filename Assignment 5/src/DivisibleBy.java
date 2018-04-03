/**
 * @author Jacob Nartey
 * 6. Divisible by...
 *
 */
public class DivisibleBy {
	
	public DivisibleBy () {
		
	}
	
	public static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isDivisibleBy3(int n) {
		if(n % 3 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		//Printing numbers from 1 to 20
		for(int n = 1; n <= 20; n++) {
			
			//Check if it is even
			if(isEven(n) && !isDivisibleBy3(n)) {
				System.out.println(n + " <");
			}
			
			//Check if it is divisible by 3
			if(isDivisibleBy3(n) && !isEven(n)) {
				System.out.println(n + " =");
			}
			
			//Check if it is even and divisible by 3
			if(isEven(n) && isDivisibleBy3(n)) {
				System.out.println(n + " <=");
			}
			
			//Check if it is not even or divisible by 3
			if(!isEven(n) && !isDivisibleBy3(n)){
				System.out.println(n);
			}
		}
	}

}
