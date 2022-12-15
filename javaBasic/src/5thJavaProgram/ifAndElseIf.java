import java.util.Scanner;

class ifAndElseIf{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = input.nextInt();
        if (number > 0){
            System.out.println("It's a positive number!");
        }
        else if(number < 0){
            System.out.println("it's a negative number!");
        }
        else{
            System.out.println("It's Zero!");
        }
    }
}