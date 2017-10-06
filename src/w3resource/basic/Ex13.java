package w3resource.basic;

/**
 * Created by Ross on 05.10.2017.
 */
public class Ex13 {
    private double width, height;
    private double area;
    private double perimeter;

    public Ex13(double width, double height) {
        this.width = width;
        this.height = height;
        setUp();
    }

    private void setUp() {
        area = width * height;
        perimeter = 2 * (width + height);
    }

    @Override
    public String toString() {
        return "width = " + width + "\nheight = " + height + "\nArea = " + area + "\nPerimeter = " + perimeter;
    }

    public static void main(String[] args) {
        Ex13 ex13 = new Ex13(5.5, 8.5);
        System.out.println(ex13);
    }
}

