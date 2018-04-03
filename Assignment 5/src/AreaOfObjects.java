import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 5. Area Calculator
 */

import java.util.Scanner;

public class AreaOfObjects {
	
	private String message = "";
	private static double radius = 0;
	private static int length = 0;
	private static int width = 0;
	private static int side = 0;
	private static double base;
	private static double height;
	
	
	private AreaOfObjects(String message, double radius, int length, int width, int side, double base, double height) {
		super();
		this.message = message;
		this.radius = radius;
		this.length = length;
		this.width = width;
		this.side = side;
		this.base = base;
		this.height = height;
	}

	//Constructor
	public AreaOfObjects() {
		
	}
	
	// returns the area of a circle
	public static double area_circle() {
		radius = inputDouble("Please radius of circle");
		new AreaOfObjects().setRadius(radius);
		return Math.PI * (radius * radius);
	}
	
	// returns the area of a rectangle
	public static int area_rectangle() {
		length = inputInt("Please length of rectangle");
		width = inputInt("Please width of rectangle");
		new AreaOfObjects().setLength(length);
		new AreaOfObjects().setWidth(width);
		return length * width;
	}
	
	// returns the area of a square
	public static int area_square() {
		side = inputInt("Please side of square");
		new AreaOfObjects().setSide(side);
		return side * side;
	}
	
	// returns the area of a triangle
	public static double area_triangle() {
		base = inputDouble("Please base of triangle");
		height = inputDouble("Please height of triangle");
		new AreaOfObjects().setBase(base);
		new AreaOfObjects().setHeight(height);
		return 0.5 * base * height;
	}
	
	public static int inputInt(String message) {
		Scanner reader = new Scanner(System.in);
		System.out.print(message + "\n" + "> ");
		return reader.nextInt();
	}
	
	public static double inputDouble(String message) {
		Scanner reader = new Scanner(System.in);
		System.out.print(message + "\n" + "> ");
		return reader.nextDouble();
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		
		AreaOfObjects obj = new AreaOfObjects();
		
		int response = 1, recall = 1;
		
		do {
			System.out.println(
					"--------------------------\n"
					+ "Welcome to area of objects\n"
					+ "**************************\n"
					+ "1. Area of circle\n"
					+ "2. Area of rectangle\n"
					+ "3. Area of square\n"
					+ "4. Area of triangle\n"
					+ "Enter 0 or any key to except numbers 1-4 to quit\n"
					);
			
			response = inputInt("Please select options 1-4 for objects you would like to calculate area of");
			switch(response) {
				case 1:
					double areaCircle = area_circle();
					System.out.println("Area of circle of radius "+ obj.getRadius() + " is " + areaCircle + "\n");
					break;
				case 2:
					int areaRect = area_rectangle();
					System.out.println("Area of rectangle of length "+ obj.getLength() + " & width " + obj.getWidth() + " is " + areaRect + "\n");
					break;
				case 3:
					double areaSquare = area_square();
					System.out.println("Area of square of side "+ obj.getSide() + " is " + areaSquare + "\n");
					break;
				case 4:
					double areaTriangle = area_triangle();
					System.out.println("Area of triangle of base "+ obj.getBase() + " height " + obj.getHeight() + " is " + areaTriangle + "\n");
					break;
				default:
					System.out.println("Exiting program...");
					break;
			}
			
			recall = inputInt("Enter 1 find another area of object or 0 to quite");
			
			if(recall == 0) {
				System.out.println("Exiting program...");
				break;
			}
			
			
		}while(response != 0 || recall != 0);

	}

}
