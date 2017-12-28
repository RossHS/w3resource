package w3resource.methods;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 28.12.2017
 */
public class Ex13 {
    public static double areaTriangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) return -1;
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public static void main(String[] args) {
        System.out.println(areaTriangle(10,15,20));
    }
}
