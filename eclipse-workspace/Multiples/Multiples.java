import java.util.Scanner;

public class Multiples {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lower limit(Example : 1) : ");
		int lower = input.nextInt();
		System.out.println("Enter the upper limit(Example : 32) : ");
		int upper = input.nextInt();
		for (int number = lower;(number<=upper);number = number + 1)
		{
			if(number%5 == 0) {
				System.out.println("Multiples of 5 are : " + number );
			}
		}
	}

}
