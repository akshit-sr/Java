import java.util.Scanner;

public class Nesting_Butterfly_Pattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows;
        String symbol;

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter a symbol: ");
        symbol = sc.next();


        for(int i = 1; i <= rows ; i++)
        {
            for(int j = 1; j <= i ; j++)            // Normal Tri
            {
                System.out.print(symbol);
            }

            for(int j = 1; j <= (rows-i) ; j++)     // Inverted of Above
            {
                System.out.print("  ");            // Make sure to leave 2 spaces.
            }
            for(int j = 1; j <= i; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        for(int i = rows; i >= 1; i--)
        {
            for(int j = i; j >= 1; j--)             // Rotated Tri
            {
                System.out.print(symbol);
            }

            for(int j = (rows-i); j >= 1 ; j--)     // Inverted of Above
            {
                System.out.print("  ");            // Make sure to leave 2 spaces.
            }
            for(int j = i; j >= 1; j--){
                System.out.print(symbol);
            }
            System.out.println();
        }
        sc.close();
    }
}
