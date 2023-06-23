package Assignment_1;

import java.util.Arrays;

//💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
// due to some error, one of the numbers in s got duplicated to another number in the set, which results
// in repetition of one number and loss of another number.You are given an integer array nums representing
// the data status of this set after the error.Find the number that occurs twice and the number that is
// missing and return them in the form of an array.
//        Input: nums = [1,2,2,4]
//        Output: [2,3]
public class MissingAndRepeat {
    public static void main(String[] args) {
        int[]nums={1,2,2,4};
        System.out.println("The missing and the repeated no are: "+ Arrays.toString(cyclicsort(nums)));
    }

    static int[] cyclicsort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;    //array start from 1 to n
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j=0;j<arr.length;j++){
            if (arr[j]!=j+1){
                return new int[]{j+1,arr[j]};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
