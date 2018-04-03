# Assignment-5
Table of Contents
1. Student -> StudentSimple.java - dependencies Student.java/InputOutput.java
2. Getting more advanced -> StudentArray.java  - dependencies  Student.java/InputOutput.java
3. Now we're talking -> StudentArrayAdvanced.java  - dependencies  Student.java/InputOutput.java
4. Pythagorean Theorum -> PythagoreanTheorem.java
5  Area Calculator -> AreaOfObjects.java
6. Divisible by... -> DivisibleBy.java

1. Students

Create a Student class to store information about a student.
This includes a Name, a Grade, and a GPA.

Create three instances of type Student. Read the values for those students from user input.

Print out the names of those students, their grades, and their GPAs.
Then, print out the average GPA of all three students.


2. Getting more advanced

Create an array of type Student with three positions.

Read in their info just like before.

Print out the names of those students, their grades, and their GPAs.
Then, print out the average GPA of all three students.

3. Now we're talking

Ask the user to input the number of students they would like to enter.
Store this in an integer named [numStudents].

Create an array of type Student with [numStudents] positions.

Read through their info via a loop.

Using a loop, print out the names of those students, their grades, and their GPAs.
Finally, print out the average GPA of all students.

4. Pythagorean Theorum

Create a method that takes in two sides of a triangle 
and returns the length of the hypotenuse.

This can be found with the following equation:
c = sqrt(a^2 + b^2)

Create a main that calls this method with at least 3 different
sets of values and prints the results of each.


5. Area Calculator

Create four methods to calculate te area for different objects.

Your method declaration will look something like this:
public static double area_circle()   // returns the area of a circle
public static int area_rectangle()   // returns the area of a rectangle
public static int area_square()      // returns the area of a square
public static double area_triangle() // returns the area of a triangle

The equations for each are as follows:
Circle = pi * radius^2
Rectangle = length * width
Square = side^2
Triangle = 0.5 * base * height

Note: you can use Math.PI for the value of pi.

Create a main method that asks the user which object they would 
like to get the area of.

It will then direct them to that method.

Each method will then ask the user to input the value of each variable required.
For example, area_circle() will ask the user to input the radius.

The main method will then return the results.

6. Divisible by...

Create two functions:

public static boolean isEven( int n )
The function should return the value true if n is an even number (divisible by 2) and false otherwise.

And

public static boolean isDivisibleBy3( int n )
The function should return the value true if n is evenly divisible by 3 and false otherwise.

Write a main() that contains a for loop to generate all the numbers from 1 to 20. Use if statements 
inside the loop to mark the number with a "<" if it's even, with a "=" if it's evenly divisible by 3, 
and with both if it's divisible by both 2 and 3.

For example, numbers 1-6 would look like this:
1
2 <
3 =
4 <
5
6 <
6 =
