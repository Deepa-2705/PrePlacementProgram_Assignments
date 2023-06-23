package Assignment_2;
//Que 6:Given an array of integers nums which is sorted in ascending order, and an integer target,
//write a function to search target in nums. If target exists, then return its index. Otherwise,
//return -1.You must write an algorithm with O(log n) runtime complexity.
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={-1,0,3,5,9,12};
        int target=9;
        System.out.println("The element is found at index: "+binarysearch(arr,target));
    }
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
