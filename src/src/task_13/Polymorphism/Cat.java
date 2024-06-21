package task_13.Polymorphism;

public class Cat extends Animal{
    private String letterPreferences;

    public void eat(){
        System.out.println("nom nom nom");
    }

    public String getLetterPreferences() {
        return letterPreferences;
    }

    public void setLetterPreferences(String letterPreferences) {
        this.letterPreferences = letterPreferences;
    }
}
