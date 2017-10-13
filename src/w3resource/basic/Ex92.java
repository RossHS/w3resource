package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex92 {
    int odd = 0;
    int even = 0;

    public void getEvenAndOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) even++;
            if (array[i] % 2 != 0) odd++;
        }
    }

    @Override
    public String toString() {
        return "Odd: " + odd + "\nEven: " + even;
    }

    public static void main(String[] args) {
        Ex92 test = new Ex92();
        int[] array = {1, -2, 2, 3, 4, 10, 15, 13, -3};
        test.getEvenAndOdd(array);
        System.out.println(test);
    }
}
