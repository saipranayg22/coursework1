import java.util.Scanner;
import java.util.Arrays;
public class Median {
    public static void main(String[] args) {
        System.out.print("Welcome to the median & rolling average system.\n");
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        double[] givenNumbers = {};
        int inputNumber = 3;

        while (!exit){
            System.out.print("Enter a number (or enter quit):");
            if (input.hasNextDouble()) {
                double[] temporaryArray = new double[(int) (givenNumbers.length + 1)];
                System.arraycopy(givenNumbers, 0, temporaryArray, 0, givenNumbers.length);
                temporaryArray[(int) (temporaryArray.length - 1)] = input.nextDouble();
                givenNumbers = temporaryArray;


                double AverageOfValues = computeRollingAverage(givenNumbers, inputNumber);
                String arrayString = convertToString(givenNumbers);
                double MedianOfValues = computeMedian(givenNumbers);

                System.out.printf("The median of %s is %.1f and the " +
                                "rolling average of the last %d values is %.1f.\n"
                        , arrayString, MedianOfValues, inputNumber, AverageOfValues);
            } else if (input.hasNext("quit")) {
                exit = true;
            } else {
                System.out.print("Error - Enter any real number or quit.\n");
                input.next();
            }
        }
        input.close();

    }

    public static double computeMedian(double[] unsortedArray) {
        double medianOfIntegers = 0;
        if (unsortedArray != null) {
            double[] sortedArray = createSortedArray(unsortedArray);
            double number1;
            double number2;
            int arrayLength = sortedArray.length;
            if (sortedArray.length % 2 == 0) {
                number1 = (sortedArray[arrayLength / 2]);
                number2 = (sortedArray[arrayLength / 2 - 1]);
                medianOfIntegers = (number1 + number2) / 2;
            } else {
                medianOfIntegers = sortedArray[sortedArray.length / 2];
            }
            return medianOfIntegers;
        } else {
            return 0;
        }
    }

    public static double[] createSortedArray(double[] sortedarray) {
        if (sortedarray == null) {
            return null;
        } else {
            double[] tempArray = Arrays.copyOf(sortedarray, sortedarray.length);
            Arrays.sort(tempArray);
            return tempArray;
        }

    }

    public static double computeRollingAverage(double[] rollingAverageArray, int inputInteger) {
        double TotalOfIntegers = 0;
        double AverageOftheIntegers = 0;
        if (rollingAverageArray == null) {
            return 0;
        } else {
            if (inputInteger == 0)
                return 0;
            else if (rollingAverageArray.length <= inputInteger) {
                for (int index = 0; index < rollingAverageArray.length; index++) {
                    TotalOfIntegers = rollingAverageArray[index] + TotalOfIntegers;
                }
                AverageOftheIntegers = TotalOfIntegers / rollingAverageArray.length;
                return AverageOftheIntegers;
            } else {
                for (int index = rollingAverageArray.length - inputInteger; index < rollingAverageArray.length; index++) {
                    TotalOfIntegers = rollingAverageArray[index] + TotalOfIntegers;
                }
                AverageOftheIntegers = TotalOfIntegers / inputInteger;
            }
            return AverageOftheIntegers;
        }
    }


        public static String convertToString (double [] converttstringarray) {
            String stringofArray = "{ ";
            if (converttstringarray != null) {
                for (int index = 0; index < converttstringarray.length; index++) {
                    stringofArray += String.format("%.1f", converttstringarray[index]);
                    if ((converttstringarray.length > 1) && (converttstringarray.length - index != 1)) {
                        stringofArray = stringofArray + ", ";
                    }
                }
                stringofArray += " }";
                return stringofArray;
            }
            else
            {
                return "{ }";
            }
        }
}