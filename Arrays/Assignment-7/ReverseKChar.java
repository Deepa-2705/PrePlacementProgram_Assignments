package Assignment_7;
//Question 5: Given a string s and an integer k, reverse the first k characters for every 2k characters
// counting from the start of the string.If there are fewer than k characters left, reverse all of them.
// If there are less than 2k but greater than or equal to k characters, then reverse the first k characters
// and leave the other as original.
//Input: s = "abcdefg", k = 2
//Output:"bacdfeg"

class ReverseKChar {
    public static void main(String[] args) {
        String s="abcdefg";
        int k=2;
        System.out.println(reverseStr(s,k));
    }
    public static String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        for(int i = 0 ; i <= n-1; i += 2*k){
            if(i+k-1 <= n-1){
                reverseK(i,i+k-1,str);
            }else{
                //for fewer than k characters left (edge case)
                reverseK(i,n-1,str);
            }
        }
        String ans = new String(str);
        return ans;
    }
    public static void reverseK(int i, int j, char[] str){
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}