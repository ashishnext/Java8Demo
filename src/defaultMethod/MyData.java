package defaultMethod;

/**
 * Created by gaurav on 15/9/17.
 */
public interface MyData {

    default void print(String str) {
        MyDataImpl.isNullStatic("hello");
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }
}