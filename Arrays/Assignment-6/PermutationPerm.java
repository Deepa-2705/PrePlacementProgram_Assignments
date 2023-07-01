package Assignment_6;
//Question 1: A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented
// as a string s of length n where:
// s[i] == 'I' if perm[i] < perm[i + 1], and s[i] == 'D' if perm[i] > perm[i + 1].
//Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations
//perm, return **any of them**.
//Input: s = "IDID"
//Output:[0,4,1,3,2]

import java.util.Arrays;

class PermutationPerm {
    public static void main(String[] args) {
        String s="IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }
    public static int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int end = result.length - 1, start = 0;
        int index = 0;
        while(index < s.length()){
            if(s.charAt(index) == 'I'){
                result[index] = start;
                start++;
            }else{
                result[index] = end;
                end--;
            }
            index++;
        }
        result[result.length - 1] = start;
        return result;
    }
}