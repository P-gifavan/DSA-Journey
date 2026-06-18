// Time Complexity:
// Best Case: O(1)  -> Element found at the first position
// Average Case: O(n) -> Element may be anywhere in the array
// Worst Case: O(n) -> Element found at the last position or not present
//
// Space Complexity:
// O(1) -> Uses constant extra space
import java.util.*;
public class Main {

    public static void main(String[] args) {

        int[] arr = {18, 12, -7, 3, 14, 28};

        System.out.println(linearSearch1(arr, 14));

        System.out.println(linearSearch(arr, 14));

        String name = "Pavan";
        System.out.println(linearSearch3(name, 'a'));

        System.out.println(linearSearch4(arr, 3, 2, 5));
    }

    // Returns index of target
    static int linearSearch1(int[] array, int target) {

        if (array.length == 0) {
            return -1;
        }

        int n = array.length;

        for (int i = 0; i < n; i++) {

            int element = array[i];

            if (element == target) {
                return i;
            }
        }

        return -1;
    }

    // Returns element if found
    static int linearSearch(int[] array, int target) {

        if (array.length == 0) {
            return -1;
        }

        for (int element : array) {

            if (element == target) {
                return element;
            }
        }

        return -1;
    }

    // Search character in string
    static boolean linearSearch3(String str, char ch) {

        if (str.length() == 0) {
            return false;
        }

        char[] array = str.toCharArray();
        int n = array.length;

        for (int i = 0; i < n; i++) {

            if (ch == array[i]) {
                return true;
            }
        }

        return false;
    }

    // Search in given range
    static int linearSearch4(int[] array, int target, int start, int end) {

        if (array.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {

            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
    // Return the minimum element in the array
    static int linearSearch5(int[] array) {

        if (array.length == 0) {
            return -1;
        }

        int min = array[0];

        for (int element : array) {

            if (element < min) {
                min = element;
            }
        }

        return min;
    }
    // Search in 2D array
    static int[] linearSearch6(int[][] array,int target) {
        if(array.length==0) {
            return new int[]{-1};
        }
        int rows = array.length;
        int cols = array[0].length;
        for(int i=0;i<rows;i++) {
            for(int j= 0;j<cols;j++) {
                if(array[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
    // Maximum element in the 2D array
    static int linearSearch7(int[][] array) {
        if(array.length==0) {
            return -1;
        }
        int rows = array.length;
        int cols = array[0].length;
        int max = array[0][0];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(array[i][j]>max) {
                    max = array[i][j];
                }
            }
        }
        return max
    }
    // Even length of Digit numbers in the array
    static int findNumbers(int[] array) {
        if(array.length==0) {
            return -1
        }
        int count = 0;
        for(int num : array) {
            String str = num.toString();
            if(str.length()%2==0){
                count++
            }
        }
        return count;
    }

}