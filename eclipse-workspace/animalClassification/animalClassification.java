import java.util.Scanner;
public class animalClassification {
	public static void main(String args[])
	{
		Scanner input = new Scanner( System.in );
		System.out.print("Is the animal cold blooded (Yes/No)? ");
		String coldBloodedAnswer = input.next();
		boolean coldBlooded = coldBloodedAnswer.equalsIgnoreCase("Yes");
		if (!coldBlooded)
		{
			System.out.print("Does the animal have wings and feathers (Yes/No)? ");
			String hasWingsAnswer = input.next();
			boolean hasWings = hasWingsAnswer.equalsIgnoreCase("Yes");
			if (hasWings)
				System.out.println("The animal is a bird.");
			else System.out.println("The animal is a mammal.");
		}
		else
		{
			System.out.print("Does the animal have scales (Yes/No)? ");
			String hasScalesAnswer = input.next();
			boolean hasScales = hasScalesAnswer.equalsIgnoreCase("Yes");
			if (hasScales)
			{
				System.out.print("Does the animal have any fins (Yes/No)? ");
				String hasFinsAnswer = input.next();
				boolean hasFins = hasFinsAnswer.equalsIgnoreCase("Yes");
				if (hasFins)
					System.out.println("The animal is a fish.");
				else System.out.println("The animal is a reptile.");
			}
			else System.out.println("The animal is an amphibian.");
		}
			
			
		}
		
	}


