import java.util.Scanner;

public class Nesting_0_1_Tri {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows;
        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                int sum = i + j;
                if(sum % 2 == 0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
        }
        sc.close();
    }
}
