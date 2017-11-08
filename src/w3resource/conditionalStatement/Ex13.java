package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.11.2017
 */
public class Ex13 {
    int a;

    public static int getCube(int num) {
        return (int) Math.pow(num, 3);
    }

    public static void main(String[] args) {
        System.out.println("cube of 2 is a" + getCube(2));
        System.out.println("cube of 4 is a" + getCube(4));
        System.out.println("cube of 5 is a" + getCube(5));
    }
}
