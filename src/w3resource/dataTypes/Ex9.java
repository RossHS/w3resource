package w3resource.dataTypes;

/**
 * Created by Ross on 03.11.2017.
 */
public class Ex9<T extends Number, V extends T> {
    T a;
    V b;

    Ex9(T a, V b) {
        this.a = a;
        this.b = b;
        test();
    }

    private void test() {
        System.out.println("sum " + (a.doubleValue() + b.doubleValue()));
        System.out.println("Product " + (a.doubleValue() * b.doubleValue()));
        System.out.println("Difference" + (a.doubleValue() - b.doubleValue()));
        System.out.println("Average " + (a.doubleValue() + b.doubleValue()) / 2);
        System.out.println("Max " + Math.max(a.doubleValue(), b.doubleValue()));
        System.out.println("Min " + Math.min(a.doubleValue(), b.doubleValue()));
    }

    public static void main(String[] args) {
        Ex9<Integer, Integer> test = new Ex9<>(2, 10);
    }
}
