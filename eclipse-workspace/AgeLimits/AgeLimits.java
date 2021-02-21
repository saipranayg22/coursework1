import java.util.Scanner;

public class AgeLimits {


		final static int MINIMUM_LEGAL_DRIVING_AGE = 17;
	    final static int MINIMUM_LEGAL_DRINKING_AGE = 18;
		public static void main(String[] args) {
			
			System.out.println("What is yout age ?");
			Scanner input = new Scanner( System.in);
			int age = input.nextInt();
			if (age >= MINIMUM_LEGAL_DRIVING_AGE )
			{
				System.out.println("you may legally drive now (once you get a licence)");
			}
			if ( age >= MINIMUM_LEGAL_DRINKING_AGE )
			{
				System.out.println("You may legally drink now");
			}
			input.close();

	}

}
