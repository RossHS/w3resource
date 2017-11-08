package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.11.2017
 */
public class Ex14 {
    private static void printMultiTable(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ex14.printMultiTable(5);
        Ex14.printMultiTable(10);
    }
}
