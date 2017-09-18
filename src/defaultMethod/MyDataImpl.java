package defaultMethod;

/**
 * Created by gaurav on 15/9/17.
 */
public class MyDataImpl implements MyData {

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }
    public static boolean isNullStatic(String str) {
        System.out.println("Impl IS Null Static Null Check");

        return str == null ? true : false;
    }

    public static void main(String args[]){
        MyDataImpl obj = new MyDataImpl();
        obj.print("");
        obj.isNull("abc");
        MyData.isNull("heloooooooooooooooo");
    }
}