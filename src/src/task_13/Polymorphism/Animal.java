package task_13.Polymorphism;

public class Animal {
    private String name;
    private String age;

    public void eat(){
        System.out.println("munch");
    }

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }
}
