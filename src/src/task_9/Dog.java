package task_9;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println(super.getName() + " is fetching the ball");
    }
}
