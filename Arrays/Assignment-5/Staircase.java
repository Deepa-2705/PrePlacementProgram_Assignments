package Assignment_5;
//Question 2:You have n coins and you want to build a staircase with these coins. The staircase consists
// of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.
//Given the integer n, return *the number of **complete rows** of the staircase you will build*.
//**Input:** n = 5
//**Output:** 2

class Staircase {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        int count = 0;
        int level = 1;
        while(n >= level){
            count++;
            n = n - level;
            level++;
        }
        return count;
    }
}

