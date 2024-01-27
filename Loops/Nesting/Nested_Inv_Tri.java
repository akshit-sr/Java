import java.util.Scanner;

public class Nested_Inv_Tri {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows;
        String symbol;

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter a symbol: ");
        symbol = sc.next();

        for(int i = rows; i >= 1; i--)                              // Here i = rows and i >= 1 happens(inversion)
        {
            for(int j = i; j >= 1; j--)                             // Here j = i and j >= 1 happens(inversion)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
        sc.close();
    }
}