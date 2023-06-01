package ArraysClass;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
         // System.arraycopy();
        // arrays.toString();
        // Arrays.deepToString();
        // arrays.sort();
        // Arrays.binarySearch();

        int[] num = new int[]{1, 2, 3};
        int[] nums = new int[]{1, 2, 3};

        // num.clone(); -> exact copy

        // boolean: true || false
        System.out.println(num.equals(nums)); // addresses
        System.out.println(Arrays.equals(num, nums)); // values

        // 1, 0, -1 -> integer representation
        System.out.println(Arrays.compare(num, nums));

//        Arrays.copyOf();
//        Arrays.fill(); -> array, одно значение автоматом
//        Arrays.copyOfRange();
    }
}
