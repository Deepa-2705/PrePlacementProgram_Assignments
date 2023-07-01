package Assignment_6;
//Question 2: You are given an m x n integer matrix with the following two properties:
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true *if* target *is in* matrix *or* false *otherwise*.You must write a
//solution in O(log(m * n)) time complexity.
// Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output:** true

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][]arr={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target=3;
        System.out.println(searchin2D(arr,target));
    }
    static boolean searchin2D(int[][]arr,int target){
        //No of rows
        int m= arr.length;
        //No of columns
        int n=arr[0].length;
        if (n==0){
            return false;
        }
        int low=0;
        int high=m*n-1;
        int midind,midele,rowind,colind;
        while (low<=high){
            midind=low+(high-low)/2;
            rowind=midind/n;
            colind=midind%n;
            midele=arr[rowind][colind];
            if (midele==target){
                return true;
            }
            else if (midele<target){
                low=midind+1;
            }
            else {
                high=midind-1;
            }
        }
        return false;
    }
}

