package Assignment_1;//💡 **Q3.** Given a sorted array of distinct integers and a target value, return the index if the target
// is found.If not, return the index where it would be if it were inserted in order.You must write an
// algorithm with O(log n) runtime complexity.
//        Input: nums = [1,3,5,6], target = 5
//        Output:2

public class TargetIndex {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int target=5;
        System.out.println("Index will be: "+BinarySearch(arr,target));
    }
    static int BinarySearch(int[]arr,int target){
        int start=0;
        int end= arr.length-1;
        int ans=arr.length; //if target element is greater than every other element
        while(start<end){
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                else if (arr[mid] < target) {
                    start = mid +1;
                }
                else {
                    ans=mid;
                    end=mid-1;
                }
        }
        return ans;
    }
}
