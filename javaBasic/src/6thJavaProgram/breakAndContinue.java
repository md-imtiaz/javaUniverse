public class breakAndContinue{
    public static void main(String[] args) {
        int num;
        for (num = 1; num < 11; num++){
            // System.out.println(num);
            if (num == 8){
                // continue;
                break;
            }
            System.out.println("With out ate " + num);
        }
    }
}