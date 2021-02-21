import java.util.Scanner;

public class GradeComputation {
	public static final String[] MODULE_CODES = {  "CSU11001", "CSU11010", "CSU11013", "CSU11021", "CSU11022", "CSU11026", "CSU11031", "CSU11081", "CSU12002", "STU11002" };
	public static final int[] MODULE_CREDITS =  {  5, 10, 5, 5, 5, 10, 5, 5, 5, 5 };
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the first year grade assessor.");
		boolean quit = false;
		double[] marks = new double[MODULE_CODES.length];
		while(!quit) 
		{
			for(int numbers = 0; (numbers < MODULE_CODES.length); numbers++)
			{
				System.out.print("Enter the student mark for " + MODULE_CODES[numbers] + " (or enter quit): ");
				if (input.hasNextDouble())
				{
					double mark = input.nextDouble();
					marks[numbers] = mark;
				}
				else if(input.hasNext("quit"))
				{
					quit = true;
					break;
				}
				else
				{
					System.out.println("Error - Enter a number between 0.0 and 100.0 or quit.");
					numbers--;
					input.next();
				}
			}
			
		if (!quit)
		{
			String grade = determineOverallGrade(marks);
			int percentage = (int) Math.round(weightedAverageMark(marks));
			System.out.println("Result = " + grade + " with an overall mark of " + percentage + "%.");
			int failedCredits = (creditsBelowSpecifiedMark(marks, 40));
			if (grade == "FAIL") {
				System.out.println("" + failedCredits + " credits were failed. \n" );
				}
			}
		}
		input.close();
		}
	
	
public static int creditsBelowSpecifiedMark( double[] marks, int specifiedMinimumMark) 
{
	specifiedMinimumMark = 40;
	int numberOfCreditsFailed = 0;
	for( int numbers = 0; (numbers < MODULE_CODES.length); numbers++ )
	{
		if (Math.round(marks[numbers]) < specifiedMinimumMark)
		{
			numberOfCreditsFailed += MODULE_CREDITS[numbers];
		}
		
	}
	return numberOfCreditsFailed;
}

public static double weightedAverageMark( double[] marks )
{
	if(marks == null)
	{
		return 0;
	}
	double runningAverage = 0;
	for (int numbers = 0; (numbers < MODULE_CODES.length); numbers++)
	{
		double averageMark = (marks[numbers] * MODULE_CREDITS[numbers]);
		runningAverage = averageMark + runningAverage;
	}
	double weightedAverageMark = runningAverage / 60.0;
	return weightedAverageMark;
}

public static String determineOverallGrade( double[] marks)
{
	if (Math.round(weightedAverageMark(marks)) < 40 || failedCredits(marks) || creditsBelowSpecifiedMark(marks, 40) > 10)
	{
		return "FAIL";
	}
	else if (Math.round(weightedAverageMark(marks)) < 50)
	{
		return "III";
	}
	else if (Math.round(weightedAverageMark(marks)) < 60)
	{
		return "II.2";
	}
	else if (Math.round(weightedAverageMark(marks)) < 70)
	{
		return "II.1";
	}
	else {
		return "I";
	}
}
private static boolean failedCredits ( double[] marks)
{
	for (int numbers = 0; numbers < MODULE_CODES.length; numbers++)
	{
		if(Math.round(marks[numbers]) < 35)
		{
			return true;
		}
	}
	return false;
}
}
