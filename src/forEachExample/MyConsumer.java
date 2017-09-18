package forEachExample;

import java.util.function.Consumer;

/**
 * Created by gaurav on 15/9/17.
 */
class MyConsumer implements Consumer<Integer> {
    public void accept(Integer t) {
        System.out.println("Consumer impl Value::" + t);
    }


}
