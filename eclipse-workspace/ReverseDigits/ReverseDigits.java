import java.util.Scanner;

public class ReverseDigits {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to reverse: ");
		int number = input.nextInt();
		
		int reversedNum = 0;
		int remainingNum = number;
		
		while(remainingNum>0)
		{
			reversedNum = reversedNum*10 + remainingNum%10;
			remainingNum = remainingNum/10;
		}
		input.close();
		System.out.print("the reversed number is " + reversedNum);
	}

}
