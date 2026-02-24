public class P_03_Linear_Search {

    // Todo:- Linear Search => Compare Every Element With The Target Element.

    // * Time Complexity = O(n) & Space Complexity = O(1).
    public static int search(int[] arr, int target) {
        int n = arr.length;
        for (int idx = 0; idx < n; idx++) {
            if (arr[idx] == target) {
                return idx;
            }
        }
        return -1; // Target Not Found.
    }

    public static void main(String[] args) {
        int[] arr = { 12, 1, 5, 3, 90, 30 };
        System.out.println(search(arr, 90));
    }
}