package Assignment_5;
//Question 5:Given two integer arrays arr1 and arr2, and the integer d, *return the distance value between
// the two arrays*.The distance value is defined as the number of elements arr1[i] such that there is not
// any element arr2[j] where |arr1[i]-arr2[j]| <= d.
//**Input:** arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
//**Output:** 2

import java.util.Arrays;

class DistanceBetween2Value {
    public static void main(String[] args) {
        int[]arr1={4,5,8};
        int[]arr2={10,9,1,8};
        int d=2;
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distance = 0;

        for (int val : arr1) {
            if (notInRange(arr2, val - d, val + d)) {
                distance++;
            }
        }

        return distance;
    }

    // Checks if the array doesn't contain any value in range (from <= value <= to) using binary search
    private static boolean notInRange(int[] arr, int from, int to) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= from && arr[mid] <= to) {
                return false;
            } else if (arr[mid] < from) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return true;
    }
}
