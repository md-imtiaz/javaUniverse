class LogicalOperators{
    public static void main(String args[]){
        int a = 5, b = 7;
        boolean resultOne, resultTwo, resultThree, resultFour;
        resultOne = (a < b) && (b>a);
        resultTwo = (b < a) || (a > b);
        a = 5;
        b = 5;
        resultThree = (a != b);
        resultFour = (a == b);
        System.out.println("result of and operator is: " + resultOne);
        System.out.println("result of or operator is: " + resultTwo);
        System.out.println("result of != operator is: " + resultThree);
        System.out.println("result of == operator is: " + resultFour);
    }
}