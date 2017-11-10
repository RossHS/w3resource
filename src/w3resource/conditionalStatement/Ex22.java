package w3resource.conditionalStatement;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 10.11.2017
 */
public class Ex22 {
    public static void main(String[] args) {
        int no_row, c = 1, blk, i, j;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        no_row = in.nextInt();
        in.close();
        for (i = 0; i < no_row; i++) {
            for (blk = 1; blk <= no_row - i; blk++)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
