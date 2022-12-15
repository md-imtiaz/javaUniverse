public class StudentResult{
    String name = "shuvo";
    int age = 23;
    String grade = "A";
    public String updateGrade(String newGrade){
        grade = newGrade;
        return grade;
    }
    public void getInfo(){
        System.out.println("the name of the Student is: " + name);
        System.out.println("the age of the student is: " + age);
        System.out.println("your grade is: " + grade);
    }
    public static void main(String[] args) {
        StudentResult student1 = new StudentResult();
        student1.name = "Anas";
        student1.age = 5;
        student1.grade = "B";
        student1.getInfo();
        student1.updateGrade("A+");
        student1.getInfo();
    }
}