package Assignment_8;
//Question 5: Given an array of characters chars, compress it using the following algorithm:Begin with an
// empty string s. For each group of **consecutive repeating characters** in chars:
//- If the group's length is 1, append the character to s.
//- Otherwise, append the character followed by the group's length.
//The compressed string s **should not be returned separately**, but instead, be stored **in the input
// character array chars**. Note that group lengths that are 10 or longer will be split into multiple
//characters in chars.After you are done **modifying the input array, return *the new length of the array.
//You must write an algorithm that uses only constant extra space.
//Input: chars = ["a","a","b","b","c","c","c"]
//Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
//The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

class ModifiedArray {
    public static void main(String[] args) {
        char[] chars={'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        int i=0;
        int n=chars.length;
        int j=0;
        if(n==1)
            return 1;
        while(i<n){
            int count=1;
            char charac=chars[i];
            while(i+1<n && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            if(count==1){
                chars[j++]=charac;
            }
            else{
                if(count>1){
                    chars[j++]=charac;
                    String counterstring=count+"";
                    for(int r=0;r<counterstring.length();r++){
                        chars[j++]=counterstring.charAt(r);
                    }
                }
            }
            i++;
        }
        return j;
    }
}