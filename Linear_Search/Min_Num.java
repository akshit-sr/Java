
public class Min_Num {
    public static void main(String[] args){
        int[] arr = {12, 34, 56, -76, -92};
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans)         // Here when we change the sign to '>' it will the max^m value. For, now it's mini.
                ans = arr[i];
        }
        return ans;
    }
}
