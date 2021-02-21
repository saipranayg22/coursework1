/*  SELF ASSESSMENT of whether my code is easy to understand.
	   1. Did I use appropriate CONSTANTS instead of numbers within the code?
	       Mark out of 5:  5   
	       Comment:   "MONTHS_PER_YEAR"
	   2. Did I use easy-to-understand, meaningful CONSTANT names?
	       Mark out of 5:   5
	       Comment: A year has 12 months
	        3. Did I format the CONSTANT names properly (in UPPERCASE)?
	       Mark out of 5:  5 
	       Comment: MONTHS_PER_YEAR
	   4. Did I use easy-to-understand meaningful variable names?
	       Mark out of 10:   10
	       Comment: YES
	   5. Did I format the variable names properly (in lowerCamelCase)?
	       Mark out of 5:   5
	       Comment: yes
	   6. Did I indent the code appropriately?
	       Mark out of 10:   10
	       Comment: yes
	     Total Mark out of  40 (Add all the previous marks):  40
	*/
import java.util.Scanner;
public class LoanRepaymentCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter loan amount? ");
		double P = input.nextDouble();
		
		System.out.print(" Enter annual interest rate (e.g. 0.04)? ");
        double AnnualInterestRate = input.nextDouble();
        
        System.out.print(" Enter the term of the loan in years? ");
        double n = input.nextDouble();
        
        input.close();
        
        double M = P * (AnnualInterestRate/12*Math.pow(1+AnnualInterestRate/12,12*n)) / (Math.pow(1+AnnualInterestRate/12,12*n) -1);
        
        System.out.printf(" The monthly repayment for a %.0f year loan"
        		+ " of %.2f at an annual interest rate of %.2f would be"
        		+ " %.2f ",n,P,AnnualInterestRate,M);
		   
	}

}
