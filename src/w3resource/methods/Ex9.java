package w3resource.methods;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 26.12.2017
 */
public class Ex9 {
    public static void print(char a, char b) {
        for (int spacer = 1; a <= b; spacer++, a++) {
            System.out.print(a + " ");
            if (spacer % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        print('A', 'P');
    }
}
