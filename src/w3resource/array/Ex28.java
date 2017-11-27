package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 27.11.2017
 */
public class Ex28 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int res;
        int min = num[0], max = num[0];
        for (int aNum : num) {
            if (min > aNum)
                min = aNum;
            if (max < aNum)
                max = aNum;
        }
        res = max - min;
        System.out.println(res);
    }
}
