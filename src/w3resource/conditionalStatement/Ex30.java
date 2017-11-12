package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 12.11.2017
 */
public class Ex30 {
    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println("Вы ввели 1 элемент");
        } else {
            for (int i = 1; i < args.length; i++) {
                if (!args[i - 1].equals(args[i])) {
                    System.out.println("Числа не равны");
                    return;
                }
            }
            System.out.println("Числа равны");
        }
    }
}
