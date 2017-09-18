package Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaurav on 15/9/17.
 */
public class StreamExample {
    public static void main(String args[]) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 20; i++) myList.add(i);
        System.out.println(sumStream(myList));
    }

    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }
}
