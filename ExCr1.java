import java.util.Scanner;

/*
Bailey Spicer
Assignment 1/Extra Credit 1
My student id ends in odd number, the remainder when divided by 17 is 5, 
so I am doing problem 6 from chapter 2.
March 30, 2016
bes2725@email.vccs.edu
This program requests a farenhiet temperature value from the user and 
outputs a formatted celcius value
*/

public class ExCr1
{
	public static void main (String[] args)
	{
		//create Scanner
		Scanner in = new Scanner(System.in);

		//declare variables
		double farTemp;
		double celTemp;
		

		//temp input
		System.out.println("Please enter the whole number temperature in"
			+ " degrees Farenheit: ");
		farTemp = in.nextDouble();

		if (farTemp%1 == 0)
		{
		//calculate
		celTemp = ((5*(farTemp - 32))/9);

		//temp output
		System.out.printf("%.0f degrees Farenheit converts to %.1f degrees"
			+ " Celcius.", farTemp, celTemp);
		}
		else
		{
		System.out.println("You have entered an incorrect temperature value.");
		}
	
	}
}


