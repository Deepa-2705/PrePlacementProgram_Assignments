//💡 **Q5.** You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.The final sorted array
// should not be returned by the function, but instead be stored inside the array nums1. To accommodate
// this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[]num1={1,2,3,0,0,0};
        int m=3;
        int []num2={2,5,6};
        int n=3;
        merge(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));
    }
    static void merge(int[]num1, int m, int[]num2, int n){
        int i=m-1;
        int j=n-1;
        int k=num1.length-1;
        while (j>=0){
            if (i>=0 && num1[i]>num2[j]){
                num1[k]=num1[i];
                k--;
                i--;
            }
            else {   //num2 become empty or i element will be greater
                num1[k]=num2[j];
                j--;
                k--;
            }
        }
    }
}
