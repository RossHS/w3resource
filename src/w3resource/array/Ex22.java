package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 26.11.2017
 */
public class Ex22 {
    private String name;
    private int age;

    Ex22(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Ex22 otherEx22 = (Ex22) obj;
        return name.equals(otherEx22.name) && age == otherEx22.age;
    }
}

class Ex22Test {
    public static void main(String[] args) {
        Ex22[] a = new Ex22[3];
        a[0] = new Ex22("A", 1);
        a[1] = new Ex22("B", 2);
        a[2] = new Ex22("C", 3);
        Ex22[] b = new Ex22[3];
        b[0] = new Ex22("A", 1);
        b[1] = new Ex22("B", 2);
        b[2] = new Ex22("C", 3);
        System.out.println(Arrays.equals(a, b));
    }
}
