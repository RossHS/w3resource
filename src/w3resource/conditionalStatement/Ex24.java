package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 11.11.2017
 */
public class Ex24 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0, spacer = rows; i < rows; i++, spacer--) {
            for (int j = spacer; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
