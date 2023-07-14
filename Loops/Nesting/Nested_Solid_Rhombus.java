import java.util.Scanner;

public class Nested_Solid_Rhombus {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows;
        String symbol;

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter a symbol: ");
        symbol = sc.next();

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= (rows-i); j++)          // Printing of Spaces.
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= rows; j++)
            {
                System.out.print(symbol);               // Printing of Symbol.
            }
            System.out.println();
        }

        sc.close(); 
    }
    
}
