package DSA.Linear_Search;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args){
        int[][] arr = {
                {17, 14, 3 ,4},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 12;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
    return new int[] {-1, -1};
    }
}
