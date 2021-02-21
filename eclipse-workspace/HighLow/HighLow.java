import java.util.Scanner;
import java.util.Random;

public class HighLow {
		
		public static int GUESSES_ALLOWED = 5;
		public static int MAX_NUMBER = 20;
		public static int UNKNOWN_NUMBER = -1;
		
		public static void main(String args[])
		{
			
			Random generator = new Random();
			int numberToGuess = generator.nextInt(MAX_NUMBER + 1);
			
			int numberGuessed = UNKNOWN_NUMBER;
			int count = 0;
			for (count = 0;(count<GUESSES_ALLOWED) && (numberGuessed != numberToGuess); count++)
			{
				Scanner input = new Scanner(System.in);
				System.out.print(" Guess the number ( between 0 and 20) : ");
				numberGuessed = input.nextInt();
				if (numberGuessed > numberToGuess)
					System.out.print("" + numberGuessed + " is too high .");
				else if (numberGuessed < numberToGuess) 
					System.out.print("" + numberGuessed + " is too low .");}
				if (numberGuessed == numberToGuess) 
					System.out.print("Well done. you got it in " + count + " guesses");
					
				
					else {System.out.print("Hard luck. The number was " + numberToGuess + " ." );}
					
				}
	}


