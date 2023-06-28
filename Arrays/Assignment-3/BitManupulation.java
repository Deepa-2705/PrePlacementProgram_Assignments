package Assignment_3;
//Question 6
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Example 1:
//Input: nums = [2,2,1]
//Output: 1

class BitManupulation {
    public static void main(String[] args) {
        int[]arr={2,2,1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }
}
