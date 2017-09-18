package methodRefrence;


/**
 * Created by gaurav on 15/9/17.
 */
public class ObjMethodReference {
     public void startsWith(String a, String b) {
        System.out.println(String.valueOf(a.charAt(0)));
        System.out.println(String.valueOf(b.charAt(0)));
    }

    public static void main(String args[]) {
        ObjMethodReference objMethodReference = new ObjMethodReference();

        // Referring non-static method using reference
        Convertor<String, String> convertor = objMethodReference::startsWith;

        // Calling interface method
        convertor.convert("Hello","gaurav");

        // Referring non-static method using anonymous object
        Convertor<String, String> convertor1= new ObjMethodReference()::startsWith; // You can use anonymous object also

        // Calling interface method
        convertor.convert("hello","Gaurav");
    }

}
