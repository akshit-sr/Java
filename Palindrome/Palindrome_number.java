
import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[]args){
        int n,r,c,s = 0;
        System.out.print("Enter any number: ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        c = n;

        while(n > 0)
        {
            r = n % 10;
            s = (s * 10) + r;
            n = n/10;
        }

        if (c == s)
        {
            System.out.println("The number is palindrome number.");
        }
        else
        {
            System.out.println("The number is NOT palindrome number.");
        }
    }
}
