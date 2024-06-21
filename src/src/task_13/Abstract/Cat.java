package task_13.Abstract;

public class Cat extends Animal implements AnimalStaff {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeNoise() {
        System.out.println("Meow!!!");
    }

    @Override
    public void poop() {
        System.out.println("lplplplp");
    }
}
