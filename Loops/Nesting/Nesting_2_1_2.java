import java.util.Scanner;

public class Nesting_2_1_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows;

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= (rows-i); j++)          // Printing of spaces.
            {
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }

            for(int j = 2; j <= i; j++)              // Priting of symbol.
            {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}