package lambda;

/**
 * Created by gaurav on 15/9/17.
 */

class TestType {
    // #2 Method parameter is of type IsTypeOne
    public void first( IsTypeOne one ){
        //#5 Method that is overridden by Lambda will be called.
        one.hasOne();
    }

    //#6 Method parameter is of type IsTypeTwo
    public void second( IsTypeTwo two ){
        //#9 Method that is overridden by Lambda will be called.
        two.hasTwo();
    }

    public void invoke() {
        //#3 Here labmda type is "IsTypeOne", because first() has parameter of type "IsTypeOne"
        //#4 Body {...} of lambda is body part of Overridden hasOne method.
        first(() -> { System.out.println("Invoking first."); });

        //#7 Here labmda type is "IsTypeTwo", because second() has parameter of type "IsTypeTwo"
        //#8 Body {...} of lambda is body part of Overridden hasTwo method.
        second(() -> { System.out.println("Invoking second."); });
    }
}