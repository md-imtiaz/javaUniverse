import java.util.Scanner;
class userInput{
    public static void main(String args[]){
        Scanner userName = new Scanner(System.in);
        System.out.println(" enter your name, age and salary:");
        String name = userName.nextLine();
        int age = userName.nextInt();
        float salary = userName.nextFloat();
        System.out.println(" your name is:" + name);
        System.out.println(" your age is:" + age);
        System.out.println(" your salary is:" + salary);
        userName.close();
    }
}