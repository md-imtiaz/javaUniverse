import java.util.Scanner;

class mySwiches{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade:");
        String grade = input.nextLine();
        switch (grade) {
            case "A":
                System.out.println("Excellent result!");
                break;
        case "B":
        System.out.println("Good result!");
        break;
        case "C":
        System.out.println("Less than Good result!");
        break;
        case "F":
        System.out.println("Sorry, you are fail the exam!");
        break;
            default:
            System.out.println("Invalid input!");
                break;
        }
    }
}