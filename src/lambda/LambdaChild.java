package lambda;

/**
 * Created by gaurav on 15/9/17.
 */


class LambdaChild {
    // With Anonymous class.
    IsFunctional isFunc = new IsFunctional() {
        @Override
        public void testMethod(String data) {
            System.out.println("Printing " + data + " from Anonymous class.");
        }
    };

    // With lambda expression.
    IsFunctional func = (demoData ) -> {
        System.out.println("Printing " + demoData + " from Lambda expression.");
    };
}