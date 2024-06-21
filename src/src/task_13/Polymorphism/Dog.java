package task_13.Polymorphism;

public class Dog extends Animal{
    private int breed;
    public void eat(){
        System.out.println("chomp chomp");
    }

    public void eat(int numb){
        for (int i = 0; i < numb; i++) {
            System.out.println("chomp chomp");
        }
    }

    public int getBreed(){
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}
