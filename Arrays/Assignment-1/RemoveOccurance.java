package Assignment_1;//💡 **Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums
// in-place. The order of the elements may be changed. Then return the number of elements in nums
// which are not equal to val.Consider the number of elements in nums which are not equal to val be k,
// to get accepted, you need to do the following things:Change the array nums such that the first k
// elements of nums contain the elements which are not equal to val. The remaining elements of nums
// are not important as well as the size of nums.Return k.
//    Input: nums = [3,2,2,3], val = 3
//    Output: 2, nums = [2,2,_*,_*]

import java.util.Arrays;

public class RemoveOccurance {
    public static void main(String[] args) {
        int []arr={3,2,2,3};
        int val=3;
        System.out.println("The value of K is: "+changearr(arr,val));
    }
    static int changearr(int[]arr, int val){
        int[]arr2=new int[arr.length];
        int k=0;  //Variable that show the number of elements which are not equal to val
        for (int i=0,j=0;i<arr.length;i++){
            if (arr[j]!=val){
                arr2[j]=arr[i];
                j++;
                k++;
            }
        }
        System.out.println("The Modified array is: "+Arrays.toString(arr2));
        return k;
    }
}


