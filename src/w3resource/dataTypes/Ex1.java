package w3resource.dataTypes;

/**
 * Created by Ross on 15.10.2017.
 */
public class Ex1 {
    double fahrenheit;

    public Ex1(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }


    double convert(){
        return (fahrenheit-32)/1.8;
    }
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1(212);
        System.out.println(ex1.convert());
    }
}
