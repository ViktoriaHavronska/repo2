package task_11.POLYMORPHISM;

public class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }

    public void displayInfo() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }

    public void displayInfo() {
        System.out.println("This is a dog ");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a cat.");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tweet");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a bird.");
    }
}