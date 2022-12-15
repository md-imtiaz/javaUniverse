// java polymorphism

public class Calculator{
    int result;
    int addition(int num1, int num2){
        result = num1 + num2;
        return result;
    }
    int addition(int num1, int num2, int num3){
        result = num1 + num2 + num3;
        return result;
    }
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        System.out.println("Method with two parameters: " + calc1.addition(5, 10));
        System.out.println("Method with three parameters: " + calc1.addition(10, 15, 20));
    }
}