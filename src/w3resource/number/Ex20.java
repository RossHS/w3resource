package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 11.01.2018
 */
public class Ex20 {
    public static void main(String[] args) {
        double num;
        for (int i = 0; i < 10; i++) {
            num = Math.pow(2, Math.pow(2, i)) + 1;
            System.out.println(num);
        }
    }
}
