/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 5:  5 
       Comment: 
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: 
   3. Did I indent the code appropriately?
       Mark out of 5:   5
       Comment: 
   4. Did I implement a while loop or do-while loop as required?
       Mark out of 10:   10
       Comment: 
      Total Mark out of  25 (Add all the previous marks): 25  
*/

import java.util.Scanner;
public class IncrementalStatistics{
	public static void main(String[] args)
{
	boolean exit = false;
	double 	runningAverage = 0; 
	double 	runningTotal = 0;
	double 	runningVariance = 0;
	double 	lastAverage = 0;
	double 	lastVariance = 0;
	int 	totalNumbers = 0;
	Scanner input = new Scanner(System.in);
	
	System.out.println("This program computes the average and variance of all numbers entered.");
	do{
		if(totalNumbers == 0)
			System.out.print("Enter a number (or type 'exit'): ");
		else
			System.out.print("Enter another number (or type 'exit'): ");
		
		

		if(input.hasNextDouble())
		{
			int inputNumber = input.nextInt();
			++totalNumbers;
			runningTotal =runningTotal + inputNumber;
			runningAverage = runningTotal / totalNumbers;

			if(totalNumbers == 1)
				runningVariance = 0;
			else
			{
				runningVariance = ((totalNumbers - 1) * lastVariance + (inputNumber - lastAverage) 
						   		  * (inputNumber - runningAverage)) / totalNumbers;
			}

			System.out.printf("So far the average is %.1f and the variance is %.1f\n", runningAverage, runningVariance);
			lastAverage = runningAverage;
			lastVariance = runningVariance;
		}
		else if(input.hasNext("exit"))
		{
			System.out.println("Goodbye.");
			exit = true;
		}
		else
		{
			System.out.println("Error:  You must enter a real number (e.g. 12.5)");
			input.next();
		}
	}while(!exit);
	input.close();
	}

}
