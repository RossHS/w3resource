package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 09.11.2017
 */
public class Ex18 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }
}
