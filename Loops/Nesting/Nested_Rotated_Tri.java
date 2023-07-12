import java.util.Scanner;

public class Nested_Rotated_Tri {
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
            for(int j = 1; j <= (rows-i) ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        sc.close();
    }
}