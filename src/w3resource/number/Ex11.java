package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.01.2018
 */
public class Ex11 {
    static boolean isDisarium(int num) {
        int sum = 0;
        int countDigit = Integer.toString(num).length();
        int x = num;
        while (x != 0) {
            int temp = x % 10;
            sum += Math.pow(temp, countDigit--);
            x /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        for (int i = 0; i <=20 ; i++) {
            if(!isDisarium(i) || !Ex10.isHappyNum(i))
                System.out.println(i + " correct");
        }
    }
}
