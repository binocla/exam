package task2.models;

import task2.interfaces.Alarm;

public class Tutor extends Human implements Alarm {
    private String currSubject;
    private Student favouriteStudent;

    private String alarmWakeCooking;

    public Tutor(String name, int age, boolean gender, String currSubject, Student favouriteStudent, String alarmWakeCooking) {
        super(name, age, gender);
        this.currSubject = currSubject;
        this.favouriteStudent = favouriteStudent;
        this.alarmWakeCooking = alarmWakeCooking;
    }

    public Tutor(String name, String currSubject) {
        super(name);
        this.currSubject = currSubject;
    }

    public String getCurrSubject() {
        return currSubject;
    }

    public void setCurrSubject(String currSubject) {
        this.currSubject = currSubject;
    }

    public Student getFavouriteStudent() {
        return favouriteStudent;
    }

    public void setFavouriteStudent(Student favouriteStudent) {
        this.favouriteStudent = favouriteStudent;
    }

    public String getAlarmWakeCooking() {
        return alarmWakeCooking;
    }

    public void setAlarmWakeCooking(String alarmWakeCooking) {
        this.alarmWakeCooking = alarmWakeCooking;
    }

    @Override
    public void changeAlarm(String newAlarm) {
        alarmWakeCooking = newAlarm;
    }

    @Override
    public boolean isDisabled() {
        return "".equalsIgnoreCase(alarmWakeCooking);
    }
}
