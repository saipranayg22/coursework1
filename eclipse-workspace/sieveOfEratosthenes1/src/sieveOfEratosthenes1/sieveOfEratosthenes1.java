/* SELF ASSESSMENT 

1.  createSequence:
Did I use the correct method definition?
Mark out of 5: 5
Comment: yes

Did I create an array of size n (passed as the parameter) and initialise it?
Mark out of 5: 5
Comment: yes

Did I return the correct item?
Mark out of 5: 5
Comment: yes


2.  crossOutMultiples
Did I use the correct method definition?
Mark out of 5: 5
Comment: yes

Did I ensure the parameters are not null and one of them is a valid index into the array
Mark out of 2: 2

Comment: yes
Did I loop through the array using the correct multiple?
Mark out of 5: 5
Comment: yes

Did I cross out correct items in the array that were not already crossed out?
Mark out of 3: 3
Comment: yes

   
3.  sieve   
Did I have the correct function definition?
Mark out of 5: 5
Comment: yes

Did I make calls to other methods?
Mark out of 5: 5
Comment: yes

Did I return an array with all non-prime numbers are crossed out?
Mark out of 2: 2
Comment: yes

   
4.  sequenceTostring  
Did I have the correct function definition?
Mark out of 5: 5
Comment: yes

Did I ensure the parameter to be used is not null?
Mark out of 3: 3
Comment: yes

Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets? 
Mark out of 10: 10
Comment: yes

   
5.  nonCrossedOutSubseqToString  
Did I have the correct function definition
Mark out of 5: 5
Comment: yes

Did I ensure the parameter to be used is not null?  
Mark out of 3: 3
Comment: yes

Did I loop through the array updating the String variable with just the non-crossed out numbers? 
Mark out of 5: 5
Comment: yes

   
6.  main  
Did I ask  the user for input n and handles input errors?  
Mark out of 5: 5
Comments: yes

Did I make calls to other methods (at least one)?
Mark out of 5: 5
Comment: yes

Did I print the output as shown in the question?  
Mark out of 5: 5
Comment: yes

   
7.  Overall
Is my code indented correctly?
Mark out of 4: 4
Comments: yes

Do my variable names make sense?
Mark out of 4: 4
Comments: yes

Do my variable names, method names and class name follow the Java coding standard
Mark out of 4: 4
Comments: yes

Total Mark out of 100 (Add all the previous marks): 100
*/

package sieveOfEratosthenes1;

import java.util.Scanner;

public class sieveOfEratosthenes1 {
	
	public static boolean[] createSequence(int N)
	{
		boolean[] numbers = new boolean[N-1];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = true;
		}
		
		return numbers;
	}
	
	public static void crossOutHigherMultiples(boolean[] numbers, int n)
	{
		if (numbers != null && n >= 2 && n < numbers.length)
		{
			for (int i = n - 1; i < numbers.length; i++)
			{
				if ((i + 2) % n == 0) {
					numbers[i] = false;
				}
			}
		}
	}
	
	public static boolean[] sieve(int N) 
	{
		boolean[] numbers = createSequence(N);
		System.out.println(nonCrossedOutSubseqToString(numbers));
		
		for (int i = 2; i < N; i++)
		{
			String sequence1 = sequenceToString(numbers);
			crossOutHigherMultiples(numbers, i);
			String sequence2 = sequenceToString(numbers);
			if (!sequence1.equals(sequence2)) 
			{
				System.out.println(sequenceToString(numbers));
			}
		}
		
		System.out.println(nonCrossedOutSubseqToString(numbers));
		
		return numbers;
	}
	
	public static String sequenceToString(boolean[] numbers)
	{
		String sequence = "" + 2;
		
		if (numbers != null)
		{
			for (int i = 1; i < numbers.length; i++)
			{
				if (numbers[i])
				{
					sequence = sequence + ", " + (i + 2);
				}
				else
				{
					sequence = sequence + ", [" + (i + 2) + "]";
				}
			}
		}
		
		return sequence;
	}
	
	public static String nonCrossedOutSubseqToString(boolean[] numbers)
	{
		String sequence = "" + 2;
		
		if (numbers != null) {
			for (int i = 1; i < numbers.length; i++) 
			{
				if (numbers[i])
				{
					sequence = sequence + ", " + (i + 2);
				}
			}
		}
		
		return sequence;
	}
	
	public static void main(String[] args)
	{
			System.out.print("Enter int >= 2 : ");
			Scanner input = new Scanner(System.in);
			int N = input.nextInt();
			input.close();
			sieve(N);
		}
		
	

}
