package task_11.ABSTRACTION;

public class Main {
    public static void main(String[] args) {
        Food fruit = new Fruit("Apple");
        Food vegetable = new Vegetable("Carrot");
        Food meat = new Meat("Chicken");

        fruit.eat();
        System.out.println(fruit.getType());
        fruit.info();

        vegetable.eat();
        System.out.println(vegetable.getType());
        vegetable.info();

        meat.eat();
        System.out.println(meat.getType());
        meat.info();
    }
}
