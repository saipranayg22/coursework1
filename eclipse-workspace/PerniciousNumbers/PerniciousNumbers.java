/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful and properly formatted variable names?
       Mark out of 5:5
       Comment:Yes,the variable names are easy to understand.
    2. Is my code easy to follow/understand?
       Mark out of 5:5
       Comment: Yes, the code is easy to understand
   3. Did I use the functions as required?
       Mark out of 10:10
       Comment: Yes
       Total Mark out of  20 (Add all the previous marks):20
*/
import java.util.Scanner;
public class PerniciousNumbers {

	   public static void main(String[] args){
	      Scanner input = new Scanner(System.in);
	      System.out.printf("Enter the maximum number you want to consider: ");
	      int number= input.nextInt();
	      for (int index = 0; index <= number; index++) {
	         if (isPernicious(index)) {
	            System.out.println(index + " is a pernicious number as it contains " +countBinaryOnes(index) + " ones in it's binary representation " + "(" + getBinaryString(index) + ")");
	         }
	      }
	   }

	   public static String getBinaryString(int index){
	      String binary="";
	      int tempIndex=0;
	      int binaryDigit=0;
	      if(index==0){
	         return "0";
	      }
	      if(index<0){
	         index= -index;
	         while(index>0){
	            binaryDigit=index%2;
	            binary= binaryDigit + binary;
	            index=index/2;
	         }
	         binary="-"+ binary;
	      }
	      else{
	         while(index>0){
	            binaryDigit=index%2;
	            binary= binaryDigit + binary;
	            index=index/2;
	         }
	      }
	      return binary;

	   }

	   public static int countBinaryOnes(int index){
	      int ForcountedOnes = 0;
	      int checkIfBinary=0;
	      if(index<0){
	         index=-index;
	      }
	      while(index>0){
	         checkIfBinary=index%2;
	         if(checkIfBinary==1)
	            ForcountedOnes++;
	         index=index/2;
	      }
	      return ForcountedOnes;
	   }

	   public static boolean isPrime(int countingOnes){
	      boolean prime=true;
	      if(countingOnes==0)
	         return false;
	      else if(countingOnes==1)
	         return false;
	      for(int countOfPrime=2; countOfPrime<=countingOnes/2; countOfPrime++){
	         if(countingOnes % countOfPrime ==0){
	            prime=false;
	            break;
	         }
	      }
	      return prime;
	   }

	   public static boolean isPernicious(int index){
	      String ShowBinary=getBinaryString(index);
	      int countOfOnes= countBinaryOnes(index);
	      boolean isPrime= isPrime(countOfOnes);
	      boolean perniciousNumber=false;
	      if(isPrime)
	         perniciousNumber=true;
	      return perniciousNumber;
	   }

}
