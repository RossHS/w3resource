package w3resource.string;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 05.12.2017
 */
public class Ex19 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        int count = 0;
        char[] chars = new char[10];
        for (char i = 'a'; i <= 'z'; i++, count++) {
            chars[count] = i;
            System.out.print(i + "\t");
            if (count != 0 && ((count + 1) % 10 == 0) || i == 'z') {
                System.out.println();
                for (int j = 0; j <= count; j++) {
                    System.out.print("====");
                }
                System.out.println();
                for (char aChar : chars) {
                    System.out.print(str.indexOf(aChar) + "\t");
                    if (aChar == 'z') break;
                }
                count = -1;
                System.out.println("\n");
            }
        }
    }
}

