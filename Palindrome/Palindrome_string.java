
import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a String to check: ");
        String s = sc.next();
        String rev = "";

        for (int i = s.length() -1; i >=0 ; i--){
            rev = rev + s.charAt(i);
        }

        if (s.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
