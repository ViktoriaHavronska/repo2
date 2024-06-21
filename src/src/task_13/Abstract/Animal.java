package task_13.Abstract;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeNoise();

    public void printName() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
