package w3resource.basic;

/**
 * Created by Ross on 05.10.2017.
 */
public class Ex15 {
    int a;
    int b;

    Ex15(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        int temp = this.a;
        this.a = this.b;
        this.b = temp;
    }

    public static void main(String[] args) {
        Ex15 test = new Ex15(10, 15);
        System.out.println(test.a + " " + test.b);
        test.swap();
        System.out.println(test.a + " " + test.b);
    }
}
