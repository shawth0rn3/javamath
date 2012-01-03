import java.util.Scanner;
import java.math.*;

public class javamath 
{
	//basic i/o done, time for math

	public static void main(String[] args) 
	{
		double x, y;  
		//double variable assignment for precision
		//e.g. 10.1 is not a int...
		
		System.out.print("enter a number, x");
		//prompt
		Scanner in = new Scanner(System.in);
		//open the input stream...
		x = in.nextDouble();
		//assign x..
		
		System.out.print("enter your second number, y");
		y = in.nextDouble();		
		//assign y..
		
		//System.out.print("you entered:\t"+x+"\t and"+y);
		//standard debug statement
		//    /t will add tabs to string output
		
		System.out.print("x * y\t"+(x*y));
		System.out.print("\nx + y\t"+(x+y));
		System.out.print("\nx - y\t"+(x-y));
		System.out.print("\nx / y\t"+(x/y));
		
		//formatted output..
		//sloppy but very quick and easy
		

	}

}
