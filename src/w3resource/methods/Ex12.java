package w3resource.methods;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 28.12.2017
 */
public class Ex12 {
    public static void printNbyNMatrix(int matrixSize){
        for (int i = 0; i < matrixSize*matrixSize ; i++) {
            if(i % matrixSize == 0) System.out.println();
            System.out.print((int)(Math.random()*10) + " ");
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            while(scanner.hasNextInt()){
                printNbyNMatrix(scanner.nextInt());
            }
        }
    }
}
