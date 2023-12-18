package Org.Learning.lamdaFunctionLearning;

public class SimpleLambdaExample {
    public static void main(String[] args) {
        // Using lambda expression to implement the 'Operation' interface
        Operation addition = (a, b) -> {
            return a + b;
        };
        Operation subtraction = (a, b) -> {
            return a - b;
        };

        // Performing operations using lambda expressions
        int resultAddition = addition.perform(5, 3);
        int resultSubtraction = subtraction.perform(8, 4);

        // Displaying the results
        System.out.println("Result of addition: " + resultAddition);
        System.out.println("Result of subtraction: " + resultSubtraction);
    }
}
