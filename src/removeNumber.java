import java.util.Arrays;
import java.util.Scanner;

public class removeNumber {
//this doesn't work right now as it takes out duplicate numbers
    public static int[] removeInput(int[] array1, int target) {
        int index = 0;
        int[] abscores3 = new int[0];
        //check if the user input number is in the array
        for (int number : array1) {
            if (number == target) {
                //reduce array by 1
                abscores3 = new int[array1.length - 1];
               //re-write the values that are not the target back to array (doesn't work with duplicates)***
                for (int value : array1) {
                    if (value != target) {
                        abscores3[index] = value;
                        index++;
                    }
                }
            } else {
                //take them back to the input option
                break;
            }
        }
        return abscores3;
    }

        public static void main (String[]args){
            int[] abscores2 = {5, 5, 9, 1, 3, 4};
            Scanner sc = new Scanner(System.in);
            System.out.println(Arrays.toString(abscores2));
            int Str = sc.nextInt();
            System.out.println(Arrays.toString(removeInput(abscores2, Str)));

        }
    }


