package w3resource.number;

import java.util.Random;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 02.01.2018
 */
public class Ex3 {
    public static int randomIntRange(int begin, int end) {
        Random random = new Random();
        return random.nextInt(end - begin + 1) + begin;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(randomIntRange(3, 5));
        }
    }
}
