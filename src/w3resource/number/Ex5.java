package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.01.2018
 */
public class Ex5 {
    public static boolean isLychrel(long num) {
        return isLychrelIner(num, 0);
    }

    private static boolean isLychrelIner(long num, int counter) {
        String strOrig = Long.toString(num);
        String strRev = "";
        for (int i = strOrig.length() - 1; i >= 0; i--) {
            strRev += strOrig.charAt(i);
        }
        long sum = Long.parseLong(strOrig) + Long.parseLong(strRev);
        counter++;
        if (counter == 30) return false;
        if (isPalindrome(sum)) return true;
        return isLychrelIner(sum, counter);
    }

    public static boolean isPalindrome(long num) {
        String str1 = String.valueOf(num);
        for (int i = 0, j = str1.length() - 1; i < str1.length() / 2; i++, j--) {
            if (str1.charAt(i) != str1.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws NumberFormatException {
        int counter = 0;
        for (int i = 1; i < 10_000; i++) {
            if (!isLychrel(i)) {
                System.out.print(i + " ");
                counter++;
            }
        }
        System.out.println("\n" + counter);
    }
}
