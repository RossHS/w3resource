package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 30.11.2017
 */
public class Ex37 {
    static void printMatrix(int[][] a) {
        for (int[] anA : a) {
            for (int anAnA : anA) {
                System.out.print(anAnA + " ");
            }
            System.out.println();
        }
    }

    static void printDiagonals(int[][] a) {
        int[][] digmax = new int[a.length * 2 - 1][];
        int row = 0;
        int column = 0;
        boolean reverse = false;
        for (int i = 0, t = 1; i < digmax.length; i++) {
            int[] temp;
            if (i < a.length) {
                temp = new int[i + 1];
            } else {
                temp = new int[a.length - t];
                t++;
            }
            if (temp.length == a.length) {
                reverse = true;
            }
            if (!reverse) {
                row = 0;
                column = temp.length - 1;
            } else {
                row = a.length - temp.length;
                column = a.length - 1;
            }
            for (int j = 0; j < temp.length; j++) {
                temp[j] = a[row][column];
                row++;
                column--;
            }
            digmax[i] = temp;
        }
        printMatrix(digmax);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(matrix);
        printDiagonals(matrix);
        System.out.println();
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printMatrix(matrix2);
        printDiagonals(matrix2);
     }
}
