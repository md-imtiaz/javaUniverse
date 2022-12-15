abstract class behavior{
    abstract void makeSound();
    public void eat(){
        System.out.println("I can eat chicken");
    }
}
class Dog extends behavior{
    public void makeSound(){
        System.out.println("Bark bark");
    }
}
class Cat extends behavior{
    public void makeSound(){
        System.out.println("Meow meow");
    }
    public void eat(){
        System.out.println("I can drink milk");
    }
}
class Animal{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.makeSound();
        d1.eat();
        c1.makeSound();
        c1.eat();
    }
}