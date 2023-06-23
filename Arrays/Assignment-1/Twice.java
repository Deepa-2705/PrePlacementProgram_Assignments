package Assignment_1;

import java.util.Arrays;

//💡 **Q6.** Given an integer array nums, return true if any value appears at least twice
// in the array, and return false if every element is distinct.
//        Input: nums = [1,2,3,1]
//        Output: true
public class Twice {
    public static void main(String[] args) {
        int[]arr={1,2,3,1};
        System.out.println(twice(arr));
    }
    static boolean twice(int[]arr){
        Arrays.sort(arr);
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
