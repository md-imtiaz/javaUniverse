import java.util.function.DoubleUnaryOperator;

public class javaFinalKeyword{
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println("the value of PI is: " + PI);
        final double PI = 3.15;
        System.out.println("the value of pi after changing value is: " + PI);
    }
}