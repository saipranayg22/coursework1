package oRE;

import java.util.Scanner;

public class oRE {
	public static void main(String[] args) {
		
				System.out.println("Enter the number ");
				Scanner input = new Scanner(System.in );
				int number = input.nextInt();
				
				boolean numberIsOdd = ((number%2)==1);
				
				if (numberIsOdd)
				{
					System.out.println("The number " + number + " is odd ");
				}
				else 
				{
					System.out.println("The number " + number + " is even ");
				}
				input.close();
}
}
