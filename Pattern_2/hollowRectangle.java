package Pattern_2;

import java.util.Scanner;

public class hollowRectangle {

    public static void hollow_rectangle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = scan.nextInt();
        hollow_rectangle(row, col);
        scan.close( );
    }
}
