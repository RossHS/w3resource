package w3resource.number;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 07.01.2018
 */
public class Ex14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                int sqr = num * num;
                String s = Integer.toString(sqr);
                if (s.endsWith(Integer.toString(num)))
                    System.out.println(num + " подходит");
                else System.out.println(num + " не подходит");
            }
        }
    }
}
