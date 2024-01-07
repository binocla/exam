package task2.models;

public class Human {
    private String name;
    private int age;
    private boolean gender;

    public Human(String name, int age, boolean gender) {
        this(name);
        this.age = age;
        this.gender = gender;
    }

    public Human(String name) {
        this.name = name;
    }

    // todo
}
