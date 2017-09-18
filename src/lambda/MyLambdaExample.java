package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gaurav on 15/9/17.
 */
public class MyLambdaExample {
    public static void main(String args[]) {

        //Print a list of integers with a lambda
        List<Integer> intSeq = Arrays.asList(1, 2, 3);

        intSeq.forEach(x -> System.out.println("Print a list of integers with a lambda::" + x));

        //A multiline lambda
//        List<Integer> intSeq = Arrays.asList(1, 2, 3);

        intSeq.forEach(x -> {
            x += 2;
            System.out.println("A multiline lambda:::" + x);
        });

//        A lambda with a defined local variable

        intSeq.forEach(x -> {
            int y = x * 2;
            System.out.println("A lambda with a defined local variable::"+y);
        });

        int var = 10;
        intSeq.forEach(x -> System.out.println("--Variable capture--"+(x + var)));

    }
}
