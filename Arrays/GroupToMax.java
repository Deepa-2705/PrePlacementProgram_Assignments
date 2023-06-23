package Assignment_2;
//Que 1: Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),...,
// (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
//        Input: nums = [1,4,3,2]
//        Output: 4
//        **Explanation:** All possible pairings (ignoring the ordering of elements) are:
//        1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
//        2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
//        3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
//        So the maximum possible sum is 4
import java.util.Arrays;

public class GroupToMax {
    public static void main(String[] args) {
        int[]arr={1,4,3,2};
        System.out.println(arrayPairSum(arr));
    }

    static int arrayPairSum(int[] nums) {
            //Sorting the array in least time

            Arrays.sort(nums);

            int sum = 0;
            for( int i = 0; i < nums.length; i = i + 2 )
                sum += nums[i];

            return sum;

    }
}
