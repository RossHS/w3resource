package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex60 {
    private static String penultimateWord(String str){
        String[] arr = str.split(" ");
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(penultimateWord(str));
    }
}
