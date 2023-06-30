package Assignment_5;
//Question 6:Given an integer array nums of length n where all the integers of nums are in the range [1, n]
// and each integer appears **once** or twice, return *an array of all the integers that appears twice.
//You must write an algorithm that runs in O(n) time and uses only constant extra space.
//Input: nums = [4,3,2,7,8,2,3,1]
//Output:[2,3]

import java.util.ArrayList;
import java.util.List;

public class TwiceInArray {
    public static void main(String[] args) {
        int []nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        final List<Integer> duplicates = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            final int n = Math.abs(nums[i]);
            if(nums[n - 1] < 0) {
                duplicates.add(n);
            } else {
                nums[n - 1] *= -1;
            }
        }
        return duplicates;
    }
}
