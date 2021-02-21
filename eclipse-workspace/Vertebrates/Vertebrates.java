import java.util.Scanner;

public class Vertebrates {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Does you animal have fins ? (Yes/No) ");
		String hasFinsAnswer = input.next();
		boolean hasFins = hasFinsAnswer.equalsIgnoreCase("Yes");
		if (hasFins) {
			System.out.println("The animal is a Fish");
		}
		if (!hasFins)
		{
			System.out.println("Does you animal have Scales ? (Yes/No)");
			String hasScalesAnswer = input.next();
			boolean hasScales = hasScalesAnswer.equalsIgnoreCase("Yes");
			if (hasScales)
				System.out.println("The animal is a Reptile ");
			else {
				System.out.println("Does your animal have feathers ? (Yes/No)");
				String hasFeathersAnswer = input.next();
				boolean hasFeathers = hasFeathersAnswer.equalsIgnoreCase("Yes");
				if (hasFeathers) {
					System.out.println("The animal is a bird ");
				}
				else {
					System.out.println("does your animal have a moist skin ? (Yes/No)");
					String hasMoistSkinAnswer = input.next();
					boolean hasMoistSkin = hasMoistSkinAnswer.equalsIgnoreCase("Yes");
					if (hasMoistSkin) {
						System.out.println("The animal is a Amphibian");
					}
					else {
						System.out.println("The animal is a mammal");
					}
				}
			}
		}
	}
	

}
