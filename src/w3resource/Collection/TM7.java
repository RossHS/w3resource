package w3resource.Collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 11.04.2018
 */
public class TM7 {
    static class A implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            int[] a1 = helper(o1);
            int[] a2 = helper(o2);
            if (a1 == null || a2 == null) return 0;
            for (int i = 0; i < a1.length && i < a2.length; i++) {
                if(a1[i] > a2[i]) return 1;
            }
            return -1;
        }

        private static int[] helper(int a) {
            if (a < 0) return null;
            int size = Integer.toString(a).length();
            int[] arr = new int[size];
            int temp = a;
            for (int i = size - 1; temp > 0; i--) {
                int val = temp % 10;
                arr[i] = val;
                temp /= 10;
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        A a = new A();
        Map<Integer, String> integerStringMap = new TreeMap<>(a);
        integerStringMap.put(100, "Ad");
        integerStringMap.put(111000, "aD");
        integerStringMap.put(2, "v");
        integerStringMap.put(191, "d");
        System.out.println(integerStringMap);

    }
}
