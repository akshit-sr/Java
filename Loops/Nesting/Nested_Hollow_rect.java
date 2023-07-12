import java.util.Scanner;

public class Nested_Hollow_rect {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        String symbol;

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter # of columns: ");
        columns = sc.nextInt();
        System.out.print("Enter a symbol: ");
        symbol = sc.next();

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= columns; j++){
                if(i == 1 || i == rows || j == 1 || j == columns)           //This is a nested loop
                {                                                           //of Hollow Rectangle.s
                    System.out.print(symbol);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}