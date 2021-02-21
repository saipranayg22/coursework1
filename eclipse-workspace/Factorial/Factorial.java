import java.util.Scanner;
public class Factorial {
	public static void main (String args[]) {
		System.out.print("Enter a positive whole number:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int factorial = 1;
		for(int index=2; (index<=number);index=index+1) {
			factorial=factorial*index;
		}
		System.out.print("The factorial of " + number + " is " + factorial );
		input.close();
	}

}
