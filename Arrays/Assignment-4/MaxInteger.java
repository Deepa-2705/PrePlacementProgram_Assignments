package Assignment_4;
//Question 7: You are given an m x n matrix M initialized with all 0's and an array of operations ops, where
//ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.
//Count and return *the number of maximum integers in the matrix after performing all the operations*
//**Input:** m = 3, n = 3, ops = [[2,2],[3,3]]
//**Output:** 4
//**Explanation:** The maximum integer in M is 2, and there are four of it in M. So return 4.

class MaxInteger {
    public static void main(String[] args) {
        int[][]arr={
                {2,2},
                {3,3}
        };
        int m=3;
        int n=3;
        System.out.println(maxCount(m,n,arr));
    }
    public static int maxCount(int m, int n, int[][] ops) {
        int min_row = m;
        int min_col = n;
        for (int i=0; i<ops.length; i++){
            if (ops[i][0]<min_row) min_row=ops[i][0];
            if (ops[i][1]<min_col) min_col=ops[i][1];
        }
        return min_row*min_col;

    }
}
