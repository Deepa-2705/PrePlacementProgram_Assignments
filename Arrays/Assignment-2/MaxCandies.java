package Assignment_2;
//Que 2: Alice has n candies, where the ith candy is of type candyType[i].Alice noticed that she started
// to gain weight, so she visited a doctor.The doctor advised Alice to only eat n / 2 of the candies
// she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number
// of different types of candies while still following the doctor's advice.Given the integer array candyType
// of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

import java.util.HashSet;
import java.util.Set;

public class MaxCandies {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,3};
        System.out.println("The number of unique candies she can eat:"+differentcandy(arr));
    }
    static int differentcandy(int []C){
                Set<Integer> cset = new HashSet<>();
                for (int c : C) cset.add(c);
                return Math.min(cset.size(), C.length / 2);
    }
}
