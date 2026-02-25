import java.util.Arrays;

public class P_01_Bubble_Sort {

    /**
     * ? Algo:- Repeatedly Swap Two Adjacent Elements If They Are In Wrong Order.
     *
     * ! Time Complexity:-
     * ~ Worst Case (Reverse Sorted) -> O(N^2)
     * ~ Average Case (Random Order) -> O(N^2)
     * ~ Best Case (Already Sorted) -> O(N) [Due To Early Exit]
     *
     * * Space Complexity:- O(1) [In-Place Sorting]
     *
     * ? Stable:- Yes. [Equal Elements Are Never Swapped, Order Preserved]
     */

    // Todo:- Method To Implement Bubble Sort.
    public static void sort(int[] arr) {
        int n = arr.length;

        // Outer Loop For No. Of Passes.
        // After Each Pass, The Largest Unsorted Element Settles At The End.
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;

            // Inner Loop For Comparison & Swapping.
            // (n - i - 1) Because Last i Elements Are Already Sorted.
            for (int j = 0; j < n - i - 1; j++) {
                // Check For Wrong Order.
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }

            // Early Exit:- If No Swap Occurred, Array Is Already Sorted.
            if (!isSwapped)
                break;
        }
    }

    // Todo:- Method To Swap Two Numbers In An Array.
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        // Average Case - Random Order
        int[] arr1 = { 5, 1, 3, 2, 4 };
        sort(arr1);
        System.out.println("Random   : " + Arrays.toString(arr1));

        // Best Case - Already Sorted (Early Exit After 1 Pass)
        int[] arr2 = { 1, 2, 3, 4, 5 };
        sort(arr2);
        System.out.println("Sorted   : " + Arrays.toString(arr2));

        // Worst Case - Reverse Sorted
        int[] arr3 = { 5, 4, 3, 2, 1 };
        sort(arr3);
        System.out.println("Reversed : " + Arrays.toString(arr3));
    }

}