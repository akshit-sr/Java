package DSA.Linear_Search;

//Linear Search:- O(n).

public class Linear_Search {
 public static void main(String[] args) {
     int[] num = {23, 56, 78, 89, 99};
     int target = 78;
     int ans = linearSearch(num, target);
     System.out.print("Ans is: "+ans);
 }
 static int linearSearch(int[] num, int target){
     if(num.length == 0)
     {
         return -1;
     }

     for( int i = 0; i < num.length; i++){
         int element = num[i];
         if (element == target)
             return i;
     }
 return 0;
 }
}