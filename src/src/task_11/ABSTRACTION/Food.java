package task_11.ABSTRACTION;

abstract class Food {
    public abstract String getType();

    public abstract void eat();

    public void info() {
        System.out.println("This is a type of food.");
    }
}

class Fruit extends Food {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getType() {
        return "Fruit";
    }

    public void eat() {
        System.out.println("Eating the fruit: " + name);
    }
}

class Vegetable extends Food {
    private String name;

    public Vegetable(String name) {
        this.name = name;
    }

    public String getType() {
        return "Vegetable";
    }

    public void eat() {
        System.out.println("Eating the vegetable: " + name);
    }
}

class Meat extends Food {
    private String name;

    public Meat(String name) {
        this.name = name;
    }

    public String getType() {
        return "Meat";
    }

    public void eat() {
        System.out.println("Eating the meat:" + name);
    }
}