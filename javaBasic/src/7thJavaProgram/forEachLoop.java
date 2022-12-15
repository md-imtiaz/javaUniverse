import java.util.Scanner;

class forEachLoop{
    public static void main(String[] args) {
        int[] marks = new int[6];
        Scanner input = new Scanner(System.in);
        System.out.print("enter your mark:");
        for (int mark : marks){
            mark = input.nextInt();
            System.out.print(mark);
        }
    }
}