//💡 **Q4.** You are given a large integer represented as an integer array digits, where each
// digits[i] is the ith digit of the integer. The digits are ordered from most significant to the least
// significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.
//        Input: digits = [1,2,3]
//        Output: [1,2,4]

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println("The array is: "+ Arrays.toString(sumdigit(arr)));
    }
    static int[] sumdigit(int[]arr){
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]<9){
                arr[i]++;
                return arr;
            }
            else {
                arr[i]=0;
            }
        }
        arr=new int[arr.length+1];
        arr[0]=1;

        return arr;
    }
}
