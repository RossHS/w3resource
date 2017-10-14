package w3resource.basic;

/**
 * Created by Ross on 14.10.2017.
 */
public class Ex109 {

    static void printSteps(int steps) {
        int count = steps;
        int i = 0;
        while (count != 0) {
            int j = 0;
            while (j <= i && count != 0) {
                System.out.print("#");
                j++;
                count--;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        printSteps(5);
    }
}
