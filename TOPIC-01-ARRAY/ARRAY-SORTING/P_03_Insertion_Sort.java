import java.util.Arrays;

public class P_03_Insertion_Sort {

    /**
     * ? Algo:- Pick An Element From Unsorted Part, Shift All Greater Elements
     * One Step Right, And Place It At Its Correct Position.
     *
     * ! Time Complexity:-
     * ~ Worst Case (Reverse Sorted) -> O(N^2)
     * ~ Average Case (Random Order) -> O(N^2)
     * ~ Best Case (Already Sorted) -> O(N) [While Loop Never Executes]
     *
     * * Space Complexity:- O(1) [In-Place Sorting]
     *
     * ? Stable:- Yes. [Shifting Stops At Equal Elements, Order Preserved]
     */

    // Todo:- Method To Implement Insertion Sort.
    public static void sort(int[] arr) {
        int n = arr.length;

        // Assume arr[0] Is Sorted. Pick Each Element Starting From Index 1.
        for (int i = 1; i < n; i++) {
            int num = arr[i]; // Element To Be Placed At Its Correct Position.
            int j = i - 1;

            // Shift Elements Greater Than num One Position To The Right.
            while (j >= 0 && arr[j] > num) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place num At Its Correct Position In The Sorted Part.
            arr[j + 1] = num;
        }
    }

    public static void main(String[] args) {
        // Average Case - Random Order
        int[] arr1 = { 5, 9, 2, 8, 0, 4 };
        sort(arr1);
        System.out.println("Random   : " + Arrays.toString(arr1));

        // Best Case - Already Sorted (While Loop Never Fires -> O(N))
        int[] arr2 = { 0, 2, 4, 5, 8, 9 };
        sort(arr2);
        System.out.println("Sorted   : " + Arrays.toString(arr2));

        // Worst Case - Reverse Sorted (Max Shifts Every Pass -> O(N^2))
        int[] arr3 = { 9, 8, 5, 4, 2, 0 };
        sort(arr3);
        System.out.println("Reversed : " + Arrays.toString(arr3));
    }
}
