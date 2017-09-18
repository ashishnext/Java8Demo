package methodRefrence;

/**
 * Created by gaurav on 15/9/17.
 */
public class StaticReference {
    public static void bodyRun() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Square of i is::" + (i * i));
        }
    }

    public static void main(String args[]) {
        new Thread(StaticReference::bodyRun).start();
    }

}
