import java.util.Scanner;

public class Nesting_Number_Pyra {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();
        
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <=(rows-i); j++)           //Printing of spaces.
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++)                 //Printing of number.
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
