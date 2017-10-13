package w3resource.basic;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex91 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < 100_000; i++) {
            str += i;
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Nanoseconds: " + elapsedTime);
        System.out.println("Seconds: " + TimeUnit.NANOSECONDS.toSeconds(elapsedTime));
    }
}
