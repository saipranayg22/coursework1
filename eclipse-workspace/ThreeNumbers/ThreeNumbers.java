/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful and properly formatted variable names?
       Mark out of 5: 5 
       Comment: yes ( like integer1, integer2, integer3)
    2. Did I indent the code appropriately?
       Mark out of 5: 5
       Comment:  yes
   3. Did I make use of the functions appropriately within main and the other functions?
       Mark out of 10: 10   
       Comment: yes
       Total Mark out of  20 (Add all the previous marks): 20
*/
import java.util.Scanner;
public class ThreeNumbers {

	public static void main(String[] args) {
        boolean exit=false;
        Scanner input = new Scanner(System.in);
        do{
            System.out.printf("Please enter your three integers separated by spaces (or enter 'quit'):  ");
            if(input.hasNextInt()){
                int integer1 = input.nextInt();
                int integer2 = input.nextInt();
                int integer3 = input.nextInt();
                int median = medianOf(integer1,integer2,integer3);
                int count = countOfNumbersGreaterThanTheAverage(integer1,integer2,integer3);
                System.out.println(getFormattedOutputString(median,count));
            }
            else if(input.hasNext("quit")){
                exit=true;
            }
            else{
                System.out.printf("Error.");
                input.next();
            }
        }while(!exit);
    }
    public static int medianOf(int integer1, int integer2, int integer3){
        if((integer1<=integer2 && integer2<=integer3) || (integer3<=integer2 && integer2<=integer1)){
            return integer2;
        }else if((integer2<=integer1 && integer1<=integer3) || (integer3<=integer1 && integer1<=integer2)){
            return integer1;
        }else {
            return integer3;
        }
    }

    public static double averageOf(int integer1, int integer2, int integer3){
        return ((((double)integer1)+((double)integer2)+((double)integer3))/3.0);
    }

    public static  int countOfNumbersGreaterThanTheAverage(int integer1,int integer2,int integer3){
        double average= averageOf(integer1,integer2, integer3);
        int count =0;
        if(integer1>average)
            count++;
        if(integer2>average)
            count++;
        if(integer3>average)
            count++;
        return count;
    }

    public static String getFormattedOutputString(int median, int count){
        if(count==1 || count==0){
            return ("The median of your numbers is " + median + ", and " + count +
                    " of them is greater than their average.");
        }else{
            return ("The median of your numbers is " + median + ", and " + count +
                    " of them are greater than their average.");
        }}

	private static boolean ascendingOrder3(int integer1, int integer2, int integer3) {
		return ((integer3>integer1)&&(integer3<integer2)||(integer3<integer1)&&(integer3>integer2));
		}

	private static boolean ascendingOrder2(int integer1, int integer2, int integer3) {
		return ((integer1>integer3)&&(integer1<integer2)||(integer1<integer3)&&(integer1>integer2));
		}

	private static int greaterThanAverage(int integer1, int integer2, int integer3, int average) {
	
		int valueLargerThanAverage=1;
		if((integer1>average)&&(integer2>average)&&(integer3>average))
		{
			valueLargerThanAverage= 3;
			}
		else if((integer1>average)&&(integer2>average)||(integer2>average)&&(integer3>average)||(integer3>average)&&(integer1>average))
		{
		valueLargerThanAverage= 2;
		}
	
		return valueLargerThanAverage;
		}

	private static boolean ascendingOrder1(int integer2, int integer1, int integer3) {
		return ((integer1>integer2)&&(integer1<integer3)||(integer1<integer2)&&(integer1>integer3));
		

	}

}
