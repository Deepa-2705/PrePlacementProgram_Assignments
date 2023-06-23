package Assignment_2;
//Que 4: You have a long flowerbed in which some plots are planted, and some are not.
//However, flowers cannot be planted in adjacent plots.Given an integer array flowerbed containing 0's and
// 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be
// planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
public class CanPlaceFlower {
    public static void main(String[] args) {
        int[]arr={1,0,0,0,1};
        int n=1;
        System.out.println("Can we place flower: "+canPlaceFlowers(arr,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }

        int len = flowerbed.length;
        int count = 1;  // count the number of continous empty plots.
        int rst = 0;    // the total number of empty plots that coule be planted.
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                count++;
            } else {
                rst += (count - 1) / 2;
                count = 0;
            }
        }

        if (count != 0) {
            rst += count / 2;
        }

        return rst >= n;
    }
}
