package w3resource.dataTypes;

import java.util.Scanner;

/**
 * Created by Ross on 23.10.2017.
 */
public class Ex6 {
    double mass;
    double height;

    Ex6(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    public double BMI() {
        return mass / (height * height);
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Введите массу тела:");
        double mass = 0, height = 0;
        if (sn.hasNextDouble()) {
            mass = sn.nextDouble();
        }
        System.out.println("Введите рост:");
        if (sn.hasNextDouble()) {
            height = sn.nextDouble();
        }
        Ex6 ex6 = new Ex6(mass, height);
        System.out.println(ex6.BMI());

    }
}
