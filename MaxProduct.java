//Q13> Given an integer array nums, find three numbers whose product is maximum and return the maximum product.


//code: 

import java.util.Arrays;

public class MaxProduct {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                        nums[0] * nums[1] * nums[n - 1]);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(maximumProduct(nums));
    }
}