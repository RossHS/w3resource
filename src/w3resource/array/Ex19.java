package w3resource.array;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 21.11.2017
 */
public class Ex19 {
    private static Scanner scanner;

    static void fillTheMatrix(int[][] matrix) {
        System.out.println("Заполните матрицу цифрами");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int rows = 0, columns = 0;
        scanner = new Scanner(System.in);
        System.out.println("Введите количество рядом матрицы");
        rows = scanner.nextInt();
        System.out.println("Введите количество колонок матрицы");
        columns = scanner.nextInt();


        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        fillTheMatrix(matrix1);
        fillTheMatrix(matrix2);
        scanner.close();
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(matrix1);
        printMatrix(matrix2);
        printMatrix(sum);
    }
}
