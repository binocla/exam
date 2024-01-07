package task2.models;

import task2.interfaces.SubjectProgress;

import java.util.Random;

public class Physics extends Subject implements SubjectProgress {

    private Tutor tutor;
    private Student[] students;
    private String language;

    public Physics(Tutor tutor, Student[] students, String language) {
        this(language);
        this.tutor = tutor;
        this.students = students;
    }

    public Physics(String language) {
        this.language = language;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String showName() {
        return "Physics!";
    }

    @Override
    public double showSubjectProgress() {
        return new Random().nextDouble(0.0, 1.0);
    }
}
