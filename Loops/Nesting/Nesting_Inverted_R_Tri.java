import java.util.Scanner;

public class Nesting_Inverted_R_Tri {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows;
        String symbol;

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter a symbol: ");
        symbol = sc.next();

        for(int i = rows; i >= 1; i--)
        {
            for(int j = (rows-i); j >= 1; j--)
            {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}
