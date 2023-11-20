
public class Linear_Search {
    public static void main(String[] args) {
        int[] num = {23, 56, 78, 89, 99};
        int target = 78;
        int ans = linearSearch(num, target);
        System.out.print("Ans is: "+ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0)
        {
            return -1;
        }

        for( int i = 0; i < arr.length; i++){
            int element = arr[i];
            if (element == target)
                return i;
        }
    return 0;
    }
}