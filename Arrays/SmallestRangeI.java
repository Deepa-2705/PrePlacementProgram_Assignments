package Assignment_2;
//Que 8: You are given an integer array nums and an integer k.In one operation, you can choose any index i
// where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k].
// You can apply this operation at most once for each index i.The score of nums is the difference between
// the maximum and minimum elements in nums.Return the minimum score of nums after applying the mentioned
// operation at most once for each index in it.
//Input: nums = [1], k = 0
//Output: 0
//Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.

public class SmallestRangeI {
    public static void main(String[] args) {
        int[]arr={1};
        int k=0;
        System.out.println("Minimum score of nums is: "+smallestRangeI(arr,k));
    }
    public static int smallestRangeI(int[] A, int K) {
        int mx = A[0], mn = A[0];
        for (int a : A) {
            mx = Math.max(mx, a);
            mn = Math.min(mn, a);
        }
        return Math.max(0, mx - mn - 2 * K);
    }
}
