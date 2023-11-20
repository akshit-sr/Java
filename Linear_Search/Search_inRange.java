import java.util.Arrays;

public class Search_inRange {
    public static void main(String[] args){
        String name = "Riolux";
        char target = 'l';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(target);             // Not meant to be printed.
    }

    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        // run a loop
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
    return false;
    }
}
