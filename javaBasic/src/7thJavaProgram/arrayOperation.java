class arrayOperation{
    public static void main(String[] args) {
           // create an array
           int[] age = {10, 15, 20, 25, 30};
              // accessing  array elements using index 
            //   System.out.println("Accessing elements of array");
            //   System.out.println("First element: " + age[0]);
            //   System.out.println("5th element: " + age[4]);
            System.out.println("using for loop");
            for(int i = 0; i < age.length; i++){
                System.out.println(age[i]);
            }
    }
}