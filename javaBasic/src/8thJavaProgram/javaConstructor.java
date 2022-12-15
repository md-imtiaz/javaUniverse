public class javaConstructor{
    String name;
    int age;
    String grade;
    javaConstructor(String name, int age, String grade) {
        this.name = name;
        this.age= age;
        this.grade = grade;
    }
    public void getDetail() {
        System.out.println("the name of the student is: " + this.name);
        System.out.println("the age of the student is: " + this.age);
        System.out.println("the grade of the student is: " + this.grade);
    }
    public static void main(String[] args) {
        javaConstructor student = new javaConstructor("shuvo", 23, "A");
        student.getDetail();
        javaConstructor student1 = new javaConstructor("anas", 9, "A+");
        student1.getDetail();

    }
}