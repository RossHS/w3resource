package w3resource.basic;

/**
 * Created by Ross on 05.10.2017.
 */
public class Ex17 {

    public static String binaryAddition(String s1, String s2) {
        if (s1 == null || s2 == null) return "";
        int first = s1.length() - 1;
        int second = s2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += s1.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += s2.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (carry > 0)
            sb.append('1');

        sb.reverse();
        return String.valueOf(sb);
    }

    public static long binarySum(long binary1, long binary2) {
        long sum;
        int binary1Size = getBinarySize(binary1);
        int binary2Size = getBinarySize(binary2);
        int[] bin1Array = getBinaryArray(binary1);
        int[] bin2Array = getBinaryArray(binary2);

        return binary1Size;
    }

    private static int getBinarySize(long binary) {
        int binarySize = 0;
        for (long i = binary; i !=  0; binarySize++) {
            i /= 10;
        }
        return binarySize;
    }
    private static int[] getBinaryArray(long binary){
        int binarySize = getBinarySize(binary);
        int[] binArray = new int[binarySize];
        int x= (int) Math.pow(10,binarySize-1);
        for (int i = 0; i > binarySize ; i--) {
            binary/=x;
            binArray[i] =(int) binary;
            x/=10;
        }
        return binArray;
    }

    public static void main(String[] args) {
        System.out.println(binarySum(1000,11100));
        //System.out.println(binaryAddition("100", "101"));
        int x = 123456;
        int sum = 0;
        while(x > 0) {
            sum += x % 10;
            x /= 10;
        }
    }
}
