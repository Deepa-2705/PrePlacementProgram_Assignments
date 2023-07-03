package Assignment_7;
//Question 2: Given a string num which represents an integer, return true if num is a strobogrammatic number
//A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
//Input: num = "69"
//Output:true

import java.util.HashMap;
import java.util.Map;

class Strobogrammatic {
    public static void main(String[] args) {
        String num="69";
        System.out.println(isStrobogrammatic(num));
    }
    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        int l = 0, r = num.length() - 1;
        while (l <= r) {
            if (!map.containsKey(num.charAt(l))) return false;
            if (map.get(num.charAt(l)) != num.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
