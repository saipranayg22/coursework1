import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println(" enter the year ");
		Scanner input = new Scanner( System.in);
		int year = input.nextInt();
		input.close();
		if (year % 400 == 0) {
		} else if ( year % 100 == 0) {
		} else if ( year % 4 == 0) {
		}
		input.close();
		if ((year%400==0) || (!(year%100==0) && (year%4==0)))
			System.out.print("The year " + year + " is a leap year ");
			else System.out.print(" The year " + year + " is not a leap year ");
		

	}

}
