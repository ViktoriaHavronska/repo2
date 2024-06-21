package task_13.Inheritance;

public class Main {
    public static void main(String[] args) {
        Mause_1 m1 = new Mause_1();

        m1.leftClick();
        m1.rightClick();
        m1.scrolUp();
        m1.scrolDown();

        Mause_2 m2 = new Mause_2();

        m2.leftClick();
        m2.rightClick();
        m2.scrolUp();
        m2.scrolDown();

        m2.connect();

        Mause_3 m3 = new Mause_3();

        m3.leftClick();
        m3.rightClick();
        m3.scrolUp();
        m3.scrolDown();

    }
}
