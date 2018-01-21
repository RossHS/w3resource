package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 22.01.2018
 */
public class Ex25 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2);
        for (int i = 0; i < 15; i++) {
            int num3 = num2 * 2 + num1;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
