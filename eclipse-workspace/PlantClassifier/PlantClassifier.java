/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:    10
       Comment: YES
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: YES
   3. Did I indent the code appropriately?
       Mark out of 15:   15
       Comment: YES
      Total Mark out of  30 (Add all the previous marks): 30  
*/

import java.util.Scanner;

public class PlantClassifier {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Does the plant have cells and tissues"
				+ " which are organised into functional structures"
				+ " (Yes/No)?");
		String hasCellsAnswer = input.next();
		boolean hasCells = hasCellsAnswer.equalsIgnoreCase("Yes");
		if (!hasCells) {
			System.out.println("The plant is an ALGAE.");
		}
		else {
			System.out.println("Does the plant have vascular tissues"
					+ " (Yes/No)? ");
			String hasVascularAnswer = input.next();
			boolean hasVascular = hasVascularAnswer.equalsIgnoreCase("Yes");
			if (!hasVascular) {
				System.out.println("The plant is a BRYOPHYTE.");
			}
			else {
				System.out.println("Is the plant dispersed by seeds"
						+ " (Yes/No)");
				String hasSeedsAnswer = input.next();
				boolean hasSeeds = hasSeedsAnswer.equalsIgnoreCase("Yes");
				if (!hasSeeds) {
					System.out.println("The plant is a PTERIDOPHYTE.");
				}
				else {
					System.out.println("Are the seeds enclosed (Yes/No)?");
					String isEnclosedAnswer = input.next();
					boolean isEnclosed = isEnclosedAnswer.equalsIgnoreCase("Yes");
					if (!isEnclosed) {
						System.out.println("The plant is a GYMNOSPERM.");
					}
					else {
						System.out.println("The plant is an ANGIOSPERM.");
					}
				}
			}
		}
	}

}
