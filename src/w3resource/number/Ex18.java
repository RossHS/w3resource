package w3resource.number;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 10.01.2018
 */
public class Ex18 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            while(scanner.hasNextInt()){
                double temp = scanner.nextInt();
                int num = (int)Math.round( Math.pow(temp, 1.0/3.0));

                if(temp == Math.pow(num,3)) System.out.println("OK");
                else System.out.println("not");
            }
        }
    }
}
