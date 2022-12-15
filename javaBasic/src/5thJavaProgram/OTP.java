// I create this program for practicing if statement
import java.util.Scanner;

class OTP{
    public static void main(String args[]){
        int myOTP = 2022;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter OTP:");
        int userInput = input.nextInt();
        if (userInput == myOTP){
            System.out.println("varification complete! ");
        }
        else{
        System.out.println("sorry your OTP isn't meche! ");
        }
    }
}