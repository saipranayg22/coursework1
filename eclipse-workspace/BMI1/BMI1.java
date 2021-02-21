
import java.util.Scanner;
public class BMI1 {
   public static void main(String args[]) 
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Input weight in kilogram: ");
      double weight = input.nextDouble();
      System.out.print("\nInput height in metres: ");
      double height = input.nextDouble();
      input.close();
      double BMI = weight / (height * height);
      System.out.print("\nThe Body Mass Index (BMI) is " + BMI );
   }
}
