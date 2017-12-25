package w3resource.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class Ex2 {
    public static int getAverage(List<Integer> arr) {
        if (arr == null || arr.size() == 0) return 0;
        int sum = 0;
        for (Integer anArr : arr) {
            sum += anArr;
        }
        return sum / arr.size();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        }
        System.out.println(getAverage(list));
    }
}
