package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex67 {
    public static void main(String[] args) {
        String str = "Java 9";
        String[] strArr = str.split(" ");
        strArr[0] += " Tutorial ";
        for (String i : strArr) {
            System.out.print(i);
        }
    }
}
