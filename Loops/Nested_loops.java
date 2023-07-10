import java.util.Scanner;

public class Nested_loops{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;

        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter the symbol or numeric value you would like to add? ");
        symbol = sc.next();

        for (int i = 1; i<=rows; i++){                      // This is a nested loop.
            System.out.println();
            for (int j = 1; j<=columns; j++){               // Inside a (for) loop there is another (for) loop.
                System.out.print(symbol);
            }
        }
        sc.close();
    }
}