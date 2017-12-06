package w3resource.string;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.12.2017
 */
public class Ex22 {
    public static void main(String[] args) {
        String str;
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                str = sc.nextLine();
                System.out.println("Lenght of given String:" + str.length());
            }
        }
    }
}
