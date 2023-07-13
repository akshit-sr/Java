import java.util.Scanner;

public class Nesting_Floyd_Tri
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int rows;
        int number = 1;

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();

        for(int i = 1; i <= rows ; i++)
        {
            for(int j = 1; j <= rows-i+1; j++)
            {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
        sc.close();
    }
}
