

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target value
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

       System.out.println(Arrays.toString(result));
    }

    // Function using for loops
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // return indices
                }
            }
        }
        return new int[]{}; // return empty if no solution
    }
    
}
