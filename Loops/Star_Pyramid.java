package Nested_Loops;

import java.util.Scanner;

public class Star_Pyramid {
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(k = 0; k <= 5-i; k++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        sc.close();
    }
}
