class Operators{
    public static void main(String args[]){
        int a = 5, b= 5;
        int result = a + b;
        int resultOne = (a - b);
        int resultTwo = (a * b);
        a = 20;
        b = 2;
        int resultThree = (a / b);
        a = 17;
        b = 3;
        int resultFour = (a % b);
        // floor division in Java like this:
        int resultFive = (a / b);
        // System.out.println(" result of floor division:" + Math.floor(resultFive));
        System.out.println(" result of floor division is: " + Math.floorDiv(19, 5));
        System.out.println(" result of arithmetic operator is: " + resultFive);
    }
}