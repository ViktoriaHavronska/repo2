package task_11.POLYMORPHISM;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        Animal[] animals = {dog, cat, bird};
        for (Animal animal : animals) {
            animal.makeSound();
            animal.displayInfo();
        }

    }
}
