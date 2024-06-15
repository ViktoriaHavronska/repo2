package task_9;

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.makeSound();

        Dog dog = new Dog("Rex");
        dog.makeSound();
        dog.fetch();
    }
}

