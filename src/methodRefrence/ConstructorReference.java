package methodRefrence;

/**
 * Created by gaurav on 15/9/17.
 */
public class ConstructorReference {
    private String content;

    public ConstructorReference() {
        this.content = "Created By constructor Reference";
    }

    public String getContent() {
        return content;
    }
    public static void main(String args[]) {
        ConstructorReferenceArg<ConstructorReference> constructorReferenceArg= ConstructorReference::new;
        System.out.println("ConstructorReference::"+constructorReferenceArg.callingMethod().getContent());
    }
}
