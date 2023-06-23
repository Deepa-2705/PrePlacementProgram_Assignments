package Assignment_1;//💡 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers
//    such that they add up to target.You may assume that each input would have exactly one solution,
//    and you may not use the same element twice.You can return the answer in any order.
//    Input: nums = [2,7,11,15], target = 9
//    Output0 [0,1]

import java.util.Arrays;

public class AddIndices {
      public static void main(String[] args) {
            int[]arr={2,7,11,15};
            int target=9;
            System.out.println("Indices whose sum is equal to target: "+ Arrays.toString(Targetno(arr,target)));
      }
      static int[] Targetno(int[]arr,int target){
            for (int i=0;i<arr.length;i++) {
                  if (arr[i] >target){
                        i++;
                  }
                  else if(arr[i]+arr[i+1]==target){  //Take addition of only 2 numbers
                        return new int[]{i,i+1};
                  }
            }
            return new int[]{-1,-1};  //if element not found return index -1
      }
}
