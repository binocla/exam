package task2.models;

public class Main {
    public static void main(String[] args) {
        var physics = new Physics("RU");
        var subj = (Subject) physics;

        var tutor = new Tutor("Sergey", "Java");
        var student1 = new Student("Sergey", 21, true, 1000.);

        System.out.println(tutor.isDisabled());
        System.out.println(student1.isDisabled());
    }
}
