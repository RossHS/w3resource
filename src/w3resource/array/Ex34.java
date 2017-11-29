package w3resource.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 29.11.2017
 */
public class Ex34 {
    public static void main(String[] args) {
        Integer[] nums = {49, 1, 3, 200, 2, 4, 70, 5};
        int maxSize=0;
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(Arrays.asList(nums));

        for(Integer i : nums){
            boolean exists = false;
            int count=0;
            do{
                count++;
                System.out.println(i+1);
                i++;
                exists= set.contains(i);
                System.out.println("in loop:"+ exists);
            }while(exists);

            if(count > maxSize){
                maxSize = count;
                System.out.println("in condition:"+maxSize);
            }
        }
        System.out.println("Max sequence size:"+ maxSize);
    }
}
