import java.util.Arrays;
import java.util.Scanner;

public class P_01_Array_Intro {

    public static void main(String[] args) {
        // 2 ways to declare and initialize an array.

        // Todo:- 1st way.
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(arr[0] + " " + arr[1] + " " + arr[4]);

        // Todo:- 2nd way.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of your desired array:- ");
        int len = in.nextInt();

        int[] arr2 = new int[len];

        System.out.println("Enter the elements your array till the entered length:- ");
        for (int idx = 0; idx < len; idx++) {
            arr2[idx] = in.nextInt();
        }

        System.out.println("Your array is:- " + Arrays.toString(arr2));

        in.close();
    }

}