package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 12.11.2017
 */
public class Ex29 {
    public static void main(String[] args) {
        int result = 0;
        int number = -1234;
        while(number!=0){
            number/=10;
            result++;
        }
        System.out.println(result);
    }
}
