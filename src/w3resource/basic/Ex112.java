package w3resource.basic;

/**
 * Created by Ross on 15.10.2017.
 */
public class Ex112 {
    int getFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    int getFactorialTrailingZeros(int num) {
        int factorial = getFactorial(num);
        int zeroes = 0;
        System.out.println("Factorial " + num + " = " + factorial);
        while (factorial % 10 == 0) {
            zeroes++;
            factorial /= 10;
        }
        return zeroes;
    }

    public static void main(String[] args) {
        Ex112 test = new Ex112();
        System.out.println("Trailing zeros = " + test.getFactorialTrailingZeros(7));
    }
}