class data1{
    int number = 3;
    int getResult(){
        return number;
    }
}
class data2 extends data1{
    int number = 5;
    @Override
    int getResult(){
        return number;
    }
}
class data{
    public static void main(String[] args) {
        data2 d = new data2();
        System.out.println("the number is: " + d.getResult());
    }
}