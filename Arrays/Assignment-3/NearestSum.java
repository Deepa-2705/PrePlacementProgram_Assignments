package Assignment_3;
//Question 1: Given an integer array nums of length n and an integer target, find three integers
//in nums such that the sum is closest to the target.Return the sum of the three integers.
//You may assume that each input would have exactly one solution.
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2

import java.util.Arrays;

public class NearestSum {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(arr,target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest_sum = nums[0] + nums[1] + nums[2]; // initialize ,sum
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) { // two-pointer approach
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) { // sum equals target, return immediately
                    return sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
                if (Math.abs(sum - target) < Math.abs(closest_sum - target)) { // update closest sum
                    closest_sum = sum;
                }
            }
        }
        return closest_sum;
    }
}
