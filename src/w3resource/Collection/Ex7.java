package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 05.02.2018
 */
public class Ex7 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        try(Scanner scanner = new Scanner(System.in)){
            while(scanner.hasNextInt()){
                if (integerArrayList.contains(scanner.nextInt())) System.out.println("Есть такой элемент");
                else System.out.println("Нет такого элемента");
            }
        }
    }
}
