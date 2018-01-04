package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.01.2018
 */
public class Ex7 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 0; i <10 ; i++) {
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
        }
    }
}
