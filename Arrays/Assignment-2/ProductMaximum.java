package Assignment_2;

//Que 5: Given an integer array nums, find three numbers whose product is maximum
// and return the maximum product.
//Example 1:
//Input: nums = [1,2,3]
//Output: 6

import java.util.Arrays;

public class ProductMaximum {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println("The Product of the maximun 3 values is: " +maximumProduct(arr));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int case1 = nums[0]*nums[1]*nums[nums.length-1];
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int maxProduct = Integer.max(case1, case2);
        return maxProduct;
    }
}
