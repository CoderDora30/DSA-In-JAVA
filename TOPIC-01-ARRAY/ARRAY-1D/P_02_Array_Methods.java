import java.util.Arrays;

public class P_02_Array_Methods {

    public static void main(String[] args) {
        int[] arr = { 4, 2, 6, 5, 7, 9, 12 };

        // * (1) Arrays.toString() – Printing an Array.
        System.out.println(Arrays.toString(arr));

        // * (2) Arrays.fill() – Filling an Array with a given Value.
        int[] arr2 = new int[5];
        Arrays.fill(arr2, 10);
        System.out.println(Arrays.toString(arr2));

        // * (3) Arrays.equals() – Comparing Two Arrays.
        System.out.println(Arrays.equals(arr, arr2));

        // * (4) Arrays.copyOf() – Copying an Array.
        int[] shorter = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(shorter)); // [4, 2, 6]

        int[] longer = Arrays.copyOf(arr, 8);
        System.out.println(Arrays.toString(longer)); // [4, 2, 6, 5, 7, 9, 12, 0]

        // * (5) Arrays.copyOfRange() – Copying a Subarray.
        int[] sub = Arrays.copyOfRange(arr, 1, 4); // indices 1 to 3
        System.out.println(Arrays.toString(sub)); // [2, 6, 5]

        // * (6) Arrays.sort() – Sorting an Array.
        Arrays.sort(sub);
        System.out.println(Arrays.toString(sub)); // [2, 5, 6]
    }
}