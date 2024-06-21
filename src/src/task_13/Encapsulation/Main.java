package task_13.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Suzie");
        System.out.println(student.getName());

        student.setAge(18);
        System.out.println(student.getAge());


        student.setName("Tommy");
        student.setAge(17);

        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
