package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 10.11.2017
 */
public class Ex21 {
    public static void main(String[] args) {
        int rows = 10;
        for (int i = 1, spacer = rows; i <= rows; i++, spacer--) {
            for (int j = 0; j < spacer; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
        for (int i = rows, spacer = 1; i > 0; i--, spacer++) {
            for (int j = 0; j <= spacer; j++) {
                System.out.print(" ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }
}
