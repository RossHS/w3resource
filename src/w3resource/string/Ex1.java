package w3resource.string;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 01.12.2017
 */
public class Ex1 {
    public static void main(String[] args) {
        String str = "Java Rules!";
        try(Scanner scanner = new Scanner(System.in)) {
            while(scanner.hasNextInt())
                System.out.println(str.charAt(scanner.nextInt()));
        } catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
