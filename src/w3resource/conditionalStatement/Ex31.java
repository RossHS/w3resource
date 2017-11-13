package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 13.11.2017
 */
public class Ex31 {
    //the same code
    public static String test(int... num) {
        int incres = 1;
        int decres = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i - 1] > num[i]) decres++;
            else incres++;
        }
        if (incres == num.length) return "Increase";
        else if (decres == num.length) return "Decrease";
        else return "Neither increasing or decreasing order";
    }

    public static void main(String[] args) {
        int incres = 1;
        int decres = 1;
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i - 1]) > Integer.parseInt(args[i])) decres++;
            else incres++;
        }
        if (incres == args.length) System.out.println("Increase");
        else if (decres == args.length) System.out.println("Decrease");
        else System.out.println("Neither increasing or decreasing order");
    }
}
