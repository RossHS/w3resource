package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 10.10.2017.
 */
public class Ex55 {
    private int sec = 0;
    private int hour = 0;
    private int minute = 0;

    Ex55(int sec) {
        this.sec = sec % 60;
        this.hour = (sec / 60) / 60;
        this.minute = (sec / 60) % 60;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + sec;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds to convent");
        Ex55 ex55 = new Ex55(scanner.nextInt());
        System.out.println(ex55);
    }
}
