import java.util.Arrays;

public class P_02_Selection_Sort {

    /**
     * ? Algo:- Find The Minimum Element From Unsorted Part & Place It At The
     * Beginning Of The Unsorted Part.
     *
     * ! Time Complexity:-
     * ~ Worst Case (Reverse Sorted) -> O(N^2)
     * ~ Average Case (Random Order) -> O(N^2)
     * ~ Best Case (Already Sorted) -> O(N^2) [No Early Exit Possible]
     *
     * * Space Complexity:- O(1) [In-Place Sorting]
     *
     * ? Stable:- No. [A Non-Adjacent Swap Can Change The Order Of Equal Elements]
     */

    // Todo:- Method To Implement Selection Sort.
    public static void sort(int[] arr) {
        int n = arr.length;

        // Each Pass Places The Minimum Of The Unsorted Part At Index i.
        for (int i = 0; i < n - 1; i++) {

            // Assume The First Element Of Unsorted Part Is The Minimum.
            int minIdx = i;

            // Find The Actual Minimum In The Remaining Unsorted Part.
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }

            // Swap Only If A Smaller Element Was Found.
            if (minIdx != i)
                swap(arr, minIdx, i);
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
        int[] arr1 = { 5, 9, 2, 8, 0, 4 };
        sort(arr1);
        System.out.println("Random   : " + Arrays.toString(arr1));

        // Best Case - Already Sorted (Still O(N^2), No Early Exit)
        int[] arr2 = { 0, 2, 4, 5, 8, 9 };
        sort(arr2);
        System.out.println("Sorted   : " + Arrays.toString(arr2));

        // Worst Case - Reverse Sorted
        int[] arr3 = { 9, 8, 5, 4, 2, 0 };
        sort(arr3);
        System.out.println("Reversed : " + Arrays.toString(arr3));
    }
}