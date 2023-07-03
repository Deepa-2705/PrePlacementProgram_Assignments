package Assignment_8;
//Question 2*: Given a string s containing only three types of characters: '(', ')' and '*', return true
// *if* s *is **valid***.The following rules define a **valid** string:
//- Any left parenthesis '(' must have a corresponding right parenthesis ')'.
//- Any right parenthesis ')' must have a corresponding left parenthesis '('.
//- Left parenthesis '(' must go before the corresponding right parenthesis ')'.
//- '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
//Input: s = "()"
//Output:true

class ValidString {
    public static void main(String[] args) {
        String s="()";
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {
        int openCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                openCount--;
            }
            if (openCount < 0) return false;    // Currently, don't have enough open parentheses to match close parentheses-> Invalid
            // For example: ())(
        }
        return openCount == 0; // Fully match open parentheses with close parentheses
    }
}
