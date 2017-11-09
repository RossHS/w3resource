package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 09.11.2017
 */
public class Ex16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
