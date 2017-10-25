package w3resource.dataTypes;

import java.util.Scanner;

/**
 * Created by Ross on 25.10.2017.
 */
public class Ex7 {
    private int distance;
    private int hour, minute, second;
    double timeInSecond;

    public Ex7(int distance, int hour, int minute, int second) {
        this.distance = distance;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        timeInSecond = (hour*3600) + (minute*60) + second;
        getSpeed();
    }

    void getSpeed() {
        System.out.println("Скорость в метрах в секунду " + distance/timeInSecond);
        System.out.println("Скорость в километрах в час " + (distance/1000)/(timeInSecond/3600));
        System.out.println("Скорость в милях в час " + (distance/1000)/(timeInSecond/3600)/1.609);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дистанцию");
        int dist = sc.nextInt();
        System.out.println("Введите время в часах");
        int hour = sc.nextInt();
        System.out.println("Введите время в минутах");
        int minute = sc.nextInt();
        System.out.println("Введите время в секундах");
        int sec = sc.nextInt();
        Ex7 Man = new Ex7(dist, hour, minute, sec);
    }
}
