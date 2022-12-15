// program to practise super keyword and method overloading

class Employee{
    String name;
    String roll;
    int id;
    Employee(String name, String roll, int id) {
        this.name = name;
        this.roll = roll;
        this.id = id;
    }
    public void getDetail(){
        System.out.println("the name of the employee is: " + name);
        System.out.println("the roll of the employee is: " + roll);
        System.out.println("the id of the employee is: " + id);
    }
}

class OnlineEmployee extends Employee{
    String platform;
    OnlineEmployee(String name, String roll, int id, String platform){
        super(name, roll, id);
        this.platform = platform;
    }
    public void getDetail(){
        super.getDetail();
       System.out.println("the platform of the employee is: " + platform);
    }
    // public void getPlatform(){
    //     System.out.println("the platform of the employee is: " + platform);
    // }
}
class main{
    public static void main(String[] args) {
        OnlineEmployee employee1 = new OnlineEmployee("shuvo ", "web developer ", 357, "zoom");
        employee1.getDetail();
    }
}