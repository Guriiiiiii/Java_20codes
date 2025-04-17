//Q13> Given an integer array nums, find a subarray that has the largest product, and return the product.

//code: 

public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = maxProd;
            maxProd = Math.max(Math.max(nums[i], maxProd * nums[i]), minProd * nums[i]);
            minProd = Math.min(Math.min(nums[i], tempMax * nums[i]), minProd * nums[i]);
            result = Math.max(result, maxProd);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int product = maxProduct(nums);
        System.out.println("Max Product: " + product);
    }
}
