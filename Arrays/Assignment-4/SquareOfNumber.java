package Assignment_4;
//Question 6:Given an integer array nums sorted in **non-decreasing** order, return an array of the squares
//of each number** sorted in non-decreasing order.
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//**Explanation:** After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100]

import java.util.Arrays;

class SquareOfNumber {
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] nums) {
        for(int i = 0;i<nums.length;i++)
        {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
