package Assignment_8;
//Question 6: Given two strings s and p, return *an array of all the start indices of* p*'s anagrams
// in* s. You may return the answer in any order.An **Anagram** is a word or phrase formed by rearranging
// the letters of a different word or phrase, typically using all the original letters exactly once.
//Input: s = "cbaebabacd", p = "abc"
//Output: [0,6]
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        System.out.println(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, sFreq)) {
            ans.add(0);
        }

        int i = 0, j = p.length();
        while (j < s.length()) {
            sFreq[s.charAt(i++) - 'a']--;
            sFreq[s.charAt(j++) - 'a']++;
            if (Arrays.equals(sFreq, pFreq)) {
                ans.add(i);
            }
        }

        return ans;
    }
}
