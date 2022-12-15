import java.util.Scanner;
public class Student{
    String name;
    int age;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Student student1 = new Student();
    student1.name = input.nextLine();
    System.out.println("enter your name:");
    student1.age = input.nextInt();
    System.out.println("Enter your age: ");
    if (student1.age <= 18){
    System.out.println(" drink a cup of milk");
    }
    else if (student1.age <= 20){
        System.out.println("Give focus on your career");
    }
    else{
        System.out.println("You can now watch a movie");
    }
}        
}