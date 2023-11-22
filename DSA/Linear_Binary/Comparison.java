class Comparison {                                          // Check at the bottom to see how to find the recursive method!
    public static void main(String[] args) {
        int[] nums = {56, 45, 33, 67, 99, 87, 23};
        int target = 67;

        int result1 = linearsearch(nums, target);
        int result2 = binarysearch(nums, target);
        int result3 = recursive(nums, target, 0, nums.length-1);

        if(result1 != -1)
            System.out.println("(Linear)Element found at Index: " + result1);
        else
            System.out.println("(Linear)Element not found!");
        
        if(result2 != -1)
            System.out.println("(Binary)Element found at Index: " + result2);
        else
            System.out.println("(Binary)Element not found!");
    
        if(result3 != -1)
            System.out.println("(Recursive method) Element found at index: " + result3);
        else
            System.out.println("Element not found!");
    }   

    // Linear Search's code! Here steps is used for counting how much steps it took to find the number.
    static int linearsearch(int[] arr, int target) {
        int steps = 0;
        if(arr.length == 0) {
            return -1;
        }

        for( int i = 0; i < arr.length; i++) {
            steps++;
            int element = arr[i];
            if (element == target) {
                System.out.println("Steps taken by linear: " + steps);
                return i;
            }
        }
    System.out.println("Steps taken by linear: " + steps);
    return -1;
    }

    // Binary Search's code! Here steps is used for counting how much steps it took to find the number.
    static int binarysearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            steps++;

            int mid = (left + right)/2;

            if(nums[mid] == target) {
                System.out.println("Steps taken by binary: " + steps);
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
    System.out.println("Steps taken by the binary: "+ steps);
    return -1;
    }
 
    
    public static int recursive(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right)/2;
            if (nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                return recursive(nums, target, mid + 1, right);
            else
                return recursive(nums, target, left, mid - 1);
        }
        return -1;
    }
}