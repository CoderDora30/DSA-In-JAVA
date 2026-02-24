public class P_04_Binary_Search {

    /**
     * (1) Start by checking the middle element of the list or array.
     * (2) If the middle element is equal to the target element, the search is
     * complete.
     * (3) If the target element is less than the middle element, repeat the search
     * process in the left half of the array.
     * (4) If the target element is greater than the middle element, repeat the
     * search process in the right half of the array.
     * (5) Repeat the process until the target element is found or it can be proven
     * that the element doesn't exist in the array.
     * (6) Time Complexity = O(log*n) & Space Complexity = O(1).
     */

    // Todo:- Binary Search For Increasing Order Sorted Array.
    public static int searchINC(int[] arr, int target) {
        int len = arr.length;
        int start_idx = 0, end_idx = len - 1, mid_idx;

        while (start_idx <= end_idx) {
            mid_idx = start_idx + (end_idx - start_idx) / 2;

            if (arr[mid_idx] == target) {
                return mid_idx;
            } else if (arr[mid_idx] > target) {
                end_idx = mid_idx - 1;
            } else {
                start_idx = mid_idx + 1;
            }
        }
        return -1; // Target Not Found.
    }
    // *---------------------------------------------------------------------------------------------

    // Todo:- Binary Search For Decreasing Order Sorted Array.
    public static int searchDEC(int[] arr, int target) {
        int n = arr.length;
        int start_idx = 0, end_idx = n - 1, mid_idx;

        while (start_idx <= end_idx) {
            mid_idx = start_idx + (end_idx - start_idx) / 2;

            // Check If Middle Element Is Our Target.
            if (arr[mid_idx] == target) {
                return mid_idx;
            } else if (arr[mid_idx] > target) {
                start_idx = mid_idx + 1;
            } else {
                end_idx = mid_idx - 1;
            }
        }

        return -1; // Target Not Found.
    }
    // *---------------------------------------------------------------------------------------------

    // Todo:- Binary Search For Unknown Order Sorted Array.
    public static int OABS(int[] arr, int target) {
        int n = arr.length;
        int start_idx = 0, end_idx = n - 1, mid_idx;

        while (start_idx <= end_idx) {
            mid_idx = start_idx + (end_idx - start_idx) / 2;

            // Check If Middle Element Is Our Target.
            if (arr[mid_idx] == target) {
                return mid_idx;
            }

            // Check if Array Is Sorted In Ascending Order.
            else if (arr[start_idx] < arr[end_idx]) {
                if (arr[mid_idx] > target) {
                    start_idx = mid_idx + 1;
                } else {
                    end_idx = mid_idx - 1;
                }
            }

            // Check If Array Is Sorted In Descending Order.
            else {
                if (arr[mid_idx] > target) {
                    start_idx = mid_idx + 1;
                } else {
                    end_idx = mid_idx - 1;
                }
            }
        }

        return -1; // Target Not Found.
    }

    public static void main(String[] args) {
        int[] incArr = { 3, 7, 12, 19, 35 };
        System.out.println(searchINC(incArr, 3));

        int[] decArr = { 35, 19, 12, 7, 3 };
        System.out.println(searchDEC(decArr, 3));

        System.out.println(OABS(decArr, 19));
    }
}