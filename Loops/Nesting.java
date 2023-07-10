import java.util.Scanner;

public class Nesting {
    int m , n;
    Scanner sc = new Scanner(System.in);
    Nesting (int x, int y)
    {
        System.out.println("Hello! Let's find out which numbers big?");
        System.out.print("Enter value of m: ");
        m = sc.nextInt();
        System.out.print("Enter value of n: ");
        n = sc.nextInt();
    }
    int largest()
    {
        if (m >= n)
            return(m);
        else
            return(n);

    }
    void display()
    {
        int large = largest();
        System.out.println("Oh ho! Our largest value is "+large);
    }
    public static void main(String[]args){
        Nesting nest = new Nesting(0 , 0);                          //Do not remove x and y cuz if removed
        nest.display();                                                  //sc.nextInt() won't get printed but instead 0
    }                                                                    //gets printed!
}
