package Assignment_4;
//Question 3:Given a 2D integer array matrix, return *the **transpose** of* matrix.The **transpose** of a
//matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    static int[][] transpose(int[][]arr){
        //number of rows
        int r=arr.length;
        //no of columns
        int c=arr[0].length;
        int [][]result=new int[c][r];
        for (int i=0;i< r;i++){
            for (int j=0;j<c;j++) {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }
}
