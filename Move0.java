import java.util.Arrays;

//💡 **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order
// of the nonzero elements.Note that you must do this in-place without making a copy of the array.
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
public class Move0 {
    public static void main(String[] args) {
        int []arr={0,1,0,3,12};
        System.out.println(Arrays.toString(move0(arr)));
    }
    static int[] move0(int[]arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while (j< arr.length){
            arr[j]=0;
            j++;
        }
        return arr;
    }
}
