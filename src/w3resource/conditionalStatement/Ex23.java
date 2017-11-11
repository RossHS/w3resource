package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 11.11.2017
 */
public class Ex23 {
    public static void main(String[] args) {
        int rows = 10;
        for (int i = rows, spacer = 0; i > 0; i--, spacer++) {
            for (int j = 0; j < spacer; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
