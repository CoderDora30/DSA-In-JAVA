import java.util.Arrays;

public class P_04_Cyclic_Sort {

    /**
     * ? Algo:- Each Number Has A Predetermined Correct Index. Place Every Element
     * Directly At Its Correct Index By Swapping, Then Move Forward.
     *
     * ! Time Complexity:-
     * ~ Worst Case -> O(N) [Each Element Is Swapped At Most Once]
     * ~ Average Case -> O(N) [Each Element Is Swapped At Most Once]
     * ~ Best Case -> O(N) [Already Sorted, No Swaps But Full Scan]
     *
     * * Space Complexity:- O(1) [In-Place Sorting]
     *
     * ? Stable:- No. [Swapping Non-Adjacent Elements Can Disturb Equal Elements]
     *
     * ? When To Use:-
     * * Array Contains Numbers In A Continuous Range [1 to N] or [0 to N].
     * * Finding Missing Numbers, Duplicates, Or Misplaced Elements In A Range.
     */

    // ---------------------------------------------------------------
    // Todo:- Cyclic Sort For Range [1, N]
    // Correct Index Of Element = arr[i] - 1
    // e.g. 1 belongs at index 0, 2 at index 1, N at index N-1
    // ---------------------------------------------------------------
    
    public static void sortOneToN(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            // Correct Index Where arr[i] Should Live.
            int correctIdx = arr[i] - 1;

            // If arr[i] Is Not At Its Correct Index, Swap It There.
            if (arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                // Element Is At Correct Index, Move To Next.
                i++;
            }
        }
    }

    // -----------------------------------------------------------------
    // Todo:- Cyclic Sort For Range [0, N]
    // Correct Index Of Element = arr[i]
    // e.g. 0 belongs at index 0, 1 at index 1, N at index N
    // Note:- N Cannot Be Placed (No Index N In A Size-N Array),
    // So We Skip It And Move Forward.
    // -----------------------------------------------------------------

    public static void sortZeroToN(int[] arr) {
        int n = arr.length;
        int idx = 0;
        while (idx < n) {
            int correctIdx = arr[idx];
            if (arr[idx] != arr[correctIdx]) {
                swap(arr, idx, correctIdx);
            } else {
                idx++;
            }
        }
    }

    // Todo:- Method To Swap Two Numbers In An Array.
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {

        // ---- Range [1, N] ----
        System.out.println("--- Range [1, N] ---");

        // Average Case - Random Order
        int[] arr1 = { 3, 1, 5, 4, 2 };
        sortOneToN(arr1);
        System.out.println("Random   : " + Arrays.toString(arr1));

        // Best Case - Already Sorted
        int[] arr2 = { 1, 2, 3, 4, 5 };
        sortOneToN(arr2);
        System.out.println("Sorted   : " + Arrays.toString(arr2));

        // Worst Case - Reverse Sorted
        int[] arr3 = { 5, 4, 3, 2, 1 };
        sortOneToN(arr3);
        System.out.println("Reversed : " + Arrays.toString(arr3));

        // ---- Range [0, N] ----
        System.out.println("\n--- Range [0, N] ---");

        // Average Case - Random Order (N=5 cannot be placed, sits at last)
        int[] arr4 = { 3, 1, 5, 4, 0, 2 };
        sortZeroToN(arr4);
        System.out.println("Random   : " + Arrays.toString(arr4));

        // Best Case - Already Sorted
        int[] arr5 = { 0, 1, 2, 3, 4, 5 };
        sortZeroToN(arr5);
        System.out.println("Sorted   : " + Arrays.toString(arr5));
        // Worst Case - Reverse Sorted
        int[] arr6 = { 5, 4, 3, 2, 1, 0 };
        sortZeroToN(arr6);
        System.out.println("Reversed : " + Arrays.toString(arr6));
    }
}
