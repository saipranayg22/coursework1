/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 5:   5
       Comment: 
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: 
   3. Did I indent the code appropriately?
       Mark out of 5:   5
       Comment: 
   4. Did I implement a switch statement as required?
       Mark out of 10:   10
       Comment: 
       Total Mark out of  25 (Add all the previous marks): 25  
*/
import java.util.Scanner;

public class Prizes {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
    System.out.print("This program tells competition participants what prize they have won. ");
    
    do {
    System.out.print("\nEnter your place number (or type 'exit'):");
          
    if(input.hasNextInt()) {
    	int position = input.nextInt();  
                   
    switch(position) {
    case 1: 
                  System.out.print("You came in 1st place and hence won two theatre tickets + drinks during the interval + dinner before the show.");
                  break;
    case 2:
                  System.out.print("You came in 2nd place and hence won two theatre tickets + drinks during the interval.");
                  break;
    case 3:
                  System.out.print("You came in 3rd place and hence won two theatre tickets." );
                  break;
    case 4:
    case 5:
                  System.out.print("You came in " + position + "th place and hence won a 10 Euro book token.");
                  break;
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
                  System.out.print("You came in " + position + "th place and hence won a 5 Euro book token.");
                  break;
    
    default :
                  System.out.print("Sorry.  You did not win a prize.");
                                
                           }
    
                    }
    else if(input.hasNext("exit")) {
    	exit = true;
    }
           
              }while(!exit);
       }
}
