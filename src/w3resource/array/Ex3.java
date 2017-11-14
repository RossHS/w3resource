package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 14.11.2017
 */
public class Ex3 {
    public static void main(String[] args) {
        int rows = 5;
        int valInARow = 10;
        for (int i = 1; i <= rows * valInARow; i++) {
            System.out.print("- ");
            if (i % valInARow == 0) System.out.println();
        }
        System.out.println();

        int[][] val = new int[5][10];
        for (int[] aVal : val) {
            for (int anAVal : aVal) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
