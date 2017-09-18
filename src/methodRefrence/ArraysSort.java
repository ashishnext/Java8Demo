package methodRefrence;

import java.util.Arrays;

/**
 * Created by gaurav on 15/9/17.
 */
public class ArraysSort {
    public static void main(String args[]) {
        String [] array={"abc","fgh","def","fgh","gfd","fde"};
        Arrays.sort(array,String::compareToIgnoreCase);
        for(String s:array){
            System.out.println("----:"+s);
        }
    }
}
