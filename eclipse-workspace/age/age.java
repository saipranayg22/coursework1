import java.util.Scanner;
public class age {
	public static void main (String[] args) {
		
		System.out.print("what is your age ?");
		Scanner input = new Scanner( System.in);
		int age = input.nextInt();
		
		boolean isAdult = (age >= 18);
		boolean isNotAdult = (age <=18);
		if (isAdult)
		{
			System.out.print("You may legally drink now!");
		}
		if (isNotAdult)
		{
			System.out.print("you cannot drink legally, you fucker!!!" );
		}
		
	}

}
