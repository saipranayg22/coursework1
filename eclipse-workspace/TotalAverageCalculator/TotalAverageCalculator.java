/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable and constant names?
       Mark out of 10:   10
       Comment: 
   2. Did I format the variable and constant names properly (in lowerCamelCase and UPPERCASE)?
       Mark out of 5:   5
       Comment: 
   3. Did I indent the code appropriately?
       Mark out of 10:   10
       Comment: 
   4. Did I implement a for loop to read the input as required?
       Mark out of 10: 10  
       Comment: 
      Total Mark out of  35 (Add all the previous marks): 35  
*/

import java.util.Scanner;
public class TotalAverageCalculator{
		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in); 
			System.out.print("How many integers do you want to enter?");
			int totalInt = input.nextInt();
			if ((totalInt>=2)&&(totalInt<=10)) {
				double sum= 0;
				for (int number = 1;(number<= totalInt);number = number + 1) {
					System.out.print("Enter integer " + number + ":");
					int values = input.nextInt();
					sum = sum + values ;
					double average = sum/totalInt;
					if(number == totalInt) {
					System.out.printf("The sum of your integers is %.0f and the average is %.2f " , sum , average);
					
				}
			}
			
		}
			else {
				System.out.print("Error:  This program is constrained to only compute the total & average of between 2 & 10 integers.");
			}
			input.close();

		}
	}

