package task_13.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat(3);


        Cat cat = new Cat();
        cat.eat();


    }
}
