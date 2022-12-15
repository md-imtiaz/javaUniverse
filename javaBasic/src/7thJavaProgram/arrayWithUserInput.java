import java.util.Scanner;
class arrayWithUserInput{
    public static void main(String[] args) {
        int[] marks = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("enter your mark:");
        for (int i = 0; i < marks.length; i++){
            marks[i] = input.nextInt();
        }
        System.out.println("all marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}